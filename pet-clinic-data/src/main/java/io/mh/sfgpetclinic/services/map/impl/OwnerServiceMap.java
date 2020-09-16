package io.mh.sfgpetclinic.services.map.impl;

import io.mh.sfgpetclinic.model.Owner;
import io.mh.sfgpetclinic.services.OwnerService;
import io.mh.sfgpetclinic.services.map.OwnerAbstractMapService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends OwnerAbstractMapService implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return new Owner();
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAllInMap();
	}

	@Override
	public Owner findById(Long id) {
		return super.findByIdInMap(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.saveToMap(owner.getId(), owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdFromMap(id);
	}

	@Override
	public void delete(Owner owner) {
		super.deleteFromMap(owner);
	}

	@Override
	public int count() {
		return super.count();
	}
}
