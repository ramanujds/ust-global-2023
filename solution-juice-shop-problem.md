



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
