package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBQuery {
    public static DBConnection dbConnection = DBConnection.createDBconnection();

    public static void createCar(Car car) {

        String query = ("insert into car(Company,model,seater,fuel,type,price,sold) values(?,?,?,?,?,?,?)");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setString(1, car.getCarCompany());
            preparedStatement.setShort(2, car.getModel());
            preparedStatement.setShort(3, car.getSeater());
            preparedStatement.setString(4, car.getFuelType());
            preparedStatement.setString(5, car.getType());
            preparedStatement.setInt(6, car.getPrice());
            preparedStatement.setBoolean(7, car.isSold());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void displayALL() {
        String query = ("select * from car");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Car ID: " + resultSet.getInt(1));
                System.out.println("Company: " + resultSet.getString(2));
                System.out.println("Model: " + resultSet.getShort(3));
                System.out.println("Seater: " + resultSet.getShort(4));
                System.out.println("Fuel Type: " + resultSet.getString(5));
                System.out.println("Type: " + resultSet.getString(6));
                System.out.println("Price: " + resultSet.getInt(7));
                System.out.println("Sold: " + resultSet.getBoolean(8));
            }
        } catch (Exception e) {
        }

    }

    public static void updateCar(int id, int price) {
        String query = ("update car set price = ? where carId = ?");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
        // TODO Auto-generated method stub

    }

    public static void sellCar(int id) {
        String query = ("update car set sold = ? where carId = ?");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void displayByCompany(String Company) {
        // TODO Auto-generated method stub
        String query = ("select * from car where Company = ?");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setString(1, Company);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Car ID: " + resultSet.getInt(1));
                System.out.println("Company: " + resultSet.getString(2));
                System.out.println("Model: " + resultSet.getShort(3));
                System.out.println("Seater: " + resultSet.getShort(4));
                System.out.println("Fuel Type: " + resultSet.getString(5));
                System.out.println("Type: " + resultSet.getString(6));
                System.out.println("Price: " + resultSet.getInt(7));
                System.out.println("Sold: " + resultSet.getBoolean(8));
            }
        } catch (Exception e) {
        }

    }

    public static void displayByType(String type) {
        // TODO Auto-generated method stub
        String query = ("select * from car where type = ?");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setString(1, type);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Car ID: " + resultSet.getInt(1));
                System.out.println("Company: " + resultSet.getString(2));
                System.out.println("Model: " + resultSet.getShort(3));
                System.out.println("Seater: " + resultSet.getShort(4));
                System.out.println("Fuel Type: " + resultSet.getString(5));
                System.out.println("Type: " + resultSet.getString(6));
                System.out.println("Price: " + resultSet.getInt(7));
                System.out.println("Sold: " + resultSet.getBoolean(8));
            }
        } catch (Exception e) {
        }

    }

    public static void displayByPrice(int min, int max) {
        // TODO Auto-generated method stub
        String query = ("select * from car where price between ? and ?");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            preparedStatement.setInt(1, min);
            preparedStatement.setInt(2, max);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Car ID: " + resultSet.getInt(1));
                System.out.println("Company: " + resultSet.getString(2));
                System.out.println("Model: " + resultSet.getShort(3));
                System.out.println("Seater: " + resultSet.getShort(4));
                System.out.println("Fuel Type: " + resultSet.getString(5));
                System.out.println("Type: " + resultSet.getString(6));
                System.out.println("Price: " + resultSet.getInt(7));
                System.out.println("Sold: " + resultSet.getBoolean(8));
            }
        } catch (Exception e) {
        }
    }

    static void displaySold() {
        // TODO Auto-generated method stub
        String query = ("select * from car where sold = true");
        try (PreparedStatement preparedStatement = dbConnection.con.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Car ID: " + resultSet.getInt(1));
                System.out.println("Company: " + resultSet.getString(2));
                System.out.println("Model: " + resultSet.getShort(3));
                System.out.println("Seater: " + resultSet.getShort(4));
                System.out.println("Fuel Type: " + resultSet.getString(5));
                System.out.println("Type: " + resultSet.getString(6));
                System.out.println("Price: " + resultSet.getInt(7));
                System.out.println("Sold: " + resultSet.getBoolean(8));
            }
        } catch (Exception e) {
        }
    }
}
