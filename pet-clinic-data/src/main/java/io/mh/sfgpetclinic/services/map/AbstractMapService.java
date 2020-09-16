package io.mh.sfgpetclinic.services.map;

import io.mh.sfgpetclinic.model.BaseEntity;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	private final Map<Long, T> map = new LinkedHashMap<>();

	protected Set<T> findAllInMap() {
		return new HashSet<>(map.values());
	}

	protected T findByIdInMap(ID id) {
		return map.get(id);
	}

	protected T saveToMap(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("Object cannot be null");
		}

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

	private Long getNextId() {

		long nextId;

		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			nextId = 1L;
		}

		return nextId;
	}
}
