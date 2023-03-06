package com.example.regionerkommuner2.Controller;

import com.example.regionerkommuner2.Model.Region;
import com.example.regionerkommuner2.Repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RegionRESTController {

  @Autowired
  RegionRepository regionRepository;

  @GetMapping("/regioner")
  public List<Region> regioner(){
    return regionRepository.findAll();
  }
  @PostMapping("/region")
  @ResponseStatus(HttpStatus.CREATED)
  public Region postStudent(@RequestBody Region region) {
    System.out.println(region);
    return regionRepository.save(region);
  }
}
