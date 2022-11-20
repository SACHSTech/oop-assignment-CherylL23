package GoldenDonuts;
import java.io.*;

public class Donuts {
    
    private String donutName;
    private double donutPrice;
    private int donutNum;

    public Donuts(String donutType, int anAmount, double thePrice){
        donutName= donutType;
        donutNum = anAmount;
        donutPrice = thePrice;
    }

    public String getDonut(){
        return donutName;
    }

    public void setDonut(String newType){
        donutName = newType;
    }

    public int getAmount(){
        return donutNum;
    }

    public void setAmount(int newNum){
        donutNum = newNum;
    }

    public double getCost(){
        return donutPrice * donutNum;
    }

    public void setCost(double newCost){
        donutPrice = newCost;
    }

   

    
}
