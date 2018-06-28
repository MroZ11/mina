package com.zs;

import org.apache.mina.core.buffer.IoBuffer;
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
        System.err.println("收到消息：" +message);  
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		System.out.println("正在发送消息：" +message);  
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
  
//        messageReceived(session,"");  
        
	}
	
}
