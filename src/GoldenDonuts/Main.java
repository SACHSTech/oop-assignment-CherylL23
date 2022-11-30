package GoldenDonuts;
import java.util.*;
import java.io.*;

public class Main {

    
    public static void main(String[] args) throws IOException{
        
        //variables needed
        boolean isOrdering = true;
        int orderContd = 2;
        Order newOrder = new Order();
        
        //introduction
        System.out.println("Welcome to Golden Donuts!");
        System.out.println("Here is the preview of our menu");
        System.out.println("Our donuts are freshly made with organic ingredients.");
        

        while(isOrdering){

            while(orderContd == 2){

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Menu aMenu = new Menu();
                aMenu.getInfo();
                System.out.println("");
                System.out.print("To start ordering, enter a number that corresponds to the menu item: ");
                int intOrder = Integer.parseInt(reader.readLine());

                if(intOrder < 8 || intOrder == 8){
                    
                    aMenu.getDonut(intOrder).recieveI(args);
                    newOrder.addDonut(aMenu.getDonut(intOrder));
                }
                else if(intOrder > 8){
                    aMenu.getBeverage(intOrder).recieveI(args);
                    newOrder.addBeverage(aMenu.getBeverage(intOrder));
                }
               else{
                    System.out.println("Sorry! We do not have that in our shop.");
                    isOrdering = true;
                }
                
                newOrder.showO();
                System.out.print("Enter 1 to proceed to checkout. Enter 2 to continue ordering: ");
                orderContd = Integer.parseInt(reader.readLine());
            }
            
                
        }

        
    }
    
}
