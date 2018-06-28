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
	}
	
	
}
