package globant.appFarmer.controllers;

import globant.appFarmer.dto.*;
import globant.appFarmer.models.request.BuyRequest;
import globant.appFarmer.models.request.EntryRequest;
import globant.appFarmer.models.request.OperationStatusModel;
import globant.appFarmer.models.request.UserRequest;
import globant.appFarmer.models.responses.BuyResponse;
import globant.appFarmer.models.responses.EntryResponse;
import globant.appFarmer.models.responses.UserResponse;
import globant.appFarmer.services.BuyService;
import globant.appFarmer.services.EntryService;
import globant.appFarmer.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    BuyService buyService;

    @Autowired
    EntryService entryService;

    @Autowired
    ModelMapper mapper;

    //http post method to create box
    @PostMapping
    public UserResponse createUser(@Valid @RequestBody UserRequest userRequest) {
        UserDto user = mapper.map(userRequest, UserDto.class);
        UserDto createdUser = userService.createUser(user);
        return mapper.map(createdUser, UserResponse.class);
    }

    //http post method to update user
    @PutMapping(path = "/{id}")
    public UserResponse updateUser(@PathVariable long id, @Valid @RequestBody UserRequest userRequest) {
        UserDto user = mapper.map(userRequest, UserDto.class);
        UserDto updateUser = userService.updateUser(id, user);
        return mapper.map(updateUser, UserResponse.class);
    }

    //http post method to delete box
    @DeleteMapping(path = "/{id}")
    public OperationStatusModel deleteUser(@PathVariable long id) {
        OperationStatusModel operationStatusModel = new OperationStatusModel();
        operationStatusModel.setName("DELETE");
        userService.deleteUser(id);
        operationStatusModel.setResult("SUCESS");
        return operationStatusModel;
    }

    //http get method to get all user
    @GetMapping
    public List<UserResponse> getAllUser() {
        List<UserDto> userDtos = userService.getAllUser();
        List<UserResponse> userResponses = new ArrayList<>();
        userDtos.forEach(r -> userResponses.add(mapper.map(r, UserResponse.class)));
        return userResponses;
    }

    //http get method to search specific user by firstName
    @GetMapping("/search")
    public List<UserResponse> getUserByFirstName(@RequestParam("first_name") String firstName) {
        List<UserDto> usersDto = userService.getUsersByFirstName(firstName);
        List<UserResponse> usersResponse = new ArrayList<>();
        usersDto.forEach(u -> usersResponse.add(mapper.map(u, UserResponse.class)));
        return usersResponse;
    }

    //http get method to get user by userName
    @GetMapping(path = "/{userName}")
    public UserResponse getUserByUserName(@PathVariable String userName) {
        UserDto getUserByUserName = userService.getUserByUserName(userName);
        return mapper.map(getUserByUserName, UserResponse.class);
    }

    //http post method to create buy
    @PostMapping(path = "/buys")
    public BuyResponse buyBox(@Valid @RequestBody BuyRequest buyRequest) {
        BuyDto buyDto = buyService.createBuy(buyRequest.getUser(), buyRequest.getBox(), buyRequest.getQuantity());
        return mapper.map(buyDto, BuyResponse.class);
    }

    //http post method to create entry
    @PostMapping(path = "/entries")
    public EntryResponse createEntry(@Valid @RequestBody EntryRequest entryRequest) {
        EntryDto entryDto = entryService.createEntry(mapper.map(entryRequest, EntryCreationDto.class));
        return mapper.map(entryDto, EntryResponse.class);
    }

}

