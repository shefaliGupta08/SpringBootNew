package com.springboot.demoBoot.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	
	private String aname;
	
	@Id
	private String aid;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + "]";
	}
	
	

}
