package test03.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AuTest {
	private Memtest mem;
	
	public AuTest() {
		System.out.println(this.mem);
	}

	public Memtest getMem() {
		return mem;
	}

	@Autowired
	@Qualifier("t1")
	public void setMem(Memtest mem) {
		System.out.println("setter : " +mem);
		this.mem = mem;
	}
	
	
}
