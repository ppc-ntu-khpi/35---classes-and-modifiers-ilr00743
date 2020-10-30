# На "п'ятріку"

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

![done.png]()
