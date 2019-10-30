package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="msg")
public class Msg {
	//id
	
	private String id;
	//协议版本号
	
	private double v;
	//消息头
	
	private Head head;
	//消息体
	
	private Body body;
	public String getId() {
		return id;
	}
	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}
	public double getV() {
		return v;
	}
	@XmlAttribute
	public void setV(double v) {
		this.v = v;
	}
	public Head getHead() {
		return head;
	}
	@XmlElement(name = "head")
	public void setHead(Head head) {
		this.head = head;
	}
	public Body getBody() {
		return body;
	}
	@XmlElement(name = "body")
	public void setBody(Body body) {
		this.body = body;
	}
	
	
}
