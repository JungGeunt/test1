package test04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test01.SpringTest;
import test04.javaconfig.JavaConfig;

public class MainClass3 {

	public static void main(String[] args) {
		//@ Configuration 설정이 있는 클래스 호출
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		SpringTest t = ctx.getBean("test", SpringTest.class);
		t.method();
	}

}
