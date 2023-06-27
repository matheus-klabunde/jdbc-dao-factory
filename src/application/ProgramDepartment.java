package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao<Department, Integer> departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department insert ===");
		Department newdepartment = new Department(null, "Sports");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New id = " + newdepartment.getId());
		
		System.out.println("=== TESTE 2: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TESTE 3: department update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TESTE 4: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.delete(id);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== TESTE 5: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
