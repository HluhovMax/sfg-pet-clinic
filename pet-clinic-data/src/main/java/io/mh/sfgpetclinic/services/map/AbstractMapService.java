package io.mh.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	Set<T> findAllInMap() {
		return new HashSet<>(map.values());
	}

	T findByIdInMap(ID id) {
		return map.get(id);
	}

	T saveToMap(ID id, T object) {
		map.put(id, object);

		return object;
	}

	void deleteByIdFromMap(ID id) {
		map.remove(id);
	}

	void deleteFromMap(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
