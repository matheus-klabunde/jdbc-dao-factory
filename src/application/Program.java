package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println("Deparment created: " + obj);

		Seller seller = new Seller(1, "Matheus Klabunde", "matheus@gmail.com", new Date(), 2000.0, obj);
		System.out.println("Seller created: " + seller);
	}
}
