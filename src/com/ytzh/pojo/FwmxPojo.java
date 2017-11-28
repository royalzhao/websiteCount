package com.ytzh.pojo;



public class FwmxPojo {
	private String url;
	private String ip;
	private String city;
	private String NowFormatDate;
	private String NowFormatTime;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNowFormatDate() {
		return NowFormatDate;
	}
	public void setNowFormatDate(String nowFormatDate) {
		NowFormatDate = nowFormatDate;
	}
	
	public String getNowFormatTime() {
		return NowFormatTime;
	}
	public void setNowFormatTime(String nowFormatTime) {
		NowFormatTime = nowFormatTime;
	}
	@Override
	public String toString() {
		return "FwmxPojo [NowFormatDate=" + NowFormatDate + ", city=" + city
				+ ", ip=" + ip + ", url=" + url + ",NowFormatTime="+NowFormatTime+"]";
	}
	
	
	
}
