package globant.appFarmer.services;


import globant.appFarmer.dto.BuyDto;
import globant.appFarmer.entities.BoxEgg;
import globant.appFarmer.entities.Buy;
import globant.appFarmer.entities.User;
import globant.appFarmer.repository.BoxEggRepository;
import globant.appFarmer.repository.BuyRepository;
import globant.appFarmer.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BuyService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoxEggRepository boxEggRepository;

    @Autowired
    BuyRepository buyRepository;

    @Autowired
    ModelMapper mapper;

    //With this method I register a buy
    public BuyDto createBuy(long userId, long boxId, int quantity) {
        User userEntity = userRepository.findById(userId);
        if (userEntity == null) throw new RuntimeException("the specified user does not exist");
        BoxEgg boxEggEntity = boxEggRepository.findById(boxId);
        if (boxEggEntity == null) throw new RuntimeException("the specified box does not exist.");

        if (boxEggEntity.getStock() - quantity < 0)
            throw new RuntimeException("we do not have stock necessary, only have " + boxEggEntity.getStock() + " boxes ");

        Buy buyEntity = new Buy();
        buyEntity.setBox(boxEggEntity);
        buyEntity.setUser(userEntity);
        buyEntity.setQuantity(quantity);
        buyEntity.setTotal(BigDecimal.valueOf(quantity).multiply(boxEggEntity.getPrice()));

        boxEggEntity.setStock(boxEggEntity.getStock() - quantity);

        Buy buySaved = buyRepository.save(buyEntity);
        return mapper.map(buySaved, BuyDto.class);

    }

}
