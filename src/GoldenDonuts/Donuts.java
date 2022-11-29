package GoldenDonuts;
import java.io.*;

public class Donuts {
    
    private int menuNum;
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

    public String toString(){
        return " - " + donutName;
    }

    public void recieveI(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /**System.out.print("What type of donut do you want?: ");
        String strType = reader.readLine();
        

        if(strType.equalsIgnoreCase("Original")){
            setCost(1.90);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Cinnamon Twist")){

            setCost(2.25);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Boston Kreme")){

            setCost(2.25);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Chocolate glaze")){

            setCost(2.15);
            setDonut(strType);
        }
        
        else if(strType.equalsIgnoreCase("Jelly filled")){

            setCost(2.75);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Green Tea Cruller")){
  
            setCost(2.90);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Original Cruller")){

            setCost(2.90);
            setDonut(strType);
        }

        else if(strType.equalsIgnoreCase("Chocolate Cruller")){

            setCost(2.90);
            setDonut(strType);
        }

        else{
            System.out.println("Sorry! we do not have it at Golden Donuts.");
        }*/

        System.out.print("How many do you want?: ");
        int intNum = Integer.parseInt(reader.readLine());
        setAmount(intNum);
    }

    public void displayI(){
        System.out.println("Donut:" + getDonut());
        System.out.println("# of donuts:" + getAmount());
        System.out.println("Price: $" + getCost());
    }
}
