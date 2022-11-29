package GoldenDonuts;
import java.util.*;
import java.io.*;

public class Main {

    
    public static void main(String[] args) throws IOException{
        
        boolean isOrdering = true;
        int orderContd = 2;
        int foodNum = 0;
        int beverageNum = 0;
        Order newOrder = new Order();
        

        System.out.println("Welcome to Golden Donuts!");
        System.out.println("Here is the preview of our menu");
        System.out.println("Our donuts are freshly made with organic ingredients.");
        

        while(isOrdering){

            while(orderContd == 2){
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Menu aMenu = new Menu();
                aMenu.getInfo();
                System.out.println("");
                System.out.print("To start ordering, enter 1 for donut, enter 8 for coffee, and enter 9 for tea: ");
                int intOrder = Integer.parseInt(reader.readLine());

                if(intOrder == 1){
                    aMenu.getDonut(intOrder).recieveI(args);
                    System.out.print("Enter 1 to proceed to checkout. Enter 2 to continue ordering");
                    orderContd = Integer.parseInt(reader.readLine());

                }
                else if(intOrder == 8){
                    aMenu.getBeverage(intOrder).recieveI(args);
                    System.out.print("Enter 1 to proceed to checkout. Enter 2 to continue ordering");
                    orderContd = Integer.parseInt(reader.readLine());
                }
                else if(intOrder == 9){
                    aMenu.getBeverage(intOrder).recieveI(args);
                    System.out.print("Enter 1 to proceed to checkout. Enter 2 to continue ordering");
                    orderContd = Integer.parseInt(reader.readLine());
                }
                else{
                    System.out.println("Sorry! We do not have that in our shop.");
                    isOrdering = true;
                }
                
            }
        }
        newOrder.showO(foodNum, beverageNum);
    }
    
}
