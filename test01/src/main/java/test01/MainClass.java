package test01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//Spring에 applicationContext 사용하지 않은 방법 (POJO)
		SpringTest test = new SpringTest();
		test.method();

		//ApplicationContext를 이용한 방법
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml"); //classpatg ->resource
		SpringTest test2 = ct.getBean("good" , SpringTest.class);
		test2.method(); //applicationContext에 설정된 객체의 정보를 불러서 사용!
		System.out.println("applicationContext에 있는 설정을 이용한 객체 호출");
		ct.close();
		System.out.println("ct 객체를 삭제한 후 객체 실행 테스트");
		test2.method();
		
	}

}
