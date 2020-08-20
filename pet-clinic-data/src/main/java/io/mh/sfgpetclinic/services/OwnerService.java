package io.mh.sfgpetclinic.services;

import io.mh.sfgpetclinic.model.Owner;

public interface OwnerService extends GenericCrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
