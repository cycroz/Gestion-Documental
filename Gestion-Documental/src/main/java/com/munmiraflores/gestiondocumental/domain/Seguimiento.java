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
@Table(name = "TDDDOC02")
public class Seguimiento implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7626938374554455395L;

	@Id
	@Column(name = "DOCCOD")
	@GeneratedValue
	private Integer doccod;
	
	@Column(name = "SEGCOD")
	private Integer segcod;
	
	@Column(name = "SEGGLO")
	private String segglo;
	
	@Column(name = "PCDID")
	private Integer pcdid;
	
	@Column(name = "TARCOD")
	private Integer tarcod;
	
	@Column(name = "SEGPRFCOD")
	private String segprfcod;
	
	@Column(name = "SEGUSRCOD")
	private Integer segusrcod;
	
	@Column(name = "SEGUOORICO")
	private Integer seguoorico;
	
	@Column(name = "SEGCARORIC")
	private Integer segcaroric;
	
	@Column(name = "SEGEMPORIC")
	private Integer segemporic;
	
	@Column(name = "SEGEMPORII")
	private Integer segemporii;
	
	@Column(name = "SEGUODESCO")
	private Integer seguodesco;
	
	@Column(name = "SEGCARDESC")
	private Integer segcardesc;
	
	@Column(name = "SEGEMPDESC")
	private Integer segempdesc;
	
	@Column(name = "SEGEMPDESI")
	private Integer segempdesi;
	
	@Column(name = "SEGFCH")
	private String segfch;
	
	@Column(name = "SEGHRA")
	private String seghra;
	
	@Column(name = "SEGUSR")
	private Integer segusr;
	
	@Column(name = "SEGTPODEST")
	private String segtpodest;
	
	@Column(name = "SEGWKSMOD")
	private String segwksmod;
	
	@Column(name = "SEGWKSCRE")
	private String segwkscre;
	
	@Column(name = "SEGPCSID")
	private Integer segpcsid;
	
	@Column(name = "SEGTARRSL")
	private Integer segtarrsl;
	
	@Column(name = "SEGDOCSTS")
	private Integer segdocsts;
	
	@Column(name = "SEGSTSCOD")
	private Integer segstscod;

	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getSegcod() {
		return segcod;
	}

	public void setSegcod(Integer segcod) {
		this.segcod = segcod;
	}

	public String getSegglo() {
		return segglo;
	}

	public void setSegglo(String segglo) {
		this.segglo = segglo;
	}

	public Integer getPcdid() {
		return pcdid;
	}

	public void setPcdid(Integer pcdid) {
		this.pcdid = pcdid;
	}

	public Integer getTarcod() {
		return tarcod;
	}

	public void setTarcod(Integer tarcod) {
		this.tarcod = tarcod;
	}

	public String getSegprfcod() {
		return segprfcod;
	}

	public void setSegprfcod(String segprfcod) {
		this.segprfcod = segprfcod;
	}

	public Integer getSegusrcod() {
		return segusrcod;
	}

	public void setSegusrcod(Integer segusrcod) {
		this.segusrcod = segusrcod;
	}

	public Integer getSeguoorico() {
		return seguoorico;
	}

	public void setSeguoorico(Integer seguoorico) {
		this.seguoorico = seguoorico;
	}

	public Integer getSegcaroric() {
		return segcaroric;
	}

	public void setSegcaroric(Integer segcaroric) {
		this.segcaroric = segcaroric;
	}

	public Integer getSegemporic() {
		return segemporic;
	}

	public void setSegemporic(Integer segemporic) {
		this.segemporic = segemporic;
	}

	public Integer getSegemporii() {
		return segemporii;
	}

	public void setSegemporii(Integer segemporii) {
		this.segemporii = segemporii;
	}

	public Integer getSeguodesco() {
		return seguodesco;
	}

	public void setSeguodesco(Integer seguodesco) {
		this.seguodesco = seguodesco;
	}

	public Integer getSegcardesc() {
		return segcardesc;
	}

	public void setSegcardesc(Integer segcardesc) {
		this.segcardesc = segcardesc;
	}

	public Integer getSegempdesc() {
		return segempdesc;
	}

	public void setSegempdesc(Integer segempdesc) {
		this.segempdesc = segempdesc;
	}

	public Integer getSegempdesi() {
		return segempdesi;
	}

	public void setSegempdesi(Integer segempdesi) {
		this.segempdesi = segempdesi;
	}

	public String getSegfch() {
		return segfch;
	}

	public void setSegfch(String segfch) {
		this.segfch = segfch;
	}

	public String getSeghra() {
		return seghra;
	}

	public void setSeghra(String seghra) {
		this.seghra = seghra;
	}

	public Integer getSegusr() {
		return segusr;
	}

	public void setSegusr(Integer segusr) {
		this.segusr = segusr;
	}

	public String getSegtpodest() {
		return segtpodest;
	}

	public void setSegtpodest(String segtpodest) {
		this.segtpodest = segtpodest;
	}

	public String getSegwksmod() {
		return segwksmod;
	}

	public void setSegwksmod(String segwksmod) {
		this.segwksmod = segwksmod;
	}

	public String getSegwkscre() {
		return segwkscre;
	}

	public void setSegwkscre(String segwkscre) {
		this.segwkscre = segwkscre;
	}

	public Integer getSegpcsid() {
		return segpcsid;
	}

	public void setSegpcsid(Integer segpcsid) {
		this.segpcsid = segpcsid;
	}

	public Integer getSegtarrsl() {
		return segtarrsl;
	}

	public void setSegtarrsl(Integer segtarrsl) {
		this.segtarrsl = segtarrsl;
	}

	public Integer getSegdocsts() {
		return segdocsts;
	}

	public void setSegdocsts(Integer segdocsts) {
		this.segdocsts = segdocsts;
	}

	public Integer getSegstscod() {
		return segstscod;
	}

	public void setSegstscod(Integer segstscod) {
		this.segstscod = segstscod;
	}

}
