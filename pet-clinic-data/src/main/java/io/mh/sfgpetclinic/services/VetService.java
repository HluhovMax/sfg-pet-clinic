package io.mh.sfgpetclinic.services;

import io.mh.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
