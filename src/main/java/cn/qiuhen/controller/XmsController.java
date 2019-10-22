package cn.qiuhen.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qiuhen.domain.XmlResponse;
import cn.qiuhen.domain.Xms;

/**
 * xml数据处理
 * 
 * @author qiuhen
 *
 */
@Controller
public class XmsController {
	private static final Logger log = Logger.getLogger(XmsController.class);

	@RequestMapping(value = "/receiverSMS.action", method = RequestMethod.POST, consumes = "application/xml")
	@ResponseBody
	public XmlResponse receiverSMS(@RequestBody Xms restSms) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		log.info("回调参数：" + restSms.toString());
		String xmlBody = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<msg v=\"协议版本\" id=\"消息序列号(不可重复)\">\r\n" + 
				"  <head>\r\n" + 
				"<agentid>商户编号</agentid>\r\n" + 
				"    <cmd>命令码</cmd>\r\n" + 
				"    <timestamp>时间戳</timestamp>\r\n" + 
				"    <cipher>校验码(MD5(加密消息体))</cipher>\r\n" + 
				"  </head>\r\n" + 
				"  <body>请求/响应消息体</body>\r\n" + 
				"</msg>";
		return new XmlResponse();
	}

}
