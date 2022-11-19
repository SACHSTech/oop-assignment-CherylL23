public abstract class Beverage {
    
    private String beverageName;
    private String beverageTemp;
    private String beverageSize;
    private double beveragePrice;

    public Beverage(String aName, String aSize, String aTemp, double aPrice){
        beverageName = aName;
        beverageSize = aSize;
        beverageTemp = aTemp;
        beveragePrice = aPrice;
    }

    public String getName(){
        return beverageName;
    }

    public void setName(String newName){
        beverageName = newName;
    }

    public String getSize(){
        return beverageSize;
    }

    public void setSize(String newSize){
        beverageSize = newSize;
    }

    public String getTemp(){
        return beverageTemp;
    }

    public void setTemp(String newTemp){
        beverageTemp = newTemp;
    }

    public double getPrice(){
        return beveragePrice;
    }

    public void setPrice(double newPrice){
        beveragePrice = newPrice;
    }

    public abstract void recieveI();

    public abstract void displayI();
    
}
