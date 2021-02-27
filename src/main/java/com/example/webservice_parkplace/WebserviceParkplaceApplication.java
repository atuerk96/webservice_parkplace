package com.example.webservice_parkplace;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;

@SpringBootApplication
public class WebserviceParkplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceParkplaceApplication.class, args);
	}
	@Bean
	ApplicationRunner applicationRunner(GreetingRepository greetingRepository){
		return args -> {
			greetingRepository.save(new Greeting("hello"));
			greetingRepository.save(new Greeting("hi"));
		};
	}
}

@RestController
class HelloController {
	private final GreetingRepository greetingRepository;

	@GetMapping("/")
	String hello() {
		return "Hallo Digga";
	}
	@GetMapping("/greetings")
	List<Greeting> greetings(){
		return greetingRepository.findAll();
	}
}

@Entity
class Greeting{
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String message;

	public Greeting() {
	}
		public Greeting(String message){
			this.message=message;
		}
	public Long getId(){
		return id;
	}

	public String getMessage(){
		return message;
	}

}

interface GreetingRepository extends CrudRepository<Greeting, Long>{}