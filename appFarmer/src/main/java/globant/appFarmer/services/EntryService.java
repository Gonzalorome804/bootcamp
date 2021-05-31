package globant.appFarmer.services;

import globant.appFarmer.dto.EntryCreationDto;
import globant.appFarmer.dto.EntryDto;
import globant.appFarmer.entities.BoxEgg;
import globant.appFarmer.entities.Entry;
import globant.appFarmer.entities.User;
import globant.appFarmer.repository.BoxEggRepository;
import globant.appFarmer.repository.EntryRepository;
import globant.appFarmer.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

    @Autowired
    EntryRepository entryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoxEggRepository boxEggRepository;

    @Autowired
    ModelMapper mapper;

    //create an entry and update the stock of the corresponding box
    public EntryDto createEntry(EntryCreationDto entryCreationDto) {
        User userEntity = userRepository.findById(entryCreationDto.getUser());
        if (userEntity == null) throw new RuntimeException("the specified user does not exist.");
        BoxEgg boxEggEntity = boxEggRepository.findById(entryCreationDto.getBox());
        if (boxEggEntity == null) throw new RuntimeException("the specified box does not exist.");

        Entry entryEntity = new Entry();
        entryEntity.setUser(userEntity);
        entryEntity.setBox(boxEggEntity);
        entryEntity.setQuantity(entryCreationDto.getQuantity());

        boxEggEntity.setStock(boxEggEntity.getStock() + entryCreationDto.getQuantity());
        boxEggRepository.save(boxEggEntity);

        Entry entryCreated = entryRepository.save(entryEntity);

        return mapper.map(entryCreated, EntryDto.class);
    }

}
