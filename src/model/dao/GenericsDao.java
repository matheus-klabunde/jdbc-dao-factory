package model.dao;

import java.util.List;

public interface GenericsDao<T, G> {

	void insert(T obj);
	void update(T obj);
	void delete(G id);
	T findById(G id);
	List<T> findAll();
}
