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
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import Jama.Matrix;

import com.sun.javafx.geom.Matrix3f;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.marshaller.NioEscapeHandler;
import com.sun.xml.internal.fastinfoset.algorithm.UUIDEncodingAlgorithm;

public class Test {
	
	
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub  
        // 创建Socket  
        NioSocketConnector connector = new NioSocketConnector();  
        //设置传输方式  
      /*  DefaultIoFilterChainBuilder chain = connector.getFilterChain();  
        ProtocolCodecFilter filter = new ProtocolCodecFilter(new ObjectSerializationCodecFactory());  
        chain.addLast("objectFilter", filter); */
        
        connector.getFilterChain().addLast("CodeFilter", new ProtocolCodecFilter(new TextLineCodecFactory()));
  
        //设置消息处理  
        connector.setHandler(new MinaClientHanlder());  
        //超时设置  
        connector.setConnectTimeoutCheckInterval(30);  
        //连接  
        ConnectFuture cf = connector.connect(new InetSocketAddress("localhost", 9898));  
        cf.awaitUninterruptibly();  
        
        Scanner scanner = new Scanner(System.in);
   
        while (true) {
        	 String a = scanner .nextLine();
        	  cf.getSession().write(new Date().toString()+"-"+a);
		}	
	}

}
