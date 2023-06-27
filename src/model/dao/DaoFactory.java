package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class DaoFactory {

	public static SellerDao<Seller, Integer> createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao<Department, Integer> createDepartmentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
