package com.opensanca.trilharest.filmes.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wisner
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@RequestMapping(path="/getHello", method=RequestMethod.GET)	
	public String helloWorld() {
		
		return "hello world";	
	}
	
}
