package globant.appFarmer.controllers;

import globant.appFarmer.dto.BoxEggCreationDto;
import globant.appFarmer.dto.BoxEggDto;
import globant.appFarmer.models.request.BoxEggRequest;
import globant.appFarmer.models.responses.BoxEggResponse;
import globant.appFarmer.services.BoxEggService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/boxes")//endpoint
public class BoxController {

    @Autowired
    BoxEggService boxEggService;

    @Autowired
    ModelMapper mapper;

    //http post method to create box
    @PostMapping
    public BoxEggResponse createBox(@RequestBody @Valid BoxEggRequest boxEggRequest) {
        BoxEggCreationDto box = mapper.map(boxEggRequest, BoxEggCreationDto.class);
        BoxEggDto createBox = boxEggService.createBox(box);
        return mapper.map(createBox, BoxEggResponse.class);
    }
    //http post method to update box price
    @PutMapping(path = "/{id}")
    public BoxEggResponse updateBox(@PathVariable long id, @RequestBody BoxEggRequest boxEggRequest) {
        BoxEggCreationDto box = mapper.map(boxEggRequest, BoxEggCreationDto.class);
        BoxEggDto updateBox = boxEggService.updateBox(id, box);
        return mapper.map(updateBox, BoxEggResponse.class);
    }
}
