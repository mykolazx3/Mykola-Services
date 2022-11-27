package org.mykola.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {

	private final CustomerService customerService;
	private final RestTemplate restTemplate;

	@PostMapping
	public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
		log.info("new customer registration {}", customerRegistrationRequest);
		customerService.registerCustomer(customerRegistrationRequest);
	}

}
