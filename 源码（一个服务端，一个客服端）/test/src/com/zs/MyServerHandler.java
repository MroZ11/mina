package com.zs;

import java.util.Date;
import java.util.Scanner;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MyServerHandler extends IoHandlerAdapter {
	
	
	//�쳣����
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		System.out.println("���쳣��,�쳣����������");
	}

	
	@Override
	public void inputClosed(IoSession session) throws Exception {
	
	}

	//���յ��ͷ�����Ϣ
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		
		System.out.println( "���ܵ��ͷ�����Ϣ��"+message);
		
	}
	
	//���͸��ͷ�����Ϣ
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		
	}
	
	//session�ر�
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("session�ر�!");
	}
	
	//session����
	@Override
	public void sessionCreated(IoSession session) throws Exception {
		System.out.println("sessionCreated!");
	}
	
	// session ���е�ʱ�����  
	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		System.out.println("session ���е�ʱ�����  ");
	}
	
	// ������session ���ص�sessionOpened  
	@Override
	public void sessionOpened(IoSession session) throws Exception {
		
		System.out.println(" ������session ���ص�sessionOpened  ");
	    new 	Thread(new SendMessageThread(session)).start();
	    
	}
	
}
