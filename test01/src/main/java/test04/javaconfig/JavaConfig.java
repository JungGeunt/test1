package test04.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test01.SpringTest;
import test02.setter.DataBaseDev;
import test03.auto.Chef;
import test03.auto.Hotel;
import test03.auto.Memtest;

@Configuration //설정 클래스... (XML 설정 파일)

public class JavaConfig {

	//<bean id ="chef" class="test03.auto.Chef"></bean>
	@Bean 
	public Chef chef() {    //첫번쨰 Chef 반환타입 두번 쨰 chef 이름 
		return new Chef();
	}
	
	//<bean id ="test" class="test01.SpringTest"/>
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	//<bean id ="hotel" class="test03.auto.Hotel"><constructor-arg ref="chef"/>
	@Bean
	public Hotel hotel() {
		//Hotel은 생성자로 Chef객체를 받기 때문에 매개값으로 chef()함수를 주입합니다.
		return new Hotel(chef());
	}
//	 <bean id ="DBdev" class="test02.setter.DataBaseDev">
//		<property name="url" value="jdbc:mysql://localhost:3306/test"/>
//		<property name="uid" value="mytest"/>
//		<property name="upw" value="mytest"/>
//</bean> 
	@Bean
	public DataBaseDev DBdev() {
		//setter를 통해서 값을 받기 때문에 객체를 생성하고 , 세터 지정후에 반환
		DataBaseDev dv = new DataBaseDev();
		dv.setUrl("jdbc:mysql://localhost:3306/test");
		dv.setUid("mytest");
		dv.setUpw("mytest");
		return dv;
	}
	
	
}
