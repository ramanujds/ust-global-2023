# Class Room Notes and Examples

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













