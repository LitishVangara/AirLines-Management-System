package com.india.airLines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.india.airLines.service.StaticScannerAndPrint.*;

@SpringBootApplication
public class AirLinesApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AirLinesApplication.class, args);
		println();
	}
}
