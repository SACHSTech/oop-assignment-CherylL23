
public class Coffee extends Beverage{

    boolean creamTop;

    public Coffee(String aName, String aSize, String aTemp, double aPrice, boolean whippedCream){

        super(aName, aSize, aTemp, aPrice);
        creamTop = whippedCream;
    }

    public boolean getCream(){
        return creamTop;
    }



}
