package io.mh.sfgpetclinic.services;

import io.mh.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
