package by.itAcademy.training.entity;
import java.util.Scanner;

public class Shop {
	private Customer[] customers;
	private int sizeShop;
	private int numberCustomers;
	
	private static final int DEFAULTSIZE = 5;
	
	public Shop (int sizeShop) {
		numberCustomers = 0;
		this.sizeShop = sizeShop;
		customers = new Customer [sizeShop];
	}
	
	public Shop () {
		this (DEFAULTSIZE);
	}
	
	
	
	public Customer[] getCustomers() {
		return customers;
	}

	public int getSizeShop() {
		return sizeShop;
	}

	public int getNumberCustomers() {
		return numberCustomers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public void setSizeShop(int sizeShop) {
		this.sizeShop = sizeShop;
	}

	public void setNumberCustomers(int numberCustomers) {
		this.numberCustomers = numberCustomers;
	}

	public void createCustomer (Customer customer) {
		if (numberCustomers < sizeShop) {
			customers[numberCustomers] = customer;
			numberCustomers++;
		} else {
			Customer[] buffer = new Customer [sizeShop * 2];
			for (int i = 0; i < numberCustomers; i++) {
				buffer[i] = customers[i];
			}
			customers = buffer;
			sizeShop = sizeShop * 2;
			customers[numberCustomers] = customer;
			numberCustomers++;
		}
	}
	
	public void print () {
		for (int i = 0; i < numberCustomers; i++) {
			System.out.println (customers[i].toString());
		}
	}
	
	public void sortBySurname () {
		int min;
		Customer temp; 		
		
		for (int i = 0; i < numberCustomers - 1; i++) {
			min = i;
			for (int j = i + 1; j < numberCustomers; j++) {
				if (customers[min].getSurname().compareTo(customers[j].getSurname()) > 0 ) {
					min = j;
				}
			}
			if (i != min) {
				temp = customers[i];
				customers[i] = customers[min];
				customers[min] = temp;
			}
		}
	}
	
	public void printIfCardIn () {
		int numberAfter, numberBefore;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter numberAfter ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Enter numberAfter ");
		}
		numberAfter = sc.nextInt();
		System.out.println("Enter numberBefore ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Enter numberBefore ");
		}
		numberBefore = sc.nextInt();
		if (numberBefore < numberAfter) {
			throw new RuntimeException ("Repeat action: numberBefore can't be less numberAfter");
		}
		for (int i = 0; i < numberCustomers; i++) {
			if (customers[i].getCardNumber() > numberAfter & customers[i].getCardNumber() < numberBefore) {
				System.out.println (customers[i].toString());
			}
		}
	}

}
