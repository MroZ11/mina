package com.zs;

public class TestRunable  implements  Runnable{

	@Override
	public void run() {	
		System.out.println(Thread.currentThread().getName()+"A");
		System.out.println(Thread.currentThread().getName()+"B");
		System.out.println(Thread.currentThread().getName()+"C");
		System.out.println(Thread.currentThread().getName()+"D");
		System.out.println(Thread.currentThread().getName()+"E");
		System.out.println(Thread.currentThread().getName()+"F");
		System.out.println(Thread.currentThread().getName()+"G");
		System.out.println(Thread.currentThread().getName()+"H");
		System.out.println(Thread.currentThread().getName()+"I");
		System.out.println(Thread.currentThread().getName()+"J");
		System.out.println(Thread.currentThread().getName()+"K");
		System.out.println(Thread.currentThread().getName()+"L");
		System.out.println(Thread.currentThread().getName()+"M");
	}

}
