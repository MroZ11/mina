package com.zs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;























import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import Jama.Matrix;

import com.sun.javafx.geom.Matrix3f;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.marshaller.NioEscapeHandler;
import com.sun.xml.internal.fastinfoset.algorithm.UUIDEncodingAlgorithm;

public class Test {
	
	
	public static void main(String[] args) throws Exception {
		
		try {
			//第一步 创建一个NioSocketAcceptor 对象  
			NioSocketAcceptor  acceptor  = new 	NioSocketAcceptor();
			//第二步设置handler  
			acceptor.setHandler(new MyServerHandler());
			//第三步,获取拦截器，发来的消息都需要通过拦截器拦截之后才能接收到  
			//添加一个拦截器对数据进行加解码TextLineCodecFactory()  
			acceptor.getFilterChain().addLast("CodeFilter", new ProtocolCodecFilter(new TextLineCodecFactory()));
			//第四步，绑定端口号  
			acceptor.bind(new InetSocketAddress("127.0.0.1", 9898));
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		/*double[][] t  = {{1,2},
								{3,4}};
		
		
		double[][] t2 =  {{2,3,4},
								{5,6,7}};
		
		Matrix m1 = new Matrix(t);
		Matrix m2 = new Matrix(t2);
		Matrix m3=  m1.times(m2);
		m3.print(10, 0);*/

		
		/*RandomAccessFile infFile = new RandomAccessFile("E:/1.txt", "rw");
		RandomAccessFile outfFile = new RandomAccessFile("E:/data/w.txt", "rw");
		outfFile.seek(outfFile.length());
		
		ByteBuffer buffer = ByteBuffer.allocate(48);
		FileChannel inChannel = infFile.getChannel();
		FileChannel outChannel = outfFile.getChannel();
		
		int currentDateNum = inChannel.read(buffer);
		
		while (currentDateNum!=-1) {
			buffer.flip();
			while (buffer.hasRemaining()) {
				outChannel.write(buffer);
			}
			buffer.clear();
			currentDateNum = inChannel.read(buffer);
		}
		
		inChannel.close();
		outChannel.close();
		infFile.close();
		outfFile.close();*/
		
		/*String a= "2";
		String b= "3";
		String c = "13+0.111";
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Double hour = (Double)engine.eval("300/1700");*/
	
		
		 /*Scanner in = new Scanner(System.in);
		  float f = in.nextFloat();
		  int fInt = (int) f;
		  BigDecimal b1 = new BigDecimal(Float.toString(f));
		  BigDecimal b2 = new BigDecimal(Integer.toString(fInt));
		  float fPoint = b1.subtract(b2).floatValue();
		  System.out.println("整数部分为:" + fInt + "\n" + "小数部分为: " + fPoint);*/
		
		/*BigDecimal b1 = new BigDecimal(2.2521);
		b1.setScale(2,BigDecimal.ROUND_DOWN);
		System.out.println(b1.setScale(2,BigDecimal.ROUND_DOWN).toString());*/
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.set(2017,10,17);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2017,10,2);
		
		long a = calendar.getTimeInMillis();
		long b= calendar2.getTimeInMillis();
		System.out.println((b-a)/(1000*3600*24));*/
		
		/*writeOut();
	    System.out.println((int)((Math.random()*9+1)*100000));  */
		
		
		/*Timer timer = new Timer();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 13);
		calendar.set(Calendar.MINUTE, 20);
		calendar.set(Calendar.SECOND, 0); 
		Date date = calendar.getTime();

		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("这是一个定时任务");
				
			}
		}, date,2000);*/
		
		/*Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("这是一个定时任务");
			}
		};
	
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(runnable, 2,2, TimeUnit.SECONDS);*/
		
		
		
		/*TestRunable runable = new TestRunable();
		TestThread testThread = new TestThread();
		Thread thread = new Thread(runable,"线程一一一一一一：");
		testThread.setName("线程丨丨丨丨丨丨丨丨：");
		MyCallable callable = new MyCallable();
	
		
		ExecutorService fixedThreadPool  = 	 Executors.newFixedThreadPool(2);
		fixedThreadPool.shutdown();
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5); 
		
		scheduledThreadPool.schedule(thread, 2, TimeUnit.SECONDS);
		scheduledThreadPool.awaitTermination(1, TimeUnit.SECONDS);
		scheduledThreadPool.schedule(testThread, 1, TimeUnit.SECONDS);
		 
		ScheduledFuture future = scheduledThreadPool.schedule(callable, 1, TimeUnit.SECONDS);

		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	
	
	public static void writeOut(){
		boolean run = true;
		int succes=0;
		int wrong=0;
		
		int count =0;
		while (run) {
			int a  =Math.round((float)Math. random()*100);
			int b  =Math.round((float)Math. random()*100);
			System.out.println(a+"+"+b+"=?");
			String anws = null;
			Scanner scanner = new Scanner(System.in);
			anws = scanner.next();
			int c = a+ b;
			if(anws .equals("y")||anws.equals("Y")){
				NumberFormat numberFormat = NumberFormat.getInstance();
				numberFormat.setMaximumFractionDigits(2);
				System.out.println("总共:"+count+";正确："+succes+";错误："+wrong+";正确率："+numberFormat.format((float) succes / (float) count * 100));
				run=false;
				break;
			}
			try {
				if(c==Integer.parseInt(anws)){
					succes++;
					count++;
					System.out.println("√√√√√√√正确√√(输入Y结束)√√");
				}else{
					wrong++;
					count++;
					System.out.println("XXXXXXX错误XX(输入Y结束)XX");
				}
			} catch (Exception e) {
				wrong++;
				count++;
				System.out.println("XXXXXXX错误XX(输入Y结束)XX");
			}
		}
	
	}
	
	
	
	
}
