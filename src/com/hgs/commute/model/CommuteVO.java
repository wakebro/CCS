package com.hgs.commute.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class CommuteVO {
	
	private int c_no;
	private int m_no;
	private String in_time;
	private String out_time;
	private Timestamp clock_in_time;
	private Timestamp clock_out_time;
	private SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getIn_time() {
		return in_time;
	}
	public void setIn_time() {
		if(this.clock_in_time == null)
			this.in_time = null;
		else
			this.in_time = date.format(this.clock_in_time);
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time() {
		if(this.clock_out_time == null)
			this.out_time = null;
		else
			this.out_time = date.format(this.clock_out_time);
	}
	public Timestamp getClock_in_time() {
		return clock_in_time;
	}
	public void setClock_in_time(Timestamp clock_in_time) {
		this.clock_in_time = clock_in_time;
	}
	public Timestamp getClock_out_time() {
		return clock_out_time;
	}
	public void setClock_out_time(Timestamp clock_out_time) {
		this.clock_out_time = clock_out_time;
	}
	@Override
	public String toString() {
		return "CommuteVO [c_no=" + c_no + ", m_no=" + m_no + ", in_time=" + in_time + ", out_time=" + out_time
				+ ", clock_in_time=" + clock_in_time + ", clock_out_time=" + clock_out_time + "]";
	}
	
	
	
	
	
}
