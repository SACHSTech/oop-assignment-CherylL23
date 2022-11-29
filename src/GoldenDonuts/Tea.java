package GoldenDonuts;
import java.io.*;

public class Tea extends Beverage{

    int sugarLevel;

    public Tea(String aName, String aSize, String aTemp, int sugarPercent, double aPrice){

        super(aName, aSize, aTemp, aPrice);
        sugarLevel = sugarPercent;
    }

    int getSugar(){
        return sugarLevel;
    }

    public void setSugar(int newSugar){
        sugarLevel = newSugar;
    }

    public void recieveI(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What kind of tea do you want?: ");
        String strTea = reader.readLine();
        setName(strTea);

        System.out.print("What size do you want? We have small, medium, and large.: ");
        String strSize = reader.readLine();

        if(strSize.equalsIgnoreCase("small")){
            setSize(strSize);
            setPrice(0.50);
        }

        if(strSize.equalsIgnoreCase("medium")){
            setSize(strSize);
            setPrice(1.00);
        }

        if(strSize.equalsIgnoreCase("large")){
            setSize(strSize);
            setPrice(1.50);
        }

        System.out.print("How sweet do you want your tea to be? (0 = no sugar to 100 = regular sugar): ");
        int intSugar = Integer.parseInt(reader.readLine());
        setSugar(intSugar);

    }    

    public void displayI(){
        
        System.out.println("Beverage:" + getName());
        System.out.println("Size:" + getSize());
        System.out.println("Temperature:" + getTemp());
        System.out.println("Sugar level (%):" + getSugar());
        System.out.println("Price:" + getPrice());
    }

}
