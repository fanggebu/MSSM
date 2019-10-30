package cn.qiuhen.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="body")
public class Body {
	//订单
	
	private Order order;

	public Order getOrder() {
		return order;
	}
	@XmlElement(name = "order")
	public void setOrder(Order order) {
		this.order = order;
	}
	

}
