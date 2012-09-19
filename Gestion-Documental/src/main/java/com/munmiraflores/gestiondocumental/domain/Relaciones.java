package com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * For a complete reference see 
 * <a href="http://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/">
 * Hibernate Annotations Communit Documentations</a>
 */
@Entity
@Table(name = "TDDRDO01")
public class Relaciones implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7626938374554455395L;

	@Id
	@Column(name = "RELDOCCOD")
	@GeneratedValue
	private Integer reldoccod;
	
	@Column(name = "RELDOCPDEC")
	private Integer reldocpdec;
	
	@Column(name = "RELDOCHJOC")
	private Integer reldochjoc;
	
	@Column(name = "TRELCOD")
	private Integer trelcod;
	
	@Column(name = "RELDOCFINI")
	private String reldocfini;
	
	@Column(name = "RELDOCFFIN")
	private String reldocffin;
	
	@Column(name = "RELDOCOBS")
	private String reldocobs;
	
	@Column(name = "RELDOCUSRC")
	private Integer reldocusrc;
	
	@Column(name = "RELDOCFCHC")
	private String reldocfchc;
	
	@Column(name = "RELDOCHRAC")
	private String reldochrac;
	
	@Column(name = "RELDOCUSRM")
	private Integer reldocusrm;
	
	@Column(name = "RELDOCFCHM")
	private String reldocfchm;
	
	@Column(name = "RELDOCHRAM")
	private String reldochram;
	
	@Column(name = "RELDOCTPO")
	private String reldoctpo;
	
	@Column(name = "RELDOCPCSI")
	private Integer reldocpcsi;
	
	@Column(name = "RELDOCSTSR")
	private Integer reldocstsr;

	public Integer getReldoccod() {
		return reldoccod;
	}

	public void setReldoccod(Integer reldoccod) {
		this.reldoccod = reldoccod;
	}

	public Integer getReldocpdec() {
		return reldocpdec;
	}

	public void setReldocpdec(Integer reldocpdec) {
		this.reldocpdec = reldocpdec;
	}

	public Integer getReldochjoc() {
		return reldochjoc;
	}

	public void setReldochjoc(Integer reldochjoc) {
		this.reldochjoc = reldochjoc;
	}

	public Integer getTrelcod() {
		return trelcod;
	}

	public void setTrelcod(Integer trelcod) {
		this.trelcod = trelcod;
	}

	public String getReldocfini() {
		return reldocfini;
	}

	public void setReldocfini(String reldocfini) {
		this.reldocfini = reldocfini;
	}

	public String getReldocffin() {
		return reldocffin;
	}

	public void setReldocffin(String reldocffin) {
		this.reldocffin = reldocffin;
	}

	public String getReldocobs() {
		return reldocobs;
	}

	public void setReldocobs(String reldocobs) {
		this.reldocobs = reldocobs;
	}

	public Integer getReldocusrc() {
		return reldocusrc;
	}

	public void setReldocusrc(Integer reldocusrc) {
		this.reldocusrc = reldocusrc;
	}

	public String getReldocfchc() {
		return reldocfchc;
	}

	public void setReldocfchc(String reldocfchc) {
		this.reldocfchc = reldocfchc;
	}

	public String getReldochrac() {
		return reldochrac;
	}

	public void setReldochrac(String reldochrac) {
		this.reldochrac = reldochrac;
	}

	public Integer getReldocusrm() {
		return reldocusrm;
	}

	public void setReldocusrm(Integer reldocusrm) {
		this.reldocusrm = reldocusrm;
	}

	public String getReldocfchm() {
		return reldocfchm;
	}

	public void setReldocfchm(String reldocfchm) {
		this.reldocfchm = reldocfchm;
	}

	public String getReldochram() {
		return reldochram;
	}

	public void setReldochram(String reldochram) {
		this.reldochram = reldochram;
	}

	public String getReldoctpo() {
		return reldoctpo;
	}

	public void setReldoctpo(String reldoctpo) {
		this.reldoctpo = reldoctpo;
	}

	public Integer getReldocpcsi() {
		return reldocpcsi;
	}

	public void setReldocpcsi(Integer reldocpcsi) {
		this.reldocpcsi = reldocpcsi;
	}

	public Integer getReldocstsr() {
		return reldocstsr;
	}

	public void setReldocstsr(Integer reldocstsr) {
		this.reldocstsr = reldocstsr;
	}

}
