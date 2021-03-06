package visualize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {

	@RequestMapping("/")
	String home() {
		return "Hi This is  here, have setup the project !!!";
	}

	public static void main(String args[]) {
		SpringApplication.run(HomeController.class, args);
	}

}
