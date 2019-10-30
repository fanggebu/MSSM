package cn.qiuhen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qiuhen.domain.Msg;

/**
   * 彩票
 * @author kangjian
 *
 */
@Controller
public class SendOrderController {
	
	/**
	 * 彩票投注
	 */
	@RequestMapping(value = "/putOrder.action", method = RequestMethod.POST, consumes = "application/xml")
	@ResponseBody
	public Msg put(@RequestBody Msg msg) {
		Msg msg1 = new Msg();
		msg1=msg;		
		
		return msg1;
	}
	/**
	 * 彩票查詢
	 */
	@RequestMapping(value = "/selectOrder.action", method = RequestMethod.POST, consumes = "application/xml")
	@ResponseBody
	public void select() {
		
	}
	

}
