package com.example.george.materialdesign.model;


public class ResponseBody {

	private int code;
	private String status;
	private String copyright;
	private String attributionText;
	private String attributionHTML;
	private Data data;
	
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
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	
	
}
