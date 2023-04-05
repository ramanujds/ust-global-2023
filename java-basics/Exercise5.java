/*

Problem : To find the highest among two numbers

Algorithm :

Step 1: Start
Step 2: Input num1,num2
Step 3: check if num1 = num2 then print "both are equal"
		else check if num1>num2 then print num1
		else print num2
Step 4: End

*/

class Exercise5{
 public static void main(String []args){
	int num1, num2;
	num1 = 20;
	num2 = 20;
	if(num1 == num2){
		System.out.println("Both are equal");
	}
	else if(num1>num2){
		System.out.println(num1);
	}
	else{
		System.out.println(num2);
	}
   }
}