package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlResponse {
	String head;
	String body;
	int appId;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[head=[appId=10],body=1]";
	}

}
