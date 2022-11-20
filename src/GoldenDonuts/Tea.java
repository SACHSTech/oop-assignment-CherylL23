package GoldenDonuts;
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
}
