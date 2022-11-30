package GoldenDonuts;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
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

    public void checkOut(String[] args) throws IOException{

        Consumer consumer = new Consumer();
        DecimalFormat df = new DecimalFormat("0.00");

        consumer.recieveI();
        System.out.println("");
        consumer.displayI();
        finalTotal = subTotal * 1.13;
        System.out.println("Subtotal: $" + df.format(subTotal));
        System.out.println("Final total with tax: $" + df.format(finalTotal));
        System.out.println("Your order will be ready to pick up in 15 minutes!");

    }


}
