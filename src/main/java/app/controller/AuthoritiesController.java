package app.controller;

import app.DTO.RoleDto;
import app.converter.BaseConverter;
import app.entity.Pair;
import app.DTO.RolesList;
import app.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/authorities")
public class AuthoritiesController {
    private final PairRepository pairRepository;
    private final BaseConverter<Pair, RoleDto> pairRoleeDtoBaseConverter;

    @Autowired
    public AuthoritiesController(PairRepository pairRepository, BaseConverter<Pair, RoleDto> pairRoleeDtoBaseConverter) {
        this.pairRepository = pairRepository;
        this.pairRoleeDtoBaseConverter = pairRoleeDtoBaseConverter;
    }

    @GetMapping()
    private @ResponseBody
    ResponseEntity<List<Pair>> getAuthorities(){
        return new ResponseEntity<>(pairRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    private @ResponseBody
    ResponseEntity<RolesList> getAuthorities(@PathVariable int id){
        RolesList rolesList = new RolesList(pairRoleeDtoBaseConverter.convertAll(pairRepository.findAllByStaffId(id)));
        System.out.println("OK");
        return new ResponseEntity<>(rolesList, HttpStatus.OK);
    }
}
