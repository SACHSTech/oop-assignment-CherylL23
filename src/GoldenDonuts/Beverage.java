package GoldenDonuts;
import java.io.*;

public abstract class Beverage {
    
    //variables needed
    private int menuNum;
    private String beverageName;
    private String beverageTemp;
    private String beverageSize;
    private double beveragePrice;

    /**
     * constructor that creates the instances of the beverage class
     * 
     * @param aName name of beverage
     * @param aSize size of beverage
     * @param aTemp temperature of beverage
     * @param aPrice price of beverage
     * @param mNum menu number for beverage
     */
    public Beverage(String aName, String aSize, String aTemp, double aPrice, int mNum){
        beverageName = aName;
        beverageSize = aSize;
        beverageTemp = aTemp;
        beveragePrice = aPrice;
        menuNum = mNum;
        
    }

    public int getMenuNum(){
        return menuNum;
    }

    public String getName(){
        return beverageName;
    }

    public void setName(String newName){
        beverageName = newName;
    }

    public String getSize(){
        return beverageSize;
    }

    public void setSize(String newSize){
        beverageSize = newSize;
    }

    public String getTemp(){
        return beverageTemp;
    }

    public void setTemp(String newTemp){
        beverageTemp = newTemp;
    }

    public double getPrice(){
        return beveragePrice;
    }

    public void setPrice(double newPrice){
        beveragePrice = newPrice;
    }

    public String toString(){
        return menuNum + " - " + beverageName;
    }

    public abstract void recieveI(String[] args) throws IOException;

    public abstract void displayI();
    
}
