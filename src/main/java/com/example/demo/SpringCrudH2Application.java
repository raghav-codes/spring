package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudH2Application implements CommandLineRunner {
	/*
	 * @Autowired CustomerRepository customerRepository;
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Customer customer1 = new Customer(); customer1.setId(1234);
		 * customer1.setName("Aarav");
		 * 
		 * customerRepository.save(customer1);
		 * System.out.println("Read the value by ID : "+customerRepository.findById(1234
		 * ));
		 * 
		 * customer1.setName("Aarav updated"); customerRepository.save(customer1);
		 * System.out.println("Read the value after the update : "+customerRepository.
		 * findById(1234));
		 * 
		 * customerRepository.deleteById(1234);
		 * 
		 * System.out.println("After performing deletion: "+customerRepository.findById(
		 * 1234));
		 */
		
		
	}

}
