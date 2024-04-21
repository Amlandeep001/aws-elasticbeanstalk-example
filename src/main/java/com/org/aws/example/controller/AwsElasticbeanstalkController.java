package com.org.aws.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsElasticbeanstalkController
{
	@GetMapping("/status")
	public String deploy()
	{
		return "Application deployed to AWS beanstalk....";
	}
}
