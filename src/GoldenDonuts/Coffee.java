package GoldenDonuts;
import java.io.*;

public class Coffee extends Beverage{

    //variables needed
    boolean creamTop;

    /**
     * 
     * @param aName name of coffee
     * @param aSize size of coffee
     * @param aTemp temperature of beverage
     * @param whippedCream checks if the consumer wants whipped cream
     * @param aPrice price of coffee
     * @param mNum menu number
     */

    public Coffee(String aName, String aSize, String aTemp, boolean whippedCream, double aPrice, int mNum){

        super(aName, aSize, aTemp, aPrice, mNum);
        creamTop = whippedCream;
    }

    public boolean getCream(){
        return creamTop;
    }

    public void setCream(boolean creamOp){
        creamTop = creamOp;
    }

    public void recieveI(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you want your coffee to be hot or cold?: ");
        String strTemp =reader.readLine();
        setTemp(strTemp);

        System.out.print("What size do you want? We have small, medium, and large.: ");
        String strSize = reader.readLine();

        if(strSize.equalsIgnoreCase("small")){
            setSize(strSize);
            setPrice(1.00);
        }

        if(strSize.equalsIgnoreCase("medium")){
            setSize(strSize);
            setPrice(1.50);
        }

        if(strSize.equalsIgnoreCase("large")){
            setSize(strSize);
            setPrice(2.00);
        }

        System.out.print("Do you want whipped cream (free of charge)? Yes or no?: ");
        String strCream = reader.readLine();

        if(strCream.equalsIgnoreCase("yes")){
            setCream(true);
        }

        if(strCream.equalsIgnoreCase("no")){
            setCream(false);
        }
    }

    public void displayI(){
        
        System.out.println("Beverage:" + getName());
        System.out.println("Size:" + getSize());
        System.out.println("Temperature:" + getTemp());
        System.out.println("Whipped cream:" + getCream());
        System.out.println("Price: $" + getPrice());
    }
}
