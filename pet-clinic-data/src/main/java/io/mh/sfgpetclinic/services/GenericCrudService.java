package io.mh.sfgpetclinic.services;

import java.util.Set;

public interface GenericCrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void deleteById(ID id);

	void delete(T object);

	int count();
}
