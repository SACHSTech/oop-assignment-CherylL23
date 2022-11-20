package GoldenDonuts;
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

    String getEmail(){
        return conEmail;
    }

    String getPhone(){
        return conPhone;
    }




}
