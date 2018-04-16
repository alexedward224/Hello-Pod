package com.stewartandrews.application.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stewartandrews.application.serviceinterfaces.HelloService;

import io.swagger.annotations.ApiOperation;

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
	
	@RequestMapping(method = RequestMethod.GET, value = "/hi", produces = "text/plain")
  @ApiOperation("Returns the greeting in HI")
  public String hi() {
      String hostname = System.getenv().getOrDefault("HOSTNAME", "Unknown");
      return String.format("HI from %s", hostname);
  }

	@RequestMapping(method = RequestMethod.GET, value = "/sayHello", produces = "text/plain")
	public String sayHello() {
		return this.helloService.sayHello();
	}
}