package com.example.demoValueit;

import com.example.demoValueit.entities.Client;
import com.example.demoValueit.services.ClientService;
import com.example.demoValueit.services.ReclamationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoValueitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoValueitApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ClientService clientService)
	{
		return  args -> {
				clientService.addClient(new Client(0,"Ilias Boutouil","ilias@gmail.com","Casablanca",null,null,null));
				clientService.addClient(new Client(0,"Salah Walim","salah@gmail.com","Settat",null,null,null));
				clientService.addClient(new Client(0,"Anas Zohri","anas@gmail.com","Casablanca",null,null,null));
				clientService.addClient(new Client(0,"Hamid Yafout","hamid@gmail.com","Casablanca",null,null,null));
		};
	}

}
@Controller
class AppController
{
	@GetMapping("/")
	public String index()
	{
		return "welcome";
	}

}