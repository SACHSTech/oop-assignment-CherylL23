package GoldenDonuts;
import java.io.*;
import java.text.DecimalFormat;

public class Donuts {
    
    //variables needed
    private int menuNum;
    private String donutName;
    private double donutPrice;
    private int donutNum;

    /**
     * 
     * @param donutType type pf donut
     * @param anAmount how much donuts the consumer wants
     * @param thePrice price per donut
     * @param newNum menu number
     */
    public Donuts(String donutType, int anAmount, double thePrice, int newNum){
        donutName= donutType;
        donutNum = anAmount;
        donutPrice = thePrice;
        menuNum = newNum;
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
        return (donutPrice * donutNum);
    }

    public void setCost(double newCost){
        donutPrice = newCost;
    }

    public String toString(){
        return menuNum + " - " + donutName;
    }

    public void recieveI(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many do you want?: ");
        int intNum = Integer.parseInt(reader.readLine());
        setAmount(intNum);
    }

    public void displayI(){
        System.out.println("Donut: " + getDonut());
        System.out.println("# of donuts: " + getAmount());
        System.out.println("Price: $" + getCost());
    }
}
