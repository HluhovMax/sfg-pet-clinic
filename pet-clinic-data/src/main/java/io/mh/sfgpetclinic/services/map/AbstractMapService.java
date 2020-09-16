package io.mh.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	private Map<ID, T> map = new HashMap<>();

	protected Set<T> findAllInMap() {
		return new HashSet<>(map.values());
	}

	protected T findByIdInMap(ID id) {
		return map.get(id);
	}

	protected T saveToMap(ID id, T object) {
		map.put(id, object);

		return object;
	}

	protected void deleteByIdFromMap(ID id) {
		map.remove(id);
	}

	protected void deleteFromMap(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	protected int count() {
		return this.map.size();
	}
}
