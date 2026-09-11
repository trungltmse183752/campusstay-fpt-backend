package vn.edu.fpt.campusstay;

import org.springframework.boot.SpringApplication;

public class TestCampusstayBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(CampusstayBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
