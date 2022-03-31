package by.itAcademy.training.main;

import by.itAcademy.training.entity.Customer;
import by.itAcademy.training.entity.Shop;

public class WorkShop {

	public static void main(String[] args) {
		Shop prostor = new Shop ();
		
		prostor.createCustomer(createCustomer(1001, "Rusak", "Kate", "Kons", 12546982));
		prostor.createCustomer(createCustomer(1003, "Balabay", "Alla", "Vasileyna", 12587945));
		prostor.createCustomer(createCustomer(1002, "Ivanov", "Sergey", "Petrovich", 12587949));

		prostor.sortBySurname();
		prostor.print();
		
		System.out.println();
		prostor.printIfCardIn();

	}
	
	private static Customer createCustomer(int id, String surname, String name, String patronymic, int cardNumber) {
		Customer customer = new Customer();
		
		customer.setId(id);
		customer.setSurname(surname);
		customer.setName(name);
		customer.setPatronymic(patronymic);
		customer.setCardNumber(cardNumber);

		return customer;
	}

}
