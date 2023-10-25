package test03.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	
	//@Resource 어노테이션
	//1. @Resource(name = "chef2") //이름을 지정한 경우 해당 이름으로 우선해서 검색 
	//2. @Resource				   //이름을 지정하지 않으면 타입으로 찾아서 주입
	
//	@Autowired(required = false)
	private Chef chef;
	
//	@Autowired //타입(1),이름(2)
	public Hotel(/* @Qualifier("c2") */ Chef chef) {
		this.chef = chef;
		System.out.println("Hotel에서 DI가 된 Chef 객체 : "+ this.chef);
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
}
