package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="Request")  
public class Xms {
	private String smsType;
	private String fromNum;
	private String content;
	private String status;
	private String deliverCode;
	public String getSmsType() {
		return smsType;
	}
	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}
	public String getFromNum() {
		return fromNum;
	}
	public void setFromNum(String fromNum) {
		this.fromNum = fromNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeliverCode() {
		return deliverCode;
	}
	public void setDeliverCode(String deliverCode) {
		this.deliverCode = deliverCode;
	}
	
	@Override
	public String toString() {
		return "[smsType="+smsType+",fromNum="+fromNum+",content="+content+",status="+status+",deliverCode="+deliverCode+"]";
	}
 

}