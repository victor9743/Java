  package com.example.demo;
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RequestParam;
  import org.springframework.web.bind.annotation.RestController;
  
  @SpringBootApplication
  @RestController
  public class DemoApplication {
    
      
      public static void main(String[] args) {
    	  SpringApplication.run(DemoApplication.class, args);
      }
      
      @GetMapping("/hello")
      public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("<div>"
      						+ "<h2>Hello %s!</h2>"
      						+ "<div>"
      						+ "<div style='color:red'>"
      						+ "<p>fasdflçsdfasçdlfmsçaldmfasd</p>"
      						+ "</div>"
    		  , name);
      }
      
      @GetMapping("/")
      public String index() {
    	  return String.format("<h1> Index (Hello Wolrd)");
      }
      
      
    
  }
            