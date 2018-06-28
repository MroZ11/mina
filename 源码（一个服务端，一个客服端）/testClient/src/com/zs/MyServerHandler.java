package com.zs;

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
		  for (int i = 0; i < 10; i++) {  
	            session.write("ɱ�˿ϵ»�");
	        }  
	}
	
	//���͸��ͷ�����Ϣ
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		System.out.print("���͸��ͷ�����Ϣ��"+message);
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
		
		session.write("���Ѿ���¼�ɹ���");  
	}
	
}
