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
public class Info 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iid;
	private String iname;
	private String iage;
	private String imobileno;
	@OneToOne
	private Address add;
	

}
