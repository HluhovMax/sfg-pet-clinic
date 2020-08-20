package io.mh.sfgpetclinic.services.map;

import io.mh.sfgpetclinic.model.Vet;
import io.mh.sfgpetclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends VetAbstractMapService implements VetService {
	@Override
	public Set<Vet> findAll() {
		return super.findAllInMap();
	}

	@Override
	public Vet findById(Long id) {
		return super.findByIdInMap(id);
	}

	@Override
	public Vet save(Vet vet) {
		return super.saveToMap(vet.getId(), vet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdFromMap(id);
	}

	@Override
	public void delete(Vet vet) {
		super.deleteFromMap(vet);
	}
}
