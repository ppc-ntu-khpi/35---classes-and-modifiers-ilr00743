# На "п'ятірку"

## Завдання 1 (Done)

**Customer.java**
``` java
package domain;

public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000;
    
    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
```

**CustomerTest.java**
``` java
package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
    }
}
```
**Результат роботи програми:**

![](https://github.com/ppc-ntu-khpi/35---classes-and-modifiers-ilr00743/blob/main/Solution/done.png "done.png")

## Завдання 2 (Advanced)

**Customer.java**
``` java
package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;
     
    public Customer(){
        ID = 1;
        isNew = true;
        total = 1000;
    }
    
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
}
```

**CustomerTest.java**
``` java
package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(12);
        customer.setStatus(false);
        customer.setTotal(2020.15);
        customer.displayCustomerInfo();
    }
}
```
**Результат роботи програми:**

![](https://github.com/ppc-ntu-khpi/35---classes-and-modifiers-ilr00743/blob/main/Solution/advanced.png "advanced.png")
