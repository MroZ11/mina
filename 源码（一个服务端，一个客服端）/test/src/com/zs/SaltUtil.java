package com.zs;

import com.ndktools.javamd5.Mademd5;

public class SaltUtil {
	String key="6552334";
	
	public String encodePsw(String pwd){
		
		Mademd5 md = new Mademd5();
		String s= md.toMd5(pwd+key);
		String ss = s.substring(0, 15);
		String sss = md.toMd5(ss);
		return sss;
	}
	
}
