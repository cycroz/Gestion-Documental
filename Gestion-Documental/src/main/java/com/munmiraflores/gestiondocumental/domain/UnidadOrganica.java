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
@Table(name = "RHDUOR01")
public class UnidadOrganica implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7626938374554455395L;

	@Id
	@Column(name = "UNIORGCOD")
	@GeneratedValue
	private Integer uniorgcod;
	
	@Column(name = "UNIORGNOM")
	private String uniorgnom;
	
	@Column(name = "UNIORGSIG")
	private String uniorgsig;
	
	@Column(name = "UNIORGFCHI")
	private String uniorgfchi;
	
	@Column(name = "UNIORGFCHF")
	private String uniorgfchf;
	
	@Column(name = "TUNIORGCOD")
	private Integer tuniorgcod;
	
	@Column(name = "UOBLEGCOD")
	private Integer uoblegcod;
	
	@Column(name = "UNIORGHRAC")
	private String uniorghrac;
	
	@Column(name = "UNIORGFCHC")
	private String uniorgfchc;
	
	@Column(name = "UNIORGUSRC")
	private Integer uniorgusrc;
	
	@Column(name = "UNIORGHRAM")
	private String uniorghram;
	
	@Column(name = "UNIORGFCHM")
	private String uniorgfchm;
	
	@Column(name = "UNIORGUSRM")
	private Integer uniorgusrm;
	
	@Column(name = "UNIORGCARC")
	private Integer uniorgcarc;
	
	@Column(name = "UNIORGTEL")
	private String uniorgtel;
	
	@Column(name = "UNIORGFAX")
	private String uniorgfax;
	
	@Column(name = "UNIORGANX")
	private String uniorganx;
	
	@Column(name = "UNIORGEQV")
	private Integer uniorgeqv;
	
	@Column(name = "UNIORGSAM")
	private Integer uniorgsam;
	
	@Column(name = "UNIORGACT")
	private Integer uniorgact;
	
	@Column(name = "UNIORGACT1")
	private Integer uniorgact1;
	
	@Column(name = "UNIORGWKSC")
	private String uniorgwksc;
	
	@Column(name = "UNIORGWKSM")
	private String uniorgwksm;
	
	@Column(name = "UORGNUBICO")
	private Integer uorgnubico;
	
	@Column(name = "UORGTPOJER")
	private Integer uorgtpojer;
	
	@Column(name = "UORGVCRONO")
	private Integer uorgvcrono;
	
	@Column(name = "UORGCEXTCR")
	private Integer uorgcextcr;
	
	@Column(name = "UNIORGVALD")
	private Integer uniorgvald;

	public Integer getUniorgcod() {
		return uniorgcod;
	}

	public void setUniorgcod(Integer uniorgcod) {
		this.uniorgcod = uniorgcod;
	}

	public String getUniorgnom() {
		return uniorgnom;
	}

	public void setUniorgnom(String uniorgnom) {
		this.uniorgnom = uniorgnom;
	}

	public String getUniorgsig() {
		return uniorgsig;
	}

	public void setUniorgsig(String uniorgsig) {
		this.uniorgsig = uniorgsig;
	}

	public String getUniorgfchi() {
		return uniorgfchi;
	}

	public void setUniorgfchi(String uniorgfchi) {
		this.uniorgfchi = uniorgfchi;
	}

	public String getUniorgfchf() {
		return uniorgfchf;
	}

	public void setUniorgfchf(String uniorgfchf) {
		this.uniorgfchf = uniorgfchf;
	}

	public Integer getTuniorgcod() {
		return tuniorgcod;
	}

	public void setTuniorgcod(Integer tuniorgcod) {
		this.tuniorgcod = tuniorgcod;
	}

	public Integer getUoblegcod() {
		return uoblegcod;
	}

	public void setUoblegcod(Integer uoblegcod) {
		this.uoblegcod = uoblegcod;
	}

	public String getUniorghrac() {
		return uniorghrac;
	}

	public void setUniorghrac(String uniorghrac) {
		this.uniorghrac = uniorghrac;
	}

	public String getUniorgfchc() {
		return uniorgfchc;
	}

	public void setUniorgfchc(String uniorgfchc) {
		this.uniorgfchc = uniorgfchc;
	}

	public Integer getUniorgusrc() {
		return uniorgusrc;
	}

	public void setUniorgusrc(Integer uniorgusrc) {
		this.uniorgusrc = uniorgusrc;
	}

	public String getUniorghram() {
		return uniorghram;
	}

	public void setUniorghram(String uniorghram) {
		this.uniorghram = uniorghram;
	}

	public String getUniorgfchm() {
		return uniorgfchm;
	}

	public void setUniorgfchm(String uniorgfchm) {
		this.uniorgfchm = uniorgfchm;
	}

	public Integer getUniorgusrm() {
		return uniorgusrm;
	}

	public void setUniorgusrm(Integer uniorgusrm) {
		this.uniorgusrm = uniorgusrm;
	}

	public Integer getUniorgcarc() {
		return uniorgcarc;
	}

	public void setUniorgcarc(Integer uniorgcarc) {
		this.uniorgcarc = uniorgcarc;
	}

	public String getUniorgtel() {
		return uniorgtel;
	}

	public void setUniorgtel(String uniorgtel) {
		this.uniorgtel = uniorgtel;
	}

	public String getUniorgfax() {
		return uniorgfax;
	}

	public void setUniorgfax(String uniorgfax) {
		this.uniorgfax = uniorgfax;
	}

	public String getUniorganx() {
		return uniorganx;
	}

	public void setUniorganx(String uniorganx) {
		this.uniorganx = uniorganx;
	}

	public Integer getUniorgeqv() {
		return uniorgeqv;
	}

	public void setUniorgeqv(Integer uniorgeqv) {
		this.uniorgeqv = uniorgeqv;
	}

	public Integer getUniorgsam() {
		return uniorgsam;
	}

	public void setUniorgsam(Integer uniorgsam) {
		this.uniorgsam = uniorgsam;
	}

	public Integer getUniorgact() {
		return uniorgact;
	}

	public void setUniorgact(Integer uniorgact) {
		this.uniorgact = uniorgact;
	}

	public Integer getUniorgact1() {
		return uniorgact1;
	}

	public void setUniorgact1(Integer uniorgact1) {
		this.uniorgact1 = uniorgact1;
	}

	public String getUniorgwksc() {
		return uniorgwksc;
	}

	public void setUniorgwksc(String uniorgwksc) {
		this.uniorgwksc = uniorgwksc;
	}

	public String getUniorgwksm() {
		return uniorgwksm;
	}

	public void setUniorgwksm(String uniorgwksm) {
		this.uniorgwksm = uniorgwksm;
	}

	public Integer getUorgnubico() {
		return uorgnubico;
	}

	public void setUorgnubico(Integer uorgnubico) {
		this.uorgnubico = uorgnubico;
	}

	public Integer getUorgtpojer() {
		return uorgtpojer;
	}

	public void setUorgtpojer(Integer uorgtpojer) {
		this.uorgtpojer = uorgtpojer;
	}

	public Integer getUorgvcrono() {
		return uorgvcrono;
	}

	public void setUorgvcrono(Integer uorgvcrono) {
		this.uorgvcrono = uorgvcrono;
	}

	public Integer getUorgcextcr() {
		return uorgcextcr;
	}

	public void setUorgcextcr(Integer uorgcextcr) {
		this.uorgcextcr = uorgcextcr;
	}

	public Integer getUniorgvald() {
		return uniorgvald;
	}

	public void setUniorgvald(Integer uniorgvald) {
		this.uniorgvald = uniorgvald;
	}

}
