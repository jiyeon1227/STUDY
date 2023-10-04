// 자바빈 클래스 == DTO(Data Transfer Object)클래스
package javaBean;

public class SimpleBean {// 서로 다른 폴더는 서로 다른 패키지로 인식 -> 꼭 접근제어자를 public으로 해야함!

	// private 라서 getter, setter를 사용해야함
	private String msg; // 자바에서는 필드라 부르지만, 자바빈에서는 프로퍼티(property)라고 부름
	private String name;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
