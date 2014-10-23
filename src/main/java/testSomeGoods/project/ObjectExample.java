package testSomeGoods.project;

import java.util.Date;

public class ObjectExample {
	private String name;
	private Integer num;
	private Date date;

	public Integer getNum() {
		return num;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public ObjectExample(String name) {
		this.name = name;
	}

	public ObjectExample() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
