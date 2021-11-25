package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "students")
public class Student {
	
	
	
	public Student() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(name = "policy", nullable = false)
	private String policy;
	
	@Column(name = "company", nullable = false)
	 private String company;
	 
	@Column(name = "inflation", nullable = false)
	 private String inflation;
	 
	@Column(name = "rerate_2010")
	 private String rerate_2010;
	
	@Column(name = "rerate_2013")
	 private String rerate_2013;
	
	@Column(name = "rerate_2013_supp")
	 private String rerate_2013_supp;
	
	@Column(name = "rerate_2016")
	 private String rerate_2016;
	
	@Column(name = "rerate_2016_supp")
	 private String rerate_2016_supp;
	
	@Column(name = "rerate_2019")
	 private String rerate_2019;
	
	@Column(name = "rerate_2019_supp")
	 private String rerate_2019_supp;
	
	@Column(name = "dra_eligible")
	 private String dra_eligible;
	
	@Column(name = "cnfo_eligible")
	 private String cnfo_eligible;
	
	@Column(name = "ecnfo_eligible")
	 private String ecnfo_eligible;
	
	@Column(name = "shared_cost_eligible")
	 private String shared_cost_eligible;
	
	@Column(name = "staggered")
	 private String staggered;
	
	@Column(name = "extra_info")
	 private String extra_info;
	
	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getInflation() {
		return inflation;
	}

	public void setInflation(String inflation) {
		this.inflation = inflation;
	}

	public String getRerate_2010() {
		return rerate_2010;
	}

	public void setRerate_2010(String rerate_2010) {
		this.rerate_2010 = rerate_2010;
	}

	public String getRerate_2013() {
		return rerate_2013;
	}

	public void setRerate_2013(String rerate_2013) {
		this.rerate_2013 = rerate_2013;
	}

	public String getRerate_2013_supp() {
		return rerate_2013_supp;
	}

	public void setRerate_2013_supp(String rerate_2013_supp) {
		this.rerate_2013_supp = rerate_2013_supp;
	}

	public String getRerate_2016() {
		return rerate_2016;
	}

	public void setRerate_2016(String rerate_2016) {
		this.rerate_2016 = rerate_2016;
	}

	public String getRerate_2016_supp() {
		return rerate_2016_supp;
	}

	public void setRerate_2016_supp(String rerate_2016_supp) {
		this.rerate_2016_supp = rerate_2016_supp;
	}

	public String getRerate_2019() {
		return rerate_2019;
	}

	public void setRerate_2019(String rerate_2019) {
		this.rerate_2019 = rerate_2019;
	}

	public String getRerate_2019_supp() {
		return rerate_2019_supp;
	}

	public void setRerate_2019_supp(String rerate_2019_supp) {
		this.rerate_2019_supp = rerate_2019_supp;
	}

	public String getDra_eligible() {
		return dra_eligible;
	}

	public void setDra_eligible(String dra_eligible) {
		this.dra_eligible = dra_eligible;
	}

	public String getCnfo_eligible() {
		return cnfo_eligible;
	}

	public void setCnfo_eligible(String cnfo_eligible) {
		this.cnfo_eligible = cnfo_eligible;
	}

	public String getEcnfo_eligible() {
		return ecnfo_eligible;
	}

	public void setEcnfo_eligible(String ecnfo_eligible) {
		this.ecnfo_eligible = ecnfo_eligible;
	}

	public String getShared_cost_eligible() {
		return shared_cost_eligible;
	}

	public void setShared_cost_eligible(String shared_cost_eligible) {
		this.shared_cost_eligible = shared_cost_eligible;
	}

	public String getStaggered() {
		return staggered;
	}

	public void setStaggered(String staggered) {
		this.staggered = staggered;
	}

	public String getExtra_info() {
		return extra_info;
	}

	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
	}


	public Student(java.lang.String firstName, java.lang.String lastName, java.lang.String email,
			java.lang.String policy, java.lang.String company, java.lang.String inflation, java.lang.String rerate_2010,
			java.lang.String rerate_2013, java.lang.String rerate_2013_supp, java.lang.String rerate_2016,
			java.lang.String rerate_2016_supp, java.lang.String rerate_2019, java.lang.String rerate_2019_supp,
			java.lang.String dra_eligible, java.lang.String cnfo_eligible, java.lang.String ecnfo_eligible,
			java.lang.String shared_cost_eligible, java.lang.String staggered, java.lang.String extra_info) {
		super();
	
		this.policy = policy;
		this.company = company;
		this.inflation = inflation;
		this.rerate_2010 = rerate_2010;
		this.rerate_2013 = rerate_2013;
		this.rerate_2013_supp = rerate_2013_supp;
		this.rerate_2016 = rerate_2016;
		this.rerate_2016_supp = rerate_2016_supp;
		this.rerate_2019 = rerate_2019;
		this.rerate_2019_supp = rerate_2019_supp;
		this.dra_eligible = dra_eligible;
		this.cnfo_eligible = cnfo_eligible;
		this.ecnfo_eligible = ecnfo_eligible;
		this.shared_cost_eligible = shared_cost_eligible;
		this.staggered = staggered;
		this.extra_info = extra_info;
	}
	
	
	
	
	

	 
	 
	
}
