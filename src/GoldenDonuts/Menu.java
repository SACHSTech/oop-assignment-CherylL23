package GoldenDonuts;
import java.util.*;


public class Menu {

    //arrayLists
    private ArrayList<Donuts> donutList = new ArrayList<Donuts>();
    private ArrayList<Beverage> beverageList = new ArrayList<Beverage>();

    //donuts for sale
    Donuts original = new Donuts("Original", 1, 1.90,1);
    Donuts twist = new Donuts("Cinnamon Twist", 1, 2.25, 2);
    Donuts boston = new Donuts("Boston Kreme", 1, 2.25, 3);
    Donuts chocoG = new Donuts("Chocolate glaze", 1, 2.75, 4);
    Donuts jelly = new Donuts("Jelly filled", 1, 2.75, 5);
    Donuts crullerO = new Donuts("Original Cruller", 1, 2.90, 6);
    Donuts greenTea = new Donuts("Matcha Cruller", 1, 2.90, 7);
    Donuts chocoC = new Donuts("Chocolate Cruller", 1, 2.90, 8);

    //beverages available
    Coffee blackS = new Coffee("black coffee" , "small", "hot or cold", false, 1.00, 9);
    Tea earlGrey = new Tea("Earl Grey", "small", "hot or cold", 100, 0.50, 10);
    Tea englishB = new Tea("English Breakfast", "small", "hot or cold", 100, 0.5, 11);

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
        beverageList.add(earlGrey);
        beverageList.add(englishB);

    }

    public void getInfo(){

        System.out.println("* * * DONUT SELECTION * * *");
        for(int m = 0; m < donutList.size(); m++){
            System.out.println(donutList.get(m));
        }

        System.out.println("");

        System.out.println("* * * BEVERAGE SELECTION * * *");
        for(int m = 0; m < beverageList.size(); m++){
            System.out.println(beverageList.get(m));
        }
    }

    public Donuts getDonut(int m){
        return donutList.get(m - 1);
        
    }

    public Beverage getBeverage(int m){
        return beverageList.get(m - 9);

    }


}
