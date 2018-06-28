package com.zs;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MyServerHandler extends IoHandlerAdapter {
	
	
	//异常捕获
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		System.out.println("有异常了,异常处理启动！");
	}

	
	@Override
	public void inputClosed(IoSession session) throws Exception {
	
	}

	//接收到客服端消息
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
	
		System.out.println( "接受到客服端消息："+message);
		  for (int i = 0; i < 10; i++) {  
	            session.write("杀了肯德基");
	        }  
	}
	
	//发送给客服端消息
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		System.out.print("发送给客服端消息："+message);
	}
	
	//session关闭
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("session关闭!");
	}
	
	//session创建
	@Override
	public void sessionCreated(IoSession session) throws Exception {
		System.out.println("sessionCreated!");
	}
	
	// session 空闲的时候调用  
	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		System.out.println("session 空闲的时候调用  ");
	}
	
	// 创建了session 后会回调sessionOpened  
	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println(" 创建了session 后会回调sessionOpened  ");
		
		session.write("你已经登录成功！");  
	}
	
}
