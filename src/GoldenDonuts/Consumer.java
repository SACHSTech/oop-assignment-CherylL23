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

    public void setEmail(String newMail){
        conEmail = newMail;
    }

    String getPhone(){
        return conPhone;
    }

    public void setPhone(String newNum){
        conPhone = newNum;
    }

    int getCard(){
        return creditCard;
    }

    public void setCard(int newCard){
        creditCard = newCard;
    }

    public void recieveI(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your information to make a purchase.");
        System.out.println("Name:");
        String strName = reader.readLine();
        setName(strName);

        System.out.println("Email:");
        String strMail = reader.readLine();
        setEmail(strMail);

        System.out.println("Phone number:");
        String strPhone = reader.readLine();
        setPhone(strPhone);

        System.out.println("Card Number (no spaces):");
        int strCard = Integer.parseInt(reader.readLine());
        setCard(strCard);
    }

    public void displayI(){
        System.out.println("~~ Customer info ~~");
        System.out.println("Name:" + getName());
        System.out.println("Email:" + getEmail());
        System.out.println("Phone number:" + getPhone());
        System.out.println("Card Number:" + getCard());
    }

}
