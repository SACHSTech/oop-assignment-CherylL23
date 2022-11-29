package GoldenDonuts;
import java.util.*;
public class Order {
    
    private double subTotal;
    private double finalTotal;
    private Consumer consumer;
    private ArrayList<Donuts> donutList = new ArrayList<Donuts>();
    private ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
    
    public Order(){
        consumer = new Consumer();;
    }

    public void addDonut(Donuts newDonut){
        donutList.add(newDonut);
        subTotal += newDonut.getCost();

    }

    public void addBeverage(Beverage newBeverage){
        beverageList.add(newBeverage);
        subTotal += newBeverage.getPrice();
    }

    public void showO(int drinkNum, int donutNum){
        System.out.println("~~~~~ Order Summary ~~~~~");
        System.out.println("");

        //display donuts bought
        for(int i = 0; i < donutNum; i++){
            donutList.get(i).displayI();
        }

        for(int i = 0; i < drinkNum; i++){
            beverageList.get(i).displayI();
        }

    }



}
