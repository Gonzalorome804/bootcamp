package globant.appFarmer.services;

import globant.appFarmer.dto.UserDto;
import globant.appFarmer.entities.User;
import globant.appFarmer.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper mapper;

    //whit this method create a user
    public UserDto createUser(UserDto user) {
        User validateUser = userRepository.findByUserName(user.getUserName());

        if (validateUser != null) {
            throw new RuntimeException("this userName already exists");
        }

        User userToCreate = new User();
        userToCreate.setEmail(user.getEmail());
        userToCreate.setPassword(user.getPassword());
        userToCreate.setUserName(user.getUserName());
        userToCreate.setFirstName(user.getFirstName());
        userToCreate.setLastName(user.getLastName());

        User userToReturn = userRepository.save(userToCreate);
        return mapper.map(userToReturn, UserDto.class);
    }

    //whit this method update a user specific
    public UserDto updateUser(long id, UserDto user) {
        User userEntity = userRepository.findById(id);
        if (userEntity == null) {
            throw new RuntimeException("user does not exist.");
        }
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setUserName(user.getUserName());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());

        User userToReturn = userRepository.save(userEntity);
        return mapper.map(userToReturn, UserDto.class);
    }

    //whit this delete a user specific
    public void deleteUser(long id) {
        User userToDelete = userRepository.findById(id);
        userRepository.delete(userToDelete);
    }

    //whit this method list all users
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAllByOrderByFirstName();
        List<UserDto> userDtos = new ArrayList<>();
        users.forEach(r -> userDtos.add(mapper.map(r, UserDto.class)));
        return userDtos;
    }

    //whit this method list user that have the same firstName
    public List<UserDto> getUsersByFirstName(String firstName) {
        List<User> userEntity = userRepository.findByFirstNameContaining(firstName);
        List<UserDto> usersDto = new ArrayList<>();
        userEntity.forEach(u -> usersDto.add(mapper.map(u, UserDto.class)));
        return usersDto;
    }

    //whit this method get user that have the firstName specified
    public UserDto getUserByUserName(String userName) {
        User userEntity = userRepository.findByUserName(userName);
        if (userEntity == null) {
            throw new RuntimeException("user does not exist.");
        }

        return mapper.map(userEntity, UserDto.class);
    }


}
