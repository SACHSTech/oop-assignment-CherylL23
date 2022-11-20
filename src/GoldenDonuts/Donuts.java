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

    public void recieveI(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What type of donut do you want?: ");
        String strType = reader.readLine();
        System.out.println("How many do you want?: ");
        int intNum = Integer.parseInt(reader.readLine());

        if(strType.equalsIgnoreCase("original")){
            setAmount(intNum);
            setCost(1.90);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Cinnamon Twist")){
            setAmount(intNum);
            setCost(2.25);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Boston Kreme")){
            setAmount(intNum);
            setCost(2.25);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Chocolate glaze")){
            setAmount(intNum);
            setCost(2.15);
            setDonut(strType);
        }
        
        if(strType.equalsIgnoreCase("Jelly filled")){
            setAmount(intNum);
            setCost(2.75);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Green Tea Cruller")){
            setAmount(intNum);
            setCost(2.90);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Original Cruller")){
            setAmount(intNum);
            setCost(2.90);
            setDonut(strType);
        }

        if(strType.equalsIgnoreCase("Chocolate Cruller")){
            setAmount(intNum);
            setCost(2.00);
            setDonut(strType);
        }

        else{
            System.out.println("Sorry! we do not have it at Golden Donuts.");
        }
    }

    public void displayI(){
        System.out.println("Donut:" + getDonut());
        System.out.println("# of donuts:" + getAmount());
        System.out.println("Price:" + getCost());
    }
}
