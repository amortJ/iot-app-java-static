package at.ac.tuwien.dsg.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotAppApplication {

	public static void main(String[] args) {

		// fixes a problem with the unik-framework
		String [] noargs = {};

		SpringApplication.run(IotAppApplication.class, noargs);

	}
}
