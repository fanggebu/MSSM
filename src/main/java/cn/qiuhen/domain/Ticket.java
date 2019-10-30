package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ticket")
public class Ticket {
	//票流水号
	
	private String seq;
	//内容
	private String content;
	
	public String getSeq() {
		return seq;
	}
	@XmlAttribute
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
