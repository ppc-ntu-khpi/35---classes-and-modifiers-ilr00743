package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;

    public int getID() {
        return ID;
    }

    public void setID(int newID) {
        ID = newID;
    }

    public boolean getStatus() {
        return isNew;
    }

    public void setStatus(boolean newIsNew) {
        isNew = newIsNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double newTotal) {
        total = newTotal;
    }
    
    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
    
    public Customer(){
        ID = 1;
        isNew = true;
        total = 1000;
    }
    
}
