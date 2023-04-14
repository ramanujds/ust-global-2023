### MCQs Link 
https://forms.gle/qUGuZjWFtb3DxJDU6




### Answer the following

```text


Q. 1.
What is the output of the following :

1  class StringCheck {
2
3    static String[] str=new String[50];
4    public static void main(String[] args) {
5        for(int i=0; i<str.length; i++) {
6           str[i] = i;
7           System.out.print(str[i]);
8        }
9    }
10 }
 a) compile error at line 6. 
 b) 0 to 49 printed continuously. 
 c) compile error at line 7. 
 d) null printed 50 times. 

Q. 2
For the code :
public class Test
{
   static int age=25;

   Test() {
   }
   public static void main(String[] args) {
    System.out.println("Age = "+ age++ );
   }
}
 a) Gives output : Age = 26 
 b) Will not compile. 
 c) Gives output : Age = 25 
 d) None of above 

Q. 3
What is the output?    
      String k ="big "; 
      k.concat("crowded ");
      k += "city";
      System.out.println(k);
 a) compile error 
 b) big crowded city 
 c) big crowded 
 d) big city 

Q. 4
What is the output?
     String[][] names = {
                 {"Mr.", "Mrs.", "Ms."},
                 {"John", "Gupta", "Hegde", "Khan"},
                 {":M", ":F"}
               };
     System.out.println(names[0][2] + names[1][2]+ names[2][1]);
 a) Compile error 
 b) Mrs.Gupta : M 
 c) Ms.Hegde : F 
 d) Mr.Khan : M 



Q 5. What is the output?
public class Test { 
   static public void main(String args[]) {
      int x = 10, y, z=2;
      if( (x=z) == 2)   y = 1;
      else   y = 2;
      System.out.println("y is " + --y);
   }
}
1. Compile error
2. Exception at runtime
3. Gives output: 0
4. Gives output: 1


```
