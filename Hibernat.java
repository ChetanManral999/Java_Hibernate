package com.telusko.DemoHib;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name="hibtab")
@Entity
//@Table(name="hib_table")
public class Hibernat {
	@Id
	private int aid;
	//@Transient//To remove the column give below
	private String aname;
	//@Column(name="YOurfav_color")//To change the column color of the column given below
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Hibernat [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
}
