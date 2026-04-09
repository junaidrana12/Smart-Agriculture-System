package com.smartagriculture.service;

import com.smartagriculture.entity.Crop;
import com.smartagriculture.repository.CropRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CropService {

    private final CropRepository cropRepository;
    public CropService(CropRepository cropRepository){
           this.cropRepository = cropRepository;
    }
    public List<Crop> recommendCrops(String soilType, String season) {
        return cropRepository.findBySoilTypeAndSeason(soilType, season);
    }

}