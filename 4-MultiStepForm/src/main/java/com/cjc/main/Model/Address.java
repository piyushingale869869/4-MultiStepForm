package com.cjc.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int aid;
	public String acityname;
	public String aareaname;
	public String alandmark;
	
	@OneToOne
	private Education edu;

}
