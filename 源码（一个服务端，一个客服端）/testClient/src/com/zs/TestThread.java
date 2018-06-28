package com.zs;

public class TestThread extends Thread {

	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName()+1);
		System.out.println(Thread.currentThread().getName()+2);
		System.out.println(Thread.currentThread().getName()+3);
		System.out.println(Thread.currentThread().getName()+4);
		System.out.println(Thread.currentThread().getName()+5);
		System.out.println(Thread.currentThread().getName()+6);
		System.out.println(Thread.currentThread().getName()+7);
		System.out.println(Thread.currentThread().getName()+8);
		System.out.println(Thread.currentThread().getName()+9);
		System.out.println(Thread.currentThread().getName()+10);
		System.out.println(Thread.currentThread().getName()+11);
	}
	
	
	
}
