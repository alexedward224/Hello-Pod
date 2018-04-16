package com.stewartandrews.application.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stewartandrews.application.serviceinterfaces.HelloService;

/**
 * @author dandrews
 */
@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*")
public class HelloServiceResource
{
	@Autowired
  private HelloService helloService;

	@RequestMapping("/sayHello")
	public String sayHello() {
		return this.helloService.sayHello();
	}
}