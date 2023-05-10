

class Juice

- define the class according to the above specifications

class Shop

- define data members according to the above specifications

-Implement the below methods for this class:

-String newFlavour(Juice j):

Write a code to add the new flavour to the menu list after validating the below criteria:

Check if there exists a juice in the list with the same flavour(ignoring case). If there is the same flavour present already then return "Flavour already enrolled".
If the time for preparation of the juice is greater than 30 minutes then return a message "Time taking".
If all the above specifications are fulfilled, add the given juice to the menu and return "New juice in the house".
-int orderJuice(String query):

The query string contains a comma(,) separated items with flavour and size. Return the bill after calculating the sum.
The string can be like: "Orange 1, Pineapple 2".
Suppose the cost of orange juice is 70 and the cost of pineapple is 100 then the bill amount is 100*2 + 70 = 270. Return 270 as a result. (The flavour and number are separated by a space)


```java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Juice{
    private String flavour;
   private int preparationTime;
   private int price;
   
   public Juice(String flavour, int preparationTime,int price){
       this.flavour = flavour;
       this.preparationTime=preparationTime;
       this.price=price;
   }
   
   public String getFlavour(){
       return flavour;
   }
   public void setFlavour(String flavour){
       this.flavour = flavour;
   }
   
   public int getPreparationTime(){
       return preparationTime;
   }
   public void setPreparationTime(int preparationTime){
       this.preparationTime = preparationTime;
   }
   public int getPrice(){
       return price;
   }
   public void setPrice(int price){
       this.price = price;
   }
   
   
}

class Shop{
  ArrayList<Juice> menu = new ArrayList<>();
  
  public String newFlavour(Juice j){
      if(j.getPreparationTime()>30){
              return "Time taking";
          }
          
      for(Juice juice : menu ){
          if(juice.getFlavour().equalsIgnoreCase(j.getFlavour())){
              return "Flavour already enrolled";
          }
      }
     menu.add(j);
     return "New juice in the house";
      
  }
  
  public int orderJuice(String query){
      String []orders = query.split(",");
      int total = 0;
      for(String order:orders){
          String []flavQty = order.split(" ");
          String flavour = flavQty[0];
          int qty = Integer.parseInt(flavQty[1]);
          for(Juice j:menu){
              if(j.getFlavour().equalsIgnoreCase(flavour)){
                  total += qty*j.getPrice();
              }
          }
      }
      return total;
  }
  
}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Juice j1 = new Juice("orange",24,100);
        Shop p = new Shop();
        p.newFlavour(j1);
        p.orderJuice("orange 2");
	}
}


```
