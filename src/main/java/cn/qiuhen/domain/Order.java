package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="order")
public class Order {
	//彩种id
	
	private int lotteryid;
	//期号
	
	private int issue;
	//票信息
	
	private Ticket ticket;
	public int getLotteryid() {
		return lotteryid;
	}
	@XmlAttribute
	public void setLotteryid(int lotteryid) {
		this.lotteryid = lotteryid;
	}
	public int getIssue() {
		return issue;
	}
	@XmlAttribute
	public void setIssue(int issue) {
		this.issue = issue;
	}
	public Ticket getTicket() {
		return ticket;
	}
	@XmlElement(name = "ticket")
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
