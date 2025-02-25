package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDetails {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String setCarCompany(String carCompany) {
        while (true) {
            System.out.println("Enter Car Company");
            try {
                carCompany = reader.readLine();
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (carCompany.length() >= 3 && carCompany.length() <= 20) {
                return carCompany;
            } else {
                System.out.println("Enter valid Car Company Name");
            }
        }
    }

    public short setModel(short model) {
        while (true) {
            System.out.println("Enter Model");
            try {
                model = Short.parseShort(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, it must be a number.");
                continue;
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (model >= 1990 && model <= 2022) {
                return model;
            } else {
                System.out.println("Enter valid Model");
            }
        }
    }

    public short setSeater(short seater) {
        while (true) {
            System.out.println("Enter Seater");
            try {
                seater = Short.parseShort(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, it must be a number.");
                continue;
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (seater >= 2 && seater <= 10) {
                return seater;
            } else {
                System.out.println("Enter valid Seater");
            }
        }
    }
    public String setFuelType(String fuelType) {
        while (true) {
            System.out.println("Enter Fuel Type");
            try {
                fuelType = reader.readLine();
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("Diesel") || fuelType.equalsIgnoreCase("CNG")) {
                return fuelType;
            } else {
                System.out.println("Enter valid Fuel Type");
            }
        }
    }

    public String setType(String type) {
        while (true) {
            System.out.println("Enter Car Type");
            try {
                type = reader.readLine();
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (type.equalsIgnoreCase("Sedan") || type.equalsIgnoreCase("SUV") || type.equalsIgnoreCase("Hatchback")) {
                return type;
            } else {
                System.out.println("Enter valid Car Type");
            }
        }
    }

    public int setPrice(int price) {
        while (true) {
            System.out.println("Enter Price");
            try {
                price = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, it must be a number.");
                continue;
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (price >= 50000 && price <= 5000000) {
                return price;
            } else {
                System.out.println("Enter valid Price");
            }
        }
    }

    int setId(int i) {
        while(true){
            System.out.println("Enter Car Id");
            try {
                i = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, it must be a number.");
                continue;
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
                continue;
            }
            if (i > 0) {
                return i;
            } else {
                System.out.println("Enter valid Car Id");
            }
        }
    }

    
}
