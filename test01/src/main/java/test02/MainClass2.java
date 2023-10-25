package test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;

import test02.construct.Hotel;

public class MainClass2 {

	@Autowired
	public Hotel hotel;
	
	public static void main(String[] args) {
		//Resource에 있는ApplicationContext.xml 불러오는 코드
				GenericXmlApplicationContext ct = 
						new GenericXmlApplicationContext("classpath:applicationContext2.xml");
				
				
				

	}

}
