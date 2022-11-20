package GoldenDonuts;
import java.io.*;

public class Consumer {
    
    private String conName;
    private int creditCard;
    private String conEmail;
    private String conPhone;

    Consumer(String userName, String userEmail, String phoneNum, int cardNum){
        conName = userName;
        conEmail = userEmail;
        conPhone = phoneNum;
        creditCard = cardNum;
    }

    String getName(){
        return conName;
    }

    public void setName(String newName){
        conName = newName;
    }

    String getEmail(){
        return conEmail;
    }

    String getPhone(){
        return conPhone;
    }

    int getCard(){
        return creditCard;
    }

    public void recieveI(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your information to make a purchase.");
        System.out.println("Name:");
        String strName = reader.readLine();
        setName(strName);
    }

}
