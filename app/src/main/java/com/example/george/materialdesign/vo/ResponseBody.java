package com.example.george.materialdesign.vo;


public class ResponseBody {

	private int code;
	private String status;
	private String copyright;
	private String attributionText;
	private String attributionHTML;
	private Dada data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getAttributionText() {
		return attributionText;
	}
	
	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}
	public String getAttributionHTML() {
		return attributionHTML;
	}
	
	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}
	public Dada getData() {
		return data;
	}
	
	public void setData(Dada data) {
		this.data = data;
	}
	
	
	
}
