package io.mh.sfgpetclinic.model;

import lombok.Data;

@Data
public class Person extends BaseEntity{

	protected String firstName;
	protected String lastName;
}
