package cn.qiuhen.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class String2DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		
		/*
		 * try { System.out.println(source); SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //parse(),将字符串转化成日期对象
		 * //format(),将日期对象转化成字符串 Date date = sdf.parse(source); return date; } catch
		 * (ParseException e) { // TODO Auto-generated catch block e.printStackTrace();
		 * } Date d = new Date(); return d;
		 */
		return null;
	}

	

}
