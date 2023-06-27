package model.dao;

import java.util.List;

import model.entities.Department;

public interface GenericsDao<T, G> {

	void insert(T obj);
	void update(T obj);
	void delete(G id);
	T findById(G id);
	List<T> findAll();
	List<T> findByDepartment(Department department);
}
