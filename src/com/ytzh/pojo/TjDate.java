package com.ytzh.pojo;

public class TjDate {
	private String FDate;
	private String Begin;
	private String End;
	public String getFDate() {
		return FDate;
	}
	public void setFDate(String fDate) {
		FDate = fDate;
	}
	public String getBegin() {
		return Begin;
	}
	public void setBegin(String begin) {
		Begin = begin;
	}
	public String getEnd() {
		return End;
	}
	public void setEnd(String end) {
		End = end;
	}
	@Override
	public String toString() {
		return "TjDate [Begin=" + Begin + ", End=" + End + ", FDate=" + FDate
				+ "]";
	}
	
	
}
