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

 



}
