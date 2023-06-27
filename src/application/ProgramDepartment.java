package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		DepartmentDao<Department, Integer> departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department insert ===");
		Department newdepartment = new Department(null, "Sports");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New id = " + newdepartment.getId());
	}

}
