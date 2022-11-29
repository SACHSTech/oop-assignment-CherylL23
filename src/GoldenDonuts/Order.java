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

    }

    

}
