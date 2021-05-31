package globant.appFarmer.services;

import globant.appFarmer.dto.BoxEggCreationDto;
import globant.appFarmer.dto.BoxEggDto;
import globant.appFarmer.entities.BoxEgg;
import globant.appFarmer.entities.ColorEgg;
import globant.appFarmer.repository.BoxEggRepository;
import globant.appFarmer.repository.ColorEggRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxEggService {

    @Autowired
    BoxEggRepository boxEggRepository;

    @Autowired
    ColorEggRepository colorEggRepository;

    @Autowired
    ModelMapper mapper;

    //whit this method create a box
    public BoxEggDto createBox(BoxEggCreationDto box) {
        ColorEgg colorEgg = colorEggRepository.findById(box.getColor());
        if (colorEgg == null) throw new RuntimeException("the specified color does not exist.");


        BoxEgg boxToCreate = new BoxEgg();
        boxToCreate.setQuantityEgg(box.getQuantityEgg());
        boxToCreate.setColor(colorEgg);
        boxToCreate.setStock(box.getStock());
        boxToCreate.setPrice(box.getPrice());

        BoxEgg boxToReturn = boxEggRepository.save(boxToCreate);
        return mapper.map(boxToReturn, BoxEggDto.class);
    }

    //whit this update the specified
    public BoxEggDto updateBox(long id, BoxEggCreationDto box) {
        BoxEgg boxEntity = boxEggRepository.findById(id);
        if (boxEntity == null) throw new RuntimeException("the specified box does not exist.");
        boxEntity.setPrice(box.getPrice());
        BoxEgg boxToReturn = boxEggRepository.save(boxEntity);
        return mapper.map(boxToReturn, BoxEggDto.class);
    }


}
