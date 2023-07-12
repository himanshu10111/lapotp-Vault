package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LaptopInfo;
import com.example.demo.service.LaptopService;

@RestController
@RequestMapping("/api")
public class LaptopInfoController {
	
	@Autowired
	public LaptopService laptopService;
	
	
	@GetMapping("/laptop/{id}")
	public Optional<LaptopInfo> getLaptop(@PathVariable(value = "id") Long id)
	{
		return laptopService.getLaptopById(id);
	}
	
	@GetMapping("/laptops")
	public List<LaptopInfo> getallLaptop()
	{
		return laptopService.getAllLaptop();
	}
	
	@PostMapping("/laptop")
	public LaptopInfo createLaptop(@RequestBody LaptopInfo laptop)
	{
		return laptopService.createLaptopInfo(laptop);
	}
	
	@DeleteMapping("/laptop/{id}")
	public String deleteLaptop(@PathVariable(value = "id") Long id)
	{
	 return laptopService.deleteLaptop(id);
	}
	

}
