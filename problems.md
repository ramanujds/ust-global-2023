### Practice Problem on Encapsulation

https://stackbooks-ust.stackroute.in/course/Programming-using-Core-Java/encapsulation-exercise



## Practice Statement: Score of Students

**The total marks of all the students of grade 12, irrespective of the stream opted by them has to be calculated. The subjects vary depending on their choice of stream.**

**For example**

- A student who has opted for the medical stream will get marks for math, physics, chemistry and biology
- A student who has opted for the non medical stream will get marks for math, physics and chemistry 
- A student who has chosen the commerce stream will get marks for business studies, finance and accounts


**Write a program with overloaded methods that will help calculate marks of the different streams of Grade 12 students.**

--Boilerplate--

```java
public class StudentMarks {

    /* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {


        return -1;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {


        return -1;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {


        return -1;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


        return -1;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



        return -1;
    }

}


```

```java

class StudentMarksCalcImpl{

    public static void main(String []args){

        String stream;
        // Read stream value from user and marks for different subjects based on the stream selected

        // Display the total marks
        

    }


}


```


### Practice Problems

1. Write a method that uses lambda expression to format a given string, where a string should be shortened using the first letter or each word. For ex., if input is “Indian Railways”, then expected output is “I.R.”.

2. From a list of string 
    * Count String whose length is more than three
    * Remove all empty Strings from List and display the new list

3. Find the distinct employees from a list of employees with duplicate employees

4. Write a Java program to count number of vowels in a given string

5. Write a Java program to remove all the vowels of a given string. Return the new string



## Exercises on Regular Expression

*Email Validation*
_String input1="test@gmail.com"_
1. @ & . should be present;
1. @ & . should not be repeated;
1. there should be five charcters between @ and .;
1. there should be atleast 3 characters before @ ;
1. the end of mail id should be .com;

*Validate Password*
_validation based on following criteria:_
- minimum length is 8
- should contain any of these @/_/#
- should not start with number/special chars(@/#/_)
- should not end with special chars
- can contain numbers,letters,special chars


*PAN card number validation:*
* all letters shud be in caps,shud be of 8 chars.
* first three letters must be alphabets.
* next 4 letters shud be digits and last letter shud be an alphabet



