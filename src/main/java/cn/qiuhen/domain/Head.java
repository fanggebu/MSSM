package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="head")
public class Head {
	//商户编号
	private String agentid;
	//命令码
	private int cmd;
	//时间戳
	private Long timestamp;
	//校验码
	private String cipher;
	
	public String getAgentid() {
		return agentid;
	}
	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getCipher() {
		return cipher;
	}
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
	
	
}
