package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="laptop")
@Data
public class LaptopInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="laptop_id")
	private Long id;
	
	@Column(name="laptop_brand")
	private String brand;
	
	@Column(name="laptop_model")
	private String model;
	
	@Column(name="laptop_processor")
	private String processor;
	
	@Column(name="laptop_ram")
	private String ram;
	
	@Column(name="laptop_storage")
	private String storage;
	
	@Column(name="laptop_display_size")
	private String displaySize;
	
	@Column(name="laptop_display_resoluation")
	private String displayResoluation;
	
	@Column(name="laptop_image")
	private byte image;
	
	@Column(name="laptop_gpu")
	private String gpu;
	
	@Column(name="laptop_os")
	private String os;
	
	@Column(name="laptop_port")
	private String port;
	
	@Column(name="laptop_wireless_info")
	private String wirelessInfo;
	
	@Column(name="laptop_price")
	private String price;
	
	@Column(name="laptop_battery_life")
	private String batteryLife;
	
	@Column(name="laptop_weight")
	private String weight;
	

}
