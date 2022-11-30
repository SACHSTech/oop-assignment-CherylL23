package GoldenDonuts;
import java.io.*;

public class Consumer {
    
    //variable needed
    private String conName;
    private int creditCard;
    private String conEmail;
    private String conPhone;


    
    //the user inputs information about themsleves to purchase the goods
    public void recieveI() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your information to make a purchase.");
        System.out.print("Name:");
        String strName = reader.readLine();
        conName = strName;

        System.out.print("Email:");
        String strMail = reader.readLine();
        conEmail = strMail;

        System.out.print("Phone number:");
        String strPhone = reader.readLine();
        conPhone = strPhone;

        System.out.print("Card Number (no spaces):");
        int strCard = Integer.parseInt(reader.readLine());
        creditCard = strCard;
    }

    //displays back the information of the user's information input
    public void displayI(){
        System.out.println("~~ Customer info ~~");
        System.out.println("Name:" + conName);
        System.out.println("Email:" + conEmail);
        System.out.println("Phone number:" + conPhone);
        System.out.println("Card Number:" + creditCard);
    }

}
