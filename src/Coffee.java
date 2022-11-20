 import java.io.*;
import java.io.InputStreamReader;


public class Coffee extends Beverage{

    boolean creamTop;

    public Coffee(String aName, String aSize, String aTemp, double aPrice, boolean whippedCream){

        super(aName, aSize, aTemp, aPrice);
        creamTop = whippedCream;
    }

    public boolean getCream(){
        return creamTop;
    }

    public void setCream(boolean creamOp){
        creamTop = creamOp;
    }

    public void recieveI(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What size do you want? We have small, medium, and large.: ");
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

        System.out.println("Do you want whipped cream? Yes or no?: ");
        String strCream = reader.readLine();

        if(strCream.equalsIgnoreCase("yes")){
            setCream(true);
        }

        if(strCream.equalsIgnoreCase("no")){
            setCream(false);
        }
    }

    


}
