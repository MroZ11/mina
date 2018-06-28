package com.zs;

import java.util.Date;
import java.util.Scanner;

import org.apache.mina.core.session.IoSession;

public class SendMessageThread implements Runnable{  
    
    private IoSession session = null;  
    private String msg = null;  
      
    public SendMessageThread(IoSession session) {  
        this.session = session;  
    }  
      
    public SendMessageThread(IoSession session, String msg) {  
        this.msg = msg;  
    }  
      
    @Override  
    public void run() {  
        // TODO Auto-generated method stub  
    	Scanner s  = new Scanner(System.in);
        if(null == msg) {  
            msg = "test";  
        }  
        while(true) {  
        	msg = s.nextLine();
            session.write(new Date()+":"+msg);  
            try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
  
    public String getMsg() {  
        return msg;  
    }  
  
    public void setMsg(String msg) {  
        this.msg = msg;  
    }  
  
}  
