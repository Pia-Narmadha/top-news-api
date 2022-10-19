package com.demo.topnewsapi;

import java.io.File;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/news")
public class NewsController {
	
	@GetMapping("/{source}")
	@CrossOrigin(origins="*")
	public TopNews newsAPI(@PathVariable String source) throws Exception {
		File resource = new ClassPathResource("/google.json").getFile();
		ObjectMapper objectMapper = new ObjectMapper();
		TopNews x = objectMapper.readValue(resource , TopNews.class);
		return x;
	}
	

}
