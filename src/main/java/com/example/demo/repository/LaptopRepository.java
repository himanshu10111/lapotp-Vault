package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LaptopInfo;

public interface LaptopRepository extends JpaRepository<LaptopInfo,Long> {

}
