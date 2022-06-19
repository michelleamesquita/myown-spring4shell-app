package com.example.handlingformsubmission;

public class Greeting {

	private float id;
	private String content;

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getContent() {
		content = String.valueOf((this.getId()* 9 / 5 + 32));
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
