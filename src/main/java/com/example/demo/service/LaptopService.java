package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LaptopInfo;
import com.example.demo.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	public LaptopRepository laptopRepository;
	
	
	public Optional<LaptopInfo> getLaptopById(Long id) {
        return laptopRepository.findById(id);
    }
	
	public List<LaptopInfo> getAllLaptop()
	{
		return laptopRepository.findAll();
	}
	
	public LaptopInfo createLaptopInfo(LaptopInfo laptopInfo)
	{		
		return laptopRepository.save(laptopInfo);
	}
	
	public String deleteLaptop(Long id) {
	    Optional<LaptopInfo> laptop = laptopRepository.findById(id);

	    if (laptop.isPresent()) {
	        laptopRepository.deleteById(id);
	        return "Data with ID " + id + " is deleted.";
	    } else {
	        return "ID " + id + " does not exist.";
	    }
	}

}
