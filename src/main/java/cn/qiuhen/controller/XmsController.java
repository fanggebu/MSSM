package cn.qiuhen.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public Map<String, Object> receiverSMS(@RequestBody Xms restSms) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		log.info("回调参数：" + restSms.toString());

		return result;
	}

}
