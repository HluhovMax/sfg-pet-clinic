package io.mh.sfgpetclinic.services.map.impl;

import io.mh.sfgpetclinic.model.Pet;
import io.mh.sfgpetclinic.services.PetService;
import io.mh.sfgpetclinic.services.map.PetAbstractMapService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends PetAbstractMapService implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAllInMap();
	}

	@Override
	public Pet findById(Long id) {
		return super.findByIdInMap(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.saveToMap(pet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdFromMap(id);
	}

	@Override
	public void delete(Pet pet) {
		super.deleteFromMap(pet);
	}

	@Override
	public int count() {
		return super.count();
	}
}
