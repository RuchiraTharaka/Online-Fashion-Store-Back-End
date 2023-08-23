package com.example.demo.otherservices;

import com.example.demo.Branch;
import com.example.demo.Category;
import com.example.demo.OtherInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OtherServicesController {

    @Autowired
    private OtherInformationService otherInformationService;

    @RequestMapping("/otherservices/branches")
    public List<Branch> getBranches(){
        return otherInformationService.getBranches();
    }

    @RequestMapping("/otherservices/categories")
    public List<Category> getCategories(){
        return otherInformationService.getCategories();
    }

    @RequestMapping("/otherservices/backgroundimages")
    public List<String> getBackgroundImages(){
        return otherInformationService.getBackgroundImages();
    }

}
