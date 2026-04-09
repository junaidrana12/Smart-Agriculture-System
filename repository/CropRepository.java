package com.smartagriculture.repository;

import com.smartagriculture.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRepository extends JpaRepository<Crop, Long> {

//     List<Crop> findBySoilTypeAndSeason(String soil_type, String season);

     List<Crop> findBySoilTypeAndSeason(String soilType, String season);
}