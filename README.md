# Class Room Notes and Examples

### Daily Retrospective : 
[Daily Retrospective Link](https://docs.google.com/spreadsheets/d/1DgLWccxLu-BuvyqDJ_PL5fd0zRw89hK3RPiH1JZooW4/edit?usp=sharing)

### 4ls

[4Ls Link](https://ramanuj.atlassian.net/wiki/spaces/~5d61372ffaa9600c3609ae97/pages/33219/UST+Java+B2+4LS)

## Important Links

* Core Java - Overview, First Java Program, Variables, Datatypes, Literals, Operators, Expressions and Conditional Statements.		https://www.geeksforgeeks.org/java-programming-basics/
* Core Java - String, Arrays, Looping Statements, Methods, Class, Object, static		https://www.programiz.com/java-programming
* Core Java - Access Modifiers, Packages, Encapsulation		https://www.javatpoint.com/inheritance-in-java
* Core Java - Polymorphism, Inheritance, Abstraction, Interface		https://www.geeksforgeeks.org/polymorphism-in-java/
* Core Java - Collection Framework, ArrayList, Map, Set.		https://www.geeksforgeeks.org/collections-in-java-2/
* Core Java - File Handling, Threads and Garbage Collections, Exception Handling, Enums.		https://www.javatpoint.com/java-io
* Java 8 - Java 8 Features - Lambda Expressions, Streams, Filters, java.time.		https://www.journaldev.com/2389/java-8-features-with-examples
* Junit 5 and Maven - Writing basic tests, Assert Statements, Testing Exceptions		https://howtodoinjava.com/junit-5-tutorial/
* RDBMS - DDL Commands, DML Commands		https://www.javatpoint.com/mysql-tutorial
* RDBMS - Operators, Aggregate, String, Date Functions		https://www.geeksforgeeks.org/sql-tutorial/
* Web Basics - Learn the basics of HTML5 & CSS3		https://www.w3schools.com/html/
* JavaScript - Learn the basics of Javascript		https://www.javatpoint.com/javascript-tutorial![image](https://user-images.githubusercontent.com/42864715/172369342-f5a11d3a-15fe-46da-9253-4ef28c976f30.png)


## Day 1



### M1 - Java + SQL + GIT
### M2 - Web(Client Side)
   - HTML CSS JS Bootstrap Angular
### M3 - Web(Server Side)
   - Java EE, Spring, Microservices, Docker
### M4 - Cloud and Deployment
   - AWS, Kubernetes, CICD, DevOps
### M5 - Project
### M6 - Advanced Concepts (Cloud, DevOps, Testing)

What is Java?
----------------
Java - Object Oriented Programming Language

Java Dev Setup
-----------------
- JDK
- JAVAC - Java Compiler
- Runtime Libraries
- JVM - Java Virtual Machine

Writing our 1st Java Program
-----------------------------

```java
class Program{
  public static void main(String []args){
	System.out.println("UST Global");
  }
}

```


- Program.java

- javac Program.java -> Compile

- Program.class -> Byte code

- java Program -> Executing the code

- Program 1:

```java
class Program{
  public static void main(String []args){
	String companyName = "UST Global";
	System.out.println(companyName);
  }
}
```

- Program 2 :

```java
class Program{
  public static void main(String []args){
    String message = "Hello everyone";
	String companyName = "UST Global";
	System.out.println(message+", welcome to "+companyName);
  }
}
// Hello everyone, welcome to UST Global

```

How to store numbers:
-------------------------

- Integer : int 


- Program 3:

```java
class Program{
  public static void main(String []args){
    	int num = 10;
	System.out.println(num);
  }
}

```

### Day 1 Retrospective
-------------------
#### What did we learn?
-------------
* What is Java?
* Why Java?
* How to write Java Program
* How to compile and run java code

#### Any challenges?
--------------
* Software setup issues
* Network Connection issues

#### What is there for tomorrow?
-----------------------------
* Variables and Data Type
* SDLC and Program Flow

### Day 2 Standup :
#### What did we complete yesterday?


#### What are we going to do today?
 - Understand the Software Development Lifecycle
 - Understand the difference between Waterfall and Agile Model
 - Understand the basic program flow

#### Dev Tools Setup
-----------------
* JDK-11 - Done
* Git - Done
* Spring Tools - Done
* VS Code - Done
* Node JS - Done
* Postman - Done
* MySQL - Done


#### Data Types in Java
---------------------
Primary Types:
---------------

- Numeric - int
	    	  - short
		      - byte
		      - long
- Decimal - float
		      - double
- Character- char
- Boolean  - boolean (true/false)

- What is the difference between float and double?

Secondary/Referrence Types :
--------------------------------

* class
* object
* arrays
* String

* What is typecasting?
* Where do we need it?

How to read input from user
---------------------------

* Import Scanner from util package

```java
import java.util.Scanner;
```
* Create an object of Scanner
```java
Scanner scan = new Scanner(System.in);
```
* To read integer :
```java
int num1 = scan.nextInt();
```
* To read float :
```java
float num1 = scan.nextFloat();
```

* To read double :
```java
float num1 = scan.nextDouble();
```
* To read String :
```java
String name = scan.nextLine();
```

### Day 2 Retrospective
-----------------------
#### What did we learn today?
------------------------
* SDLC
* Waterfall vs Agile
* Algorithms and Flowchart
* Java variables and data-type
* typecasting
* How to read input from the user

#### What did we like?
* we are able to write code
* we are able to run code

#### Any challenges?
--------------


#### What is there for tomorrow?
-----------------------------
- [ ] GIT
- [ ] Cotrol flow/ decission making in Java



### Day 3 Standup
------------------

#### What did we complete yesterday?


#### What are we going to do today?

GIT and GitLab
--------------

- What is git?

- Version Control System

- What is GitLab?

- Online source code repository (remote repository)

- Git has repositories
- We can save our changes to the repository using <b>git commit</b>
- we can push the code to repote repository using <b>git push</b>
- we can clone/make a copy of the remote repository on out local system using <b>git clone</b>
- we can pull the changes from remote repository using <b>git pull</b>



Few GitLab alternatives
------------------------

* GitHub
* BitBucket
* AWS CodeCommit

What is forking?
-----------------
Making your own copy of a remote repository

Setting up the SSH key access
-------------------------------

Profile -> Preferences -> SSH Keys

* Open Terminal/CMD
* Type ```bash ssh-keygen -t rsa -b 2048 -C "<email>" ```

* Enter file in which to save the key

* Enter passphrase
- keep it blank
* Enter same passphrase again
- keep it blank
* Go to the location where keys are saved
* Open the .pub key file using notepad
* Copy the content
* Paste it to the Key section on GitLab
* Add the key
* Also add the private key on your local machine using terminal
```bash 
eval $(ssh-agent -s)
ssh-add <key-file-name>

```
How to clone a repository?
--------------------------

1. Go to the repository
1. Click on Clone
1. Clone SSH
 (_ Copy the link_) 
1. Open Termainal/CMD inside your desired folder
* <b> Few important points</b> 
* copy the private-key in the desired folder
* Also add the private key on your on that desired folder using terminal/git-bash
* Hints - repeat the eval and ssh-add commands

1. Type ``` git clone <repo-link> ```


How commit new changes?
------------------------

1. Add all the changes to stagging 
``` git add . ```
1. Commit the changes
``` git commit -m "a suitable message" ```
* <b> NB: Commit will save all the changes to local repository </b>

1. Update/Push the commit to remote 
``` git push```

<b> NB: To see the status of the repository we can use </b> ``` git status ```

How to get all the changes from remote to local?
-------------------------------------------------

``` git pull ```

Steps for completing the Exercises/Assignments
-----------------------------------
1. Go to the respective exercise/assignment repo
1. Fork the repo
1. Clone the <b>forked</b> repo on your local machine (Hints - Follow the previous steps)
* <b> NB. Don't clone a repository inside another repository </b>

1. Modify/Complete the exercise
1. Commit and Push



Conditional evaluation in Java
------------------------------
* if-else
* switch
* conditional operator

How to use if-else in java?
---------------------------
```
if(condition){
	statements
	...
}
else{
	statements
	...
}

```

**Exercise8:**
Write an algorithm for accepting a character and then display whether it is a vowel or a constant.

**Solution** : https://gitlab-ust.stackroute.in/ramanujds9/ust-b2-classroom-repo/-/blob/master/java-basics/Exercise8.java

**Exercise 9:**
Write an algorithm for accepting three numbers and display the highest number among the three numbers.

**Solution**: https://gitlab-ust.stackroute.in/ramanujds9/ust-b2-classroom-repo/-/blob/master/java-basics/Exercise9.java

**Exercise 10:**
Write an algorithm for accepting the age of user and if the age is valid, check whether the user is a kid, a teenager, an adult or a senior citizen.

**Solution** : https://gitlab-ust.stackroute.in/ramanujds9/ust-b2-classroom-repo/-/blob/master/java-basics/Exercise10.java




#### Operators in Java

- **Arithmetic Operator**

>  + - * / %

- **Relational Operator**
> < <= > >= == !=
- **Logical Operator**
- && - AND 
- || - OR 
- ! - NOT
- **Bitwise Operator**
- & - Bitwise AND 
- | - Bitwise OR
- **Assignment Operator**
- =
- **Arithmetic Assignment Operator**
- += -= *= /= %=
- **Increment/Decrement Operator**
- ++ --




##### FizzBuzz Program

- Read an input
- if number is divisible by 3 Print Fizz
- if number is divisible by 5 Print Buzz
- if number is divisible by both 3 & 5 Print FizzBuzz
- otherwise print the number

**Sample Output**

- Input : 6
- Output : Fizz
- Input : 15
- Output : FizzBuzz
- Input : 4
- Output : 4


### Day 3 Retrospective

**What did we learn today?**

- **Git:**
- How to setup git for clone, commit and push
- Creating ssh keys
- How to complete exercises on stackroute platform?


- **Java :**
- **Conditional evaluation in Java**
- if else
- switch
- conditional operator statement

- Different Operators in java
- Completed multiple programs

**What went well?**

- **Able to write code and execute**
- **Able to understand the concepts**


**Any challenges?**
- gitlab is not accessible through UST Networks

**What are we going to learn tomorrow?**

- switch
- conditional operator statement
- Looping


### Day 4

What did we complete yesterday?

if-else

What are we going to learn today?

switch
conditional operator
looping

----------


switch statement :
-----------------------
**Syntax**

```java

switch(variable){
	case value1:
		statement;
		break;
	case value2:
		statement;
		break;
	...
	...
	default:
		statement;
		break;
}



```
Conditional operator statement
--------------------------------
**Syntax**

output = expression ? value if true : value if false

```java
	int num1, num2;
	num1 = 20;
	num2 = 10;
	int largest = num1>num2 ? num1 : num2;
	System.out.println(largest);
```

Display message based on the day.
--------------------------------
int day;

day = 1
message = "Monday - its time to start the week"
day = 2
message = "Tuesday - ...."
..
..
day = 6
message = "Saturday - Enjoy your weekend"
day = 7
message = "Sunday - Plan for the upcoming week"





Looping
--------
while
do-while
for

Print the message "Welcome to UST Global" 5 times

while(condition){
	statement;
	...
 }


do-while loop :
------------------
do{
	statements;
	....
}while(condition)


while - entry-controlled
do-while - exit-controlled


for loop
-----------

for(initialization ; condition ; increment/decrement){
	statements;
	...
}


for(int count=10 ; count<5 ; count++){
	System.out.println("Welcome to UST Global");
}






### Day 4 Retrospective

#### What did we learn today?
- Conditional evaluation with switch statement
- using ternary/conditional operator
- loops
- understand the need for loops
- explored different types of loops
- the use of break and continue
- 10+ Problems related to looping and conditional statements are Done

#### What went well?

- Shoutout to Alphons for completing the tasks quickly
- Shoutout to Shafna for completing the tasks quickly
- Shoutout to Amal for completing the tasks quickly

#### Any challenges?

- No issues

#### What is there for tomorrow?

- arrays
- String

----------

### Day 5:

Arrays
--------

- collection of values

- How to define an array?

data-type []array-name = new data-type[size];

int []numbers;
numbers = new int[5];

* new keyword is used for dynamic allocation

int x = 5;




int []data = {10,15,20,30};

data.length; returns the length of the array

Printing an array : 

```java

for(int index=0; index<nums.length; index++)
			System.out.println(nums[index]);


```


### How to work with Multi-Dimensional Array
--------------------------------------------

2D Array -> Matrix

int [][]matrix = new int[3][3];

Strings in Java
------------------

String str = "karan";
String str2 = "rohit";
String str3 = "Rohit";
String email = "rohit12@yahoo.com";

- How to check the equality of two strings :

 str.equals(str2)  -> false
 str2.equals(str3) -> false
 str2.equalsIgnoreCase(str3) -> true

- How to compare two Strings?
 String str1 = "karan abc";
 String str2 = "karan";
 int difference = str1.compareTo(str2);

- How to get the length of a string?

	str1.length();

- How to get the character at a position?
	str1.charAt(3)  ->  a

- How to get the position of a character?

	str1.indexOf("n") -> 4
	str1.indexOf("a") -> 1
	
- How to check whether a string contains another string?	

	String line = "hello karan, how are you doing?"

	line.contains("karan")   -> true

	line.indexOf("rahul")  -> -1



#### Complete the first four challenges -- https://www.hackerrank.com/domains/java



## Practice Statement - Unique Arrays

**A company has revamped the health insurance policy for all its insured employees and has increased their health cover by 20%. In order to provide them this facility, the human resource department needs to collect the data of all insured employees and prepare a unique list of their employee ids.​ Write a program to help the HR manager to create a unique list of employee ids to avoid duplication.​​**

### Example 

    Sample Input :
        int[] salesDepartmentEmpIds = {101,105,106,107,108,109};
    Sample Output:
        true
    ---------------------------------------------
    Sample Input :
        int[] accountDepartmentEmpIds = {201,205,206,207,208,209,201};
    Sample Output:
        false



# Practice Statement - Shortest word 

**Write a Java program to get the strings as input from the user and push them to an array. Find the shortest word in the list of strings and display the same on the screen.**

**Sample Input**

	words[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant" }

**Sample Output**

	Shortest word is Pensive





StringBuilder and StringBuffer
------------------------------
Strings cannot be modified
StringBuffer and StringBuilder are mutable

How to create StringBuilder?
----------------------------

StringBuilder sbd = new StringBuilder("hello");
StringBuffer sbr = new StringBuffer("welcome");

- StringBuffer vs StringBuilder
 StringBuffer is Thread-Safe
 StringBuilder methods are asynchronous 

- Reversing a given String
- replace an word with another word
String str = "hello everyone, how are you? Everyone should complete the task"
Replace everyone with folks

str=str.replace("everyone","folks");


str.split(" ") -> will create an array of strings containing all the words in str separated by space

str.split(",") -> will create an array of strings containing all the words in str separated by comma

trim() -> removes all the trailing spaces

What are we going to learn today?
----------------------------------
classes
methods
objects 

find the minimum of two numbers

int findMin(int num1, int num2){

}

find the average of 3 numbers

double findAverage(int num1, int num2, int num3){
	
}

- Print string in uppercase

  void printString(String str){
	System.out.println(str.toUpperCase());
   }


-- Sort an array

static int[] sort(int []arr){
...
}


-----------
method - > self contained block of statement

return-type method-name(arguments)

class - data(fields) + methods

class is a user-defined type

```java

class Employee{
	int employeeId;
	String employeeName;
	String email;

	public printEmployee(){
		System.out.println("ID : "+	employeeId);
		System.out.println("Name : "+employeeName);
		System.out.println("Email : "+email);
	}
}
	
```

```java
Employee e1 = new Employee();
Employee e2 = new Employee();
```


<b>What is a Constructor?</b>

- is a special type of method is used for initializing the fields

- it has the same name as the class

- it invokes automatically when we create an object


### Day 6 Retrospective
------------------------

What did we learn today?

- String vs StringBuffer/StringBuilder
- Using methods in Java.
- What is a class in java
- What are objects.
- How to create objects in Java
- Significance of static keyword in java 

What went well?

- We have gone through multiple examples to understand the concept of classes and objects

Any challenges?

- New concepts.. Need more practice and hands-ons

What is there for tomorrow?

- understand the use of this keyword
- explore different features of OOP
- Understand encapsulation
- Access modifiers 


 Access Modifiers in Java
----------------------------
- public 
- private 
- protected
- default



## Practice : Inheritance 
1. Implement an superclass called Item and define all common operations on this class  (constructors, getters, setters, print, checkIn, checkOut, addItem, etc). Have  private data for: identification number, title, and number of copies.  
2. Implement an subclass of Item named WrittenItem and define all common operations  on this class. Added private data for author.  
3. Implement 2 subclasses of WrittenItem: Book and JournalPaper.  
3.1. Class Book: no new private data. When needed, override/overload methods from the  superclass. 3.2. Class JournalPaper: added private data for year published. When needed,  override/overload methods from the superclass.  
4. Implement another subclass of Item named MediaItem and define all common  operations on this class. Added private data for runtime (integer).  
5. Implement 2 subclasses of MediaItem: Video and CD.  
5.1. Class Video: added private data for director, genre and year released. When  needed, override/overload methods from the superclass. 
5.2. Class CD: added private data for artist and genre. When needed, override/overload  methods from the superclass.  
Write the definitions of these classes and a client program (your choice!) showing them in use.


Day 11 Retrospective
---------------------
What did we learn today?
-----------------------
- Inheritance
- Method overriding
- use of super keyword
- use of protected access modifier

What went well?
------------------------
- Able to write code related to inheritance

What needs to be improved?
------------------------
- More practice on logical problem solving

What is there for tomorrow?
--------------------------

- abstract classes
- interfaces
- final keyword






