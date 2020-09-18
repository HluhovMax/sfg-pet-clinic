package io.mh.sfgpetclinic;

import io.mh.sfgpetclinic.propertysource.model.FakeDataSource;
import io.mh.sfgpetclinic.propertysource.model.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

}
