package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentPersonalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name, mobno, email;
	@OneToOne(cascade = CascadeType.ALL)
	private StudentAddressDetails addr;
	@OneToOne(cascade = CascadeType.ALL)
	private StudentEducationDetails edu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentAddressDetails getAddr() {
		return addr;
	}

	public void setAddr(StudentAddressDetails addr) {
		this.addr = addr;
	}

	public StudentEducationDetails getEdu() {
		return edu;
	}

	public void setEdu(StudentEducationDetails edu) {
		this.edu = edu;
	}
}
