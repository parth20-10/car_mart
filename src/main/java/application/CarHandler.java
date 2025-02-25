package application;

public class CarHandler {
	static GetDetails getDetails = new GetDetails();
	// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void searchCar() {
		// TODO Auto-generated method stub
		System.out.println("Search Car By:\n" +
				"1) ALL\n" +
				"2) Company\n" +
				"3) Type\n" +
				"4) Price Range\n" +
				"5) Exit.");
		int choice = new MainMenue().readChoice(5);
		switch (choice) {
			case 1:
				DBQuery.displayALL();
				break;
			case 2:
				System.out.println("Enter the company name.");
				String company = getDetails.setCarCompany("");
				DBQuery.displayByCompany(company);
				break;
			case 3:
				System.out.println("Enter the type.");
				String type = getDetails.setType("");
				DBQuery.displayByType(type);
				break;
			case 4:
				System.out.println("Enter the min price .");
				int min = getDetails.setPrice(0);
				System.out.println("Enter the max price .");
				int   max = getDetails.setPrice(0);

				DBQuery.displayByPrice(min,max);
				break;
			case 5:
				break;
			default:
				throw new InvalidInputException("Invalid choice");
		}
	}

	public static void updateCar() {
		// TODO Auto-generated method stub
		System.out.println("Enter the car id to be updated.");
		int id = getDetails.setId(0);
		System.out.println("Enter amount to change by.");
		int price = getDetails.setPrice(0);
		DBQuery.updateCar(id, price);
	}

	public static void sellCar() {
		// TODO Auto-generated method stub
		System.out.println("Enter the car id to be sold.");
		int id = getDetails.setId(0);
		DBQuery.sellCar(id);
	}

	public static void createCar() {
		// TODO Auto-generated method stub
		String company = getDetails.setCarCompany("");
		short model = getDetails.setModel((short) 0);
		short seater = getDetails.setSeater((short) 0);
		String fuelType = getDetails.setFuelType(" ");
		String type = getDetails.setType("");
		int price = getDetails.setPrice(0);
		boolean isSold = false;
		Car car = new Car(company, model, seater, fuelType, type, price, isSold);
		DBQuery.createCar(car);
	}

}
