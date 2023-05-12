package com.ust.app;


class Multiplier{
	
	public static synchronized void multiplyAndPrint(int n) {
		System.out.println("Multiplication table of "+n);
		for(int i=1; i<=10; i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
	
}

class MyThread1 extends Thread{
	public void run() {
		Multiplier.multiplyAndPrint(5);
	}
}

//class MyThread2 implements Runnable{
//	public void run() {
//		Multiplier.multiplyAndPrint(10);
//	}
//}


public class ThreadExamples {
	
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Runnable r1 = ()-> Multiplier.multiplyAndPrint(10);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
		
	}

}
