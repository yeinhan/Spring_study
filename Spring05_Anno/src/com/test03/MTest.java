package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//1.인터페이스  Lgtv, SamsungTv
		//2.bean 설정 관련 anotation을 작성 한 다음
		//3.main에서 설정파일을 읽어 bean을 등록 한 뒤 getBean()을 통해 생성된 bean을 확인
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
//		LgTv lg = factory.getBean("lgTv",LgTv.class);
//		lg.powerOn();
//		lg.powerDown();
//		lg.volUp();
//		lg.volDown();
//		
//		SamsungTv ss = factory.getBean("samsungTv",SamsungTv.class);
//		ss.powerOn();
//		ss.powerDown();
//		ss.volUp();
//		ss.volDown();
		
		Tv tv = factory.getBean("lgTv",Tv.class);
		tv.powerDown();
		tv.powerOn();
		tv.volDown();
		tv.volUp();
		
		tv = factory.getBean("samsung",SamsungTv.class);
		tv.powerDown();
	}
}
