package application;

public class Car {
    private int carId;
    private String carCompany;
    private short  model;
    private short seater;
    private String fuelType;
    private String type;
    private int price;
    private boolean isSold;
	

    
    public Car(String carCompany, short model, short seater, String fuelType, String type, int price, boolean isSold) {
        this.carCompany = carCompany;
        this.model = model;
        this.seater = seater;
        this.fuelType = fuelType;
        this.type = type;
        this.price = price;
        this.isSold = isSold;
    }

    public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public short getModel() {
		return model;
	}
	public void setModel(short model) {
		this.model = model;
	}
	public short getSeater() {
		return seater;
	}
	public void setSeater(short seater) {
		this.seater = seater;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSold() {
		return isSold;
	}
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

    
}
