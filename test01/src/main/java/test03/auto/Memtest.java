package test03.auto;

import org.springframework.stereotype.Component;

@Component
public class Memtest {
	//멤버 변수
	private String url;
	private String uid;
	private String upw;
	
	//getter, setter
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	
	
}
