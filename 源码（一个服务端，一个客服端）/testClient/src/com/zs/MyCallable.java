package com.zs;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("-10%");
		System.out.println("--20%");
		System.out.println("---30%");
		System.out.println("----40%");
		System.out.println("-----50%");
		System.out.println("------60%");
		System.out.println("-------70%");
		System.out.println("--------80%");
		System.out.println("---------90%");
		System.out.println("----------100%");
		return "Íê³É";
	}

}
