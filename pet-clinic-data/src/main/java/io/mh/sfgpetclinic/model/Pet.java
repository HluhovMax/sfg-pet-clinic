package io.mh.sfgpetclinic.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Pet extends BaseEntity{

	private PetType petType;
	private Owner owner;
	private LocalDate birthDay;
}
