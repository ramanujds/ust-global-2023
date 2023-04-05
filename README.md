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
* GIT
* Cotrol flow/ decission making in Java


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

* Go to the repository
* Click on Clone
* Clone SSH
- Copy the link 
* Open Termainal/CMD inside your desired folder
** copy the private-key in the desired folder
* Also add the private key on your on that desired folder using terminal/git-bash
** Hints - repeat the eval and ssh-add commands
* Type ```bash git clone <repo-link> ```


