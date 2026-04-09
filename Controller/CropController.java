package com.smartagriculture.controller;

import com.smartagriculture.entity.Crop;
import com.smartagriculture.service.CropService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CropController {

    private final CropService cropService;
    public CropController(CropService cropService) {
        this.cropService = cropService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/recommend")
    public String recommend(@RequestParam("soil_type") String soilType,
                            @RequestParam String season,
                            Model model) {
        System.out.println("SoilType = " + soilType);
        System.out.println("Season = " + season);
        List<Crop> crops = cropService.recommendCrops(soilType, season);
        model.addAttribute("crops", crops);

        return "result";
    }
}