package test02;

import java.awt.CheckboxGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;

import test01.SpringTest;

import test02.setter.DataBaseDev;
import test03.auto.AuTest;
import test03.auto.Chef;
import test03.auto.Hotel;
import test03.auto.Memtest;

public class MainClass {
	
	public static void main(String[] args) {
		//Resource에 있는ApplicationContext.xml 불러오는 코드
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:applicationContext2.xml");
		
		//Hotel hotel = ct.getBean("hotel", Hotel.class);
		Hotel test =ct.getBean("hotel", Hotel.class);
		Chef chef =ct.getBean("chef", Chef.class);
		//test02.construct.Chef chef2 =ct.getBean("chef2", test02.construct.Chef.class);
		Chef chef2 =ct.getBean("chef2", Chef.class);
		test02.construct.Chef chef3 = ct.getBean("chef3", test02.construct.Chef.class);
		
		System.out.println("chef : " + chef);
		System.out.println("chef2 : " +chef2);
		System.out.println("chef3 : " + chef3);
		
		
		
		test.getChef().cook();
		chef2.cook();
		
		
		//xml에 정의 DI에 의해서 Chef클래스를 별도로 불러오지 않고, 정의하지않은 상태에서 불러옴
		//hotel.getChef().cook();
//		ct.close();
		//hotel.getChef().cook();
		
//		DataBaseDev DBtest = ct.getBean("DBdev" , DataBaseDev.class);
//		
//		DBtest.toString();
//		DBtest.test();
//		System.out.println(DBtest.getDriver());
//		System.out.println(DBtest.getUrl());
//		System.out.println(DBtest.getUid());
//		System.out.println(DBtest.getUpw());
//		
//		//SpringTest 호출
//		//프로토 타입
//		SpringTest test1 =ct.getBean("test", SpringTest.class);
//		SpringTest test2 =ct.getBean("test", SpringTest.class);
//		System.out.println(test1);
//		System.out.println(test2);
//		
//		//bean객체 호출 -> 같은 빈객체에서 참조
//		Hotel hotel2 = ct.getBean("hotel", Hotel.class);
//		System.out.println(test);
//		System.out.println(hotel2);
		
		
		//이름은 클래스명의 앞글자가 소문자로 바뀜
		AuTest atest = ct.getBean("auTest", AuTest.class);
		Memtest mtest = ct.getBean("memTest", Memtest.class);
		Memtest mtest2 = ct.getBean("memTest2", Memtest.class);
		
		System.out.println("atest 결과 : " +atest.getMem().getUid());
		System.out.println("memtest 결과 " +mtest.getUid());
		System.out.println("memtest2 결과 " +mtest2.getUid());

	}

}
