package cn.qiuhen.domain;

public class RestMsg {
	//状态码
	private int code;
	//总数
	private int count;
	//消息
	private Object msg;
	//数据
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Object getMsg() {
		return msg;
	}
	public void setMsg(Object msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "RestMsg [code=" + code + ", count=" + count + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
