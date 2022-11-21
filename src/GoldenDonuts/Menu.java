package GoldenDonuts;
import java.util.*;


public class Menu {

    private ArrayList<Donuts> donutList = new ArrayList<Donuts>();
    private ArrayList<Beverage> beverageList = new ArrayList<Beverage>();

    //donuts for sale
    Donuts original = new Donuts("Original", 1, 1.90);
    Donuts twist = new Donuts("Cinnamon Twist", 1, 2.25);
    Donuts boston = new Donuts("Boston Kreme", 1, 2.25);
    Donuts chocoG = new Donuts("Chocolate glaze", 1, 2.75);
    Donuts jelly = new Donuts("Jelly filled", 1, 2.75);
    Donuts crullerO = new Donuts("Original Cruller", 1, 2.90);
    Donuts greenTea = new Donuts("Green Tea Cruller", 1, 2.90);
    Donuts chocoC = new Donuts("Chocolate Cruller", 1, 2.90);

    //beverages available
    Coffee blackS = new Coffee("black coffee" , "small", "hot or cold", false, 1.00);
    Coffee blackM = new Coffee("black coffee" , "small", "hot or cold", false, 1.50);
    Coffee blackL = new Coffee("black coffee" , "small", "hot or cold", false, 2.00);
 
    public Menu(){

        //add donuts to the donut arraylist
        donutList.add(original);
        donutList.add(twist);
        donutList.add(boston);
        donutList.add(chocoG);
        donutList.add(jelly);
        donutList.add(crullerO);
        donutList.add(greenTea);
        donutList.add(chocoC);

        //add beverages to the beverage arraylist
        beverageList.add(blackS);
        beverageList.add(blackM);
        beverageList.add(blackL);

    }
}
