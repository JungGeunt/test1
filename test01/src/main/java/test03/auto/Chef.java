package test03.auto;

import org.springframework.stereotype.Component;

//@Component	//context에 component-scan에서 찾을 컴포넌트 지정하는 어노테이션 ->어플리케션 컨포넘트에 집어넣음
public class Chef {
	public void cook() {
		System.out.println("파스타 요리22");
	}
}
