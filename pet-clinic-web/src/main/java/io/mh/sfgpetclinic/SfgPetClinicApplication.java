package io.mh.sfgpetclinic;

import io.mh.sfgpetclinic.propertysource.model.FakeDataSource;
import io.mh.sfgpetclinic.propertysource.model.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println("********* data source info *********");
		System.out.println("user: " + fakeDataSource.getUser());
		System.out.println("password: " + fakeDataSource.getPassword());
		System.out.println("url: " + fakeDataSource.getUrl());

		FakeJmsBroker jmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println("********* jms info *********");
		System.out.println("user: " + jmsBroker.getUser());
		System.out.println("password: " + jmsBroker.getPassword());
		System.out.println("url: " + jmsBroker.getUrl());
	}

}
