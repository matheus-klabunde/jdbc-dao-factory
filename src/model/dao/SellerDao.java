package model.dao;

import java.util.List;

import model.entities.Department;

public interface SellerDao<T, G> extends GenericsDao<T, G>{

	List<T> findByDepartment(Department department);
}
