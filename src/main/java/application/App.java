package application;

public class App {
	
    public static void main(String[] args) {
        MainMenue mainMenue = new MainMenue();
        System.out.println("Welcome to the Car Inventory Management System");

        try{
            while (true) { 
                mainMenue.displayMenue();
                int choice = mainMenue.readChoice(5);
                switch(choice){
                    case 1:
                        CarHandler.createCar();
                        break;
                    case 2:
                        CarHandler.searchCar();
                        break;
                    case 3:
                        CarHandler.updateCar();
                        break;
                    case 4:
                        System.err.println("1) display sold cars"+
                                "2) sell car");
                        int soldChoice = mainMenue.readChoice(2);
                        if(soldChoice == 1){
                            DBQuery.displaySold();}
                        else if(soldChoice == 2){
                            CarHandler.sellCar();}
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
