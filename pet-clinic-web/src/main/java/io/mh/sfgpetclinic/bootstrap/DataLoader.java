package io.mh.sfgpetclinic.bootstrap;

import io.mh.sfgpetclinic.model.Owner;
import io.mh.sfgpetclinic.model.Vet;
import io.mh.sfgpetclinic.services.OwnerService;
import io.mh.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		savePersons();
	}

	private void savePersons() {
		// SAVE FIRST OWNER
		ownerService.save(
			new Owner
				.Builder()
				.id(1L)
				.firstName("Michael")
				.lastName("Weston")
				.build()
		);
		// SAVE SECOND OWNER
		ownerService.save(
			new Owner
				.Builder()
				.id(2L)
				.firstName("Fiona")
				.lastName("Glenanne")
				.build()
		);
		System.out.printf("Loaded Owners *%s*...%n", ownerService.count());
		// SAVE FIRST VET
		vetService.save(
			new Vet
				.Builder()
				.id(1L)
				.firstName("Sam")
				.lastName("Axe")
				.build()
		);
		// SAVE SECOND VET
		vetService.save(
			new Vet
				.Builder()
				.id(2L)
				.firstName("George")
				.lastName("Mayweather")
				.build()
		);
		System.out.printf("Loaded Vets *%s*...%n", vetService.count());
	}
}
