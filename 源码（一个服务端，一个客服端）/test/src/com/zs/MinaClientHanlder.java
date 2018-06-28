package com.zs;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MinaClientHanlder extends IoHandlerAdapter {

	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
	
	}

	@Override
	public void inputClosed(IoSession session) throws Exception {
		
	}

	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		  System.out.println("客户端接受到了消息："+message) ;  
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
	
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		 System.out.println("client close");  
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println("客户端登陆");  
        session.write("HelloWorld");  
  
//        messageReceived(session,"");  
        for (int i = 0; i < 10; i++) {  
            session.write("p 412703840,4,1,1410248991,73451566,22615771,1239,125,90,0,0,1,900\r\n"  
                    + "p 412703840,4,1,1410248991,73451566,22615771,1239,125,90,0,0,1,900\r\n"  
                    + "p 412703840,4,1,1410248991,73451566,22615771,1239,125,90,0,0,1,900\r\n"  
                    + "p 412703840,4,1,1410248991,73451566,22615771,1239,125,90,0,0,1,900");  
        }  
	}
	
}
