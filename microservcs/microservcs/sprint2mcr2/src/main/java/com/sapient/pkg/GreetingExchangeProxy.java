package com.sapient.pkg;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="sprint1mcr1")    //eureka
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="sprint1mcr1")
public interface GreetingExchangeProxy {
	
	
	//@GetMapping("/{greet}")
	
	@GetMapping("/sprint1mcr1/{greet}")  //zuul
	public Greeting retrieveGreet
		(@PathVariable("greet") String greet);
}