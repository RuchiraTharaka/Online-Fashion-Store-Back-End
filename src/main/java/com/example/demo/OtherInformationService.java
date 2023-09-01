package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherInformationService {

    private static final List<Branch> branches = List.of(
        new Branch("No.135,", "Kohuwala,", "Nugegoda","011-2541254"),
        new Branch("Main Road,", "Matugama,", "Kalutara.","034-4589231"),
        new Branch("Base Lane,", "Maggona,", "Galle.","018-4592514"),
        new Branch("No. 2/A,", "Main Road,", "Matara.","071-2574957")
    );

    private static final List<String> backgroundImages = List.of(
            "url('/assets/BackgroundImages/background10.jpg')",
            "url('/assets/BackgroundImages/background12.jpg')",
            "url('/assets/BackgroundImages/background11.jpg')",
            "url('/assets/BackgroundImages/background13.jpg')",
            "url('/assets/BackgroundImages/background14.jpg')",
            "url('/assets/BackgroundImages/background10.jpg')");

    private static final List<Category> categories = List.of(
        new Category(0, "Men's Fashion"),
        new Category(1, "Women's Fashion"),
        new Category(2, "Kids"),
        new Category(3, "Shoes & Sunglasses"),
        new Category(4, "Leather Store"));
    public List<Branch> getBranches(){
        return branches;
    }

    public List<Category> getCategories(){
        return categories;
    }

    public List<String> getBackgroundImages(){
        return backgroundImages;
    }
}
