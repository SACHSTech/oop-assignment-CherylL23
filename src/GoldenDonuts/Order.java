package GoldenDonuts;
import java.util.*;
public class Order {
    
    private double subTotal;
    private double finalTotal;
    private Consumer consumer;
    private ArrayList<Donuts> donutList = new ArrayList<Donuts>();
    private ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
    

    public void addDonut(Donuts newDonut){
        donutList.add(newDonut);
        subTotal += newDonut.getCost();

    }

    public void addBeverage(Beverage newBeverage){
       beverageList.add(newBeverage);
        subTotal += newBeverage.getPrice();
    }
//
    public void showO(){
        System.out.println("");
        System.out.println("~~~~~ Order Summary ~~~~~");
        System.out.println("");

        //display donuts bought
        for(int i = 0; i < donutList.size(); i++){
           donutList.get(i).displayI();
            System.out.println();
        }

        for(int i = 0; i < beverageList.size(); i++){
            beverageList.get(i).displayI();
        }

        
    }

    public void checkOut(){
        System.out.println("Before you check out, please enter your personal information:");
        
    }


}
