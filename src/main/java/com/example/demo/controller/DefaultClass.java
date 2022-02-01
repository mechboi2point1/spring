package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DefaultClass {
@GetMapping(value="")
public String getNull(){
	return "Connect1 to DEV team at meet@theanimesh.in for API Docs.";
}


}
