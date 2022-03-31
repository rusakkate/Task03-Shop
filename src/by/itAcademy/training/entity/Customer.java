package by.itAcademy.training.entity;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int cardNumber;
	private int bankAccountNumber;
	
	public Customer (int id, String surname, String name, String patronymic, int cardNumber) {
		this.setId(id);
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.setCardNumber(cardNumber);
	}
	
	public Customer () {
		
	}

	public String toString () {
		String str = "";
		str = str + id + ": " + surname + " " + name + " " + patronymic + ", " + cardNumber;
		return str;
	}
	
	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public String getAddress() {
		return address;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new RuntimeException ("id cannot be less than zero");
		} else {
			this.id = id;
		}
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCardNumber(int cardNumber) {
		if (cardNumber < 0) {
			throw new RuntimeException ("cardNumber cannot be less than zero");
		} else if (countNumber (cardNumber) != 8) {
			throw new RuntimeException ("cardNumber must contain 8 digits");
		} else {
			this.cardNumber = cardNumber;
		}
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		if (bankAccountNumber < 0) {
			throw new RuntimeException ("bankAccountNumber annot be less than zero");
		} else if (countNumber (bankAccountNumber) != 10) {
			throw new RuntimeException ("cardNumber must contain 8 digits");
		} else {
			this.bankAccountNumber = bankAccountNumber;
		}
	}
	
	public int countNumber (int x) {
		int countNumber;
		countNumber = 0;
		while (x > 0) {
			x  = x / 10;
			countNumber++;
		}
		return countNumber;
	}


	public static Customer getCustomer (int id, String surname, String name, String patronymic, int cardNumber) {
		Customer customer = new Customer();
		
		customer.id = id;
		customer.surname = surname;
		customer.name = name;
		customer.patronymic = patronymic;
		customer.cardNumber = cardNumber;
		
		return customer;
	}

}
