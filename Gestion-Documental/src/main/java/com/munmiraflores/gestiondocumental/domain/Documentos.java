package com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * For a complete reference see 
 * <a href="http://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/">
 * Hibernate Annotations Communit Documentations</a>
 */
@Entity
@Table(name = "TDDDOC01")
public class Documentos implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7626938374554455395L;

	@Id
	@Column(name = "DOCCOD")
	@GeneratedValue
	private Integer doccod;
	
	@Column(name = "DOCANONUM")
	private Integer docanonum;
	
	@Column(name = "DOCCOR")
	private Integer doccor;
	
	@Column(name = "TPODOCCOD")
	private String tpodoccod;
	
	@Column(name = "DOCSOLTDI")
	private String docsoltdi;
	
	@Column(name = "DOCSOLCON")
	private String docsolcon;
	
	@Column(name = "DOCSOLNCMP")
	private String docsolncmp;
	
	@Column(name = "DOCRLEGTDI")
	private String docrlegtdi;
	
	@Column(name = "DOCRLEGCON")
	private String docrlegcon;
	
	@Column(name = "DOCASU")
	private String docasu;
	
	@Column(name = "DVIGUCNUM")
	private Integer dvigucnum;
	
	@Column(name = "DVIGUCDIR")
	private String dvigucdir;
	
	@Column(name = "DOCDIRCOR")
	private Integer docdircor;
	
	@Column(name = "DOCDIRFIS")
	private Integer docdirfis;
	
	@Column(name = "DOCDIROCOD")
	private Integer docdirocod;
	
	@Column(name = "DOCDIRONOM")
	private String docdironom;
	
	@Column(name = "DOCDIRONRO")
	private Integer docdironro;
	
	@Column(name = "DOCNUMFOL")
	private Integer docnumfol;
	
	@Column(name = "DOCOBS")
	private String docobs;
	
	@Column(name = "DOCFCHREC")
	private String docfchrec;
	
	@Column(name = "DOCFCHFIN")
	private String docfchfin;
	
	@Column(name = "DOCFCHCRE")
	private String docfchcre;
	
	@Column(name = "DOCUSRCRE")
	private Integer docusrcre;
	
	@Column(name = "DOCHRACRE")
	private String dochracre;
	
	@Column(name = "DOCFCHMOD")
	private String docfchmod;
	
	@Column(name = "DOCUSRMOD")
	private Integer docusrmod;
	
	@Column(name = "DOCHRAMOD")
	private String dochramod;
	
	@Column(name = "DOCUODESCO")
	private Integer docuodesco;
	
	@Column(name = "DOCCARDESC")
	private Integer doccardesc;
	
	@Column(name = "DOCUOORICO")
	private Integer docuoorico;
	
	@Column(name = "DOCCARORIC")
	private Integer doccaroric;
	
	@Column(name = "DOCFLGENV")
	private Integer docflgenv;
	
	@Column(name = "DOCFLGHC")
	private Integer docflghc;
	
	@Column(name = "DOCFLGCC")
	private Integer docflgcc;
	
	@Column(name = "DOCCARACTC")
	private Integer doccaractc;
	
	@Column(name = "DOCUOACTCO")
	private Integer docuoactco;
	
	@Column(name = "DOCSTSCOD")
	private Integer docstscod;
	
	@Column(name = "DOCFLGPAG")
	private Integer docflgpag;
	
	@Column(name = "DOCTERTDI")
	private String doctertdi;
	
	@Column(name = "DOCTERCON")
	private String doctercon;
	
	@Column(name = "DOCNROREF")
	private String docnroref;
	
	@Column(name = "DOCDIRCORC")
	private String docdircorc;
	
	@Column(name = "DOCDIRFISC")
	private String docdirfisc;
	
	@Column(name = "DOCDIRLCOD")
	private Integer docdirlcod;
	
	@Column(name = "DOCDIRLNOM")
	private String docdirlnom;
	
	@Column(name = "DOCDIRLNRO")
	private Integer docdirlnro;
	
	@Column(name = "DOCFLGARC")
	private Integer docflgarc;
	
	@Column(name = "DOCFLGANX")
	private Integer docflganx;
	
	@Column(name = "DOCFLGPRC")
	private Integer docflgprc;
	
	@Column(name = "DOCLET")
	private String doclet;
	
	@Column(name = "DOCCMT")
	private String doccmt;
	
	@Column(name = "DOCEQV")
	private Integer doceqv;
	
	@Column(name = "ZCOMID")
	private Integer zcomid;
	
	@Column(name = "DOCENVSAM")
	private Integer docenvsam;
	
	@Column(name = "DOCINFADI")
	private String docinfadi;
	
	@Column(name = "DOCDVIALET")
	private String docdvialet;
	
	@Column(name = "DOCDVIAINT")
	private String docdviaint;
	
	@Column(name = "DOCDVIANRO")
	private Integer docdvianro;
	
	@Column(name = "DOCDVIACOD")
	private Integer docdviacod;
	
	@Column(name = "DOCPCDCOD")
	private Integer docpcdcod;
	
	@Column(name = "DOCWKSMOD")
	private String docwksmod;
	
	@Column(name = "DOCWKSCRE")
	private String docwkscre;
	
	@Column(name = "DOCTPODST")
	private String doctpodst;
	
	@Column(name = "DOCCTCNRO")
	private Integer docctcnro;
	
	@Column(name = "DOCTPOORI")
	private String doctpoori;
	
	@Column(name = "DOCFCHINI")
	private String docfchini;
	
	@Column(name = "DOCETXT")
	private String docetxt;
	
	@Column(name = "SECCOMID")
	private Integer seccomid;
	
	@Column(name = "DVIGUUNID")
	private Integer dviguunid;
	
	@Column(name = "DVIGLOTE")
	private Integer dviglote;
	
	@Column(name = "DVIGMANZ")
	private Integer dvigmanz;
	
	@Column(name = "DVIGDIS")
	private Integer dvigdis;
	
	@Column(name = "DOCOBSSIT")
	private String docobssit;
	
	@Column(name = "DOCFLGCREQ")
	private Integer docflgcreq;
	
	@Column(name = "DOCUBIFOL")
	private Integer docubifol;
	
	@ManyToOne
	private Estados estados;
	
	@ManyToOne
	private Personas personas;
	
	@ManyToOne
	private UnidadOrganica unidadOrganica;
	
	@ManyToOne
	private Cargo cargo;
	
	@ManyToOne
	private Usuarios usuariosa;
	
	@ManyToOne
	private Usuarios usuariosb;

	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getDocanonum() {
		return docanonum;
	}

	public void setDocanonum(Integer docanonum) {
		this.docanonum = docanonum;
	}

	public Integer getDoccor() {
		return doccor;
	}

	public void setDoccor(Integer doccor) {
		this.doccor = doccor;
	}

	public String getTpodoccod() {
		return tpodoccod;
	}

	public void setTpodoccod(String tpodoccod) {
		this.tpodoccod = tpodoccod;
	}

	public String getDocsoltdi() {
		return docsoltdi;
	}

	public void setDocsoltdi(String docsoltdi) {
		this.docsoltdi = docsoltdi;
	}

	public String getDocsolcon() {
		return docsolcon;
	}

	public void setDocsolcon(String docsolcon) {
		this.docsolcon = docsolcon;
	}

	public String getDocsolncmp() {
		return docsolncmp;
	}

	public void setDocsolncmp(String docsolncmp) {
		this.docsolncmp = docsolncmp;
	}

	public String getDocrlegtdi() {
		return docrlegtdi;
	}

	public void setDocrlegtdi(String docrlegtdi) {
		this.docrlegtdi = docrlegtdi;
	}

	public String getDocrlegcon() {
		return docrlegcon;
	}

	public void setDocrlegcon(String docrlegcon) {
		this.docrlegcon = docrlegcon;
	}

	public String getDocasu() {
		return docasu;
	}

	public void setDocasu(String docasu) {
		this.docasu = docasu;
	}

	public Integer getDvigucnum() {
		return dvigucnum;
	}

	public void setDvigucnum(Integer dvigucnum) {
		this.dvigucnum = dvigucnum;
	}

	public String getDvigucdir() {
		return dvigucdir;
	}

	public void setDvigucdir(String dvigucdir) {
		this.dvigucdir = dvigucdir;
	}

	public Integer getDocdircor() {
		return docdircor;
	}

	public void setDocdircor(Integer docdircor) {
		this.docdircor = docdircor;
	}

	public Integer getDocdirfis() {
		return docdirfis;
	}

	public void setDocdirfis(Integer docdirfis) {
		this.docdirfis = docdirfis;
	}

	public Integer getDocdirocod() {
		return docdirocod;
	}

	public void setDocdirocod(Integer docdirocod) {
		this.docdirocod = docdirocod;
	}

	public String getDocdironom() {
		return docdironom;
	}

	public void setDocdironom(String docdironom) {
		this.docdironom = docdironom;
	}

	public Integer getDocdironro() {
		return docdironro;
	}

	public void setDocdironro(Integer docdironro) {
		this.docdironro = docdironro;
	}

	public Integer getDocnumfol() {
		return docnumfol;
	}

	public void setDocnumfol(Integer docnumfol) {
		this.docnumfol = docnumfol;
	}

	public String getDocobs() {
		return docobs;
	}

	public void setDocobs(String docobs) {
		this.docobs = docobs;
	}

	public String getDocfchrec() {
		return docfchrec;
	}

	public void setDocfchrec(String docfchrec) {
		this.docfchrec = docfchrec;
	}

	public String getDocfchfin() {
		return docfchfin;
	}

	public void setDocfchfin(String docfchfin) {
		this.docfchfin = docfchfin;
	}

	public String getDocfchcre() {
		return docfchcre;
	}

	public void setDocfchcre(String docfchcre) {
		this.docfchcre = docfchcre;
	}

	public Integer getDocusrcre() {
		return docusrcre;
	}

	public void setDocusrcre(Integer docusrcre) {
		this.docusrcre = docusrcre;
	}

	public String getDochracre() {
		return dochracre;
	}

	public void setDochracre(String dochracre) {
		this.dochracre = dochracre;
	}

	public String getDocfchmod() {
		return docfchmod;
	}

	public void setDocfchmod(String docfchmod) {
		this.docfchmod = docfchmod;
	}

	public Integer getDocusrmod() {
		return docusrmod;
	}

	public void setDocusrmod(Integer docusrmod) {
		this.docusrmod = docusrmod;
	}

	public String getDochramod() {
		return dochramod;
	}

	public void setDochramod(String dochramod) {
		this.dochramod = dochramod;
	}

	public Integer getDocuodesco() {
		return docuodesco;
	}

	public void setDocuodesco(Integer docuodesco) {
		this.docuodesco = docuodesco;
	}

	public Integer getDoccardesc() {
		return doccardesc;
	}

	public void setDoccardesc(Integer doccardesc) {
		this.doccardesc = doccardesc;
	}

	public Integer getDocuoorico() {
		return docuoorico;
	}

	public void setDocuoorico(Integer docuoorico) {
		this.docuoorico = docuoorico;
	}

	public Integer getDoccaroric() {
		return doccaroric;
	}

	public void setDoccaroric(Integer doccaroric) {
		this.doccaroric = doccaroric;
	}

	public Integer getDocflgenv() {
		return docflgenv;
	}

	public void setDocflgenv(Integer docflgenv) {
		this.docflgenv = docflgenv;
	}

	public Integer getDocflghc() {
		return docflghc;
	}

	public void setDocflghc(Integer docflghc) {
		this.docflghc = docflghc;
	}

	public Integer getDocflgcc() {
		return docflgcc;
	}

	public void setDocflgcc(Integer docflgcc) {
		this.docflgcc = docflgcc;
	}

	public Integer getDoccaractc() {
		return doccaractc;
	}

	public void setDoccaractc(Integer doccaractc) {
		this.doccaractc = doccaractc;
	}

	public Integer getDocuoactco() {
		return docuoactco;
	}

	public void setDocuoactco(Integer docuoactco) {
		this.docuoactco = docuoactco;
	}

	public Integer getDocstscod() {
		return docstscod;
	}

	public void setDocstscod(Integer docstscod) {
		this.docstscod = docstscod;
	}

	public Integer getDocflgpag() {
		return docflgpag;
	}

	public void setDocflgpag(Integer docflgpag) {
		this.docflgpag = docflgpag;
	}

	public String getDoctertdi() {
		return doctertdi;
	}

	public void setDoctertdi(String doctertdi) {
		this.doctertdi = doctertdi;
	}

	public String getDoctercon() {
		return doctercon;
	}

	public void setDoctercon(String doctercon) {
		this.doctercon = doctercon;
	}

	public String getDocnroref() {
		return docnroref;
	}

	public void setDocnroref(String docnroref) {
		this.docnroref = docnroref;
	}

	public String getDocdircorc() {
		return docdircorc;
	}

	public void setDocdircorc(String docdircorc) {
		this.docdircorc = docdircorc;
	}

	public String getDocdirfisc() {
		return docdirfisc;
	}

	public void setDocdirfisc(String docdirfisc) {
		this.docdirfisc = docdirfisc;
	}

	public Integer getDocdirlcod() {
		return docdirlcod;
	}

	public void setDocdirlcod(Integer docdirlcod) {
		this.docdirlcod = docdirlcod;
	}

	public String getDocdirlnom() {
		return docdirlnom;
	}

	public void setDocdirlnom(String docdirlnom) {
		this.docdirlnom = docdirlnom;
	}

	public Integer getDocdirlnro() {
		return docdirlnro;
	}

	public void setDocdirlnro(Integer docdirlnro) {
		this.docdirlnro = docdirlnro;
	}

	public Integer getDocflgarc() {
		return docflgarc;
	}

	public void setDocflgarc(Integer docflgarc) {
		this.docflgarc = docflgarc;
	}

	public Integer getDocflganx() {
		return docflganx;
	}

	public void setDocflganx(Integer docflganx) {
		this.docflganx = docflganx;
	}

	public Integer getDocflgprc() {
		return docflgprc;
	}

	public void setDocflgprc(Integer docflgprc) {
		this.docflgprc = docflgprc;
	}

	public String getDoclet() {
		return doclet;
	}

	public void setDoclet(String doclet) {
		this.doclet = doclet;
	}

	public String getDoccmt() {
		return doccmt;
	}

	public void setDoccmt(String doccmt) {
		this.doccmt = doccmt;
	}

	public Integer getDoceqv() {
		return doceqv;
	}

	public void setDoceqv(Integer doceqv) {
		this.doceqv = doceqv;
	}

	public Integer getZcomid() {
		return zcomid;
	}

	public void setZcomid(Integer zcomid) {
		this.zcomid = zcomid;
	}

	public Integer getDocenvsam() {
		return docenvsam;
	}

	public void setDocenvsam(Integer docenvsam) {
		this.docenvsam = docenvsam;
	}

	public String getDocinfadi() {
		return docinfadi;
	}

	public void setDocinfadi(String docinfadi) {
		this.docinfadi = docinfadi;
	}

	public String getDocdvialet() {
		return docdvialet;
	}

	public void setDocdvialet(String docdvialet) {
		this.docdvialet = docdvialet;
	}

	public String getDocdviaint() {
		return docdviaint;
	}

	public void setDocdviaint(String docdviaint) {
		this.docdviaint = docdviaint;
	}

	public Integer getDocdvianro() {
		return docdvianro;
	}

	public void setDocdvianro(Integer docdvianro) {
		this.docdvianro = docdvianro;
	}

	public Integer getDocdviacod() {
		return docdviacod;
	}

	public void setDocdviacod(Integer docdviacod) {
		this.docdviacod = docdviacod;
	}

	public Integer getDocpcdcod() {
		return docpcdcod;
	}

	public void setDocpcdcod(Integer docpcdcod) {
		this.docpcdcod = docpcdcod;
	}

	public String getDocwksmod() {
		return docwksmod;
	}

	public void setDocwksmod(String docwksmod) {
		this.docwksmod = docwksmod;
	}

	public String getDocwkscre() {
		return docwkscre;
	}

	public void setDocwkscre(String docwkscre) {
		this.docwkscre = docwkscre;
	}

	public String getDoctpodst() {
		return doctpodst;
	}

	public void setDoctpodst(String doctpodst) {
		this.doctpodst = doctpodst;
	}

	public Integer getDocctcnro() {
		return docctcnro;
	}

	public void setDocctcnro(Integer docctcnro) {
		this.docctcnro = docctcnro;
	}

	public String getDoctpoori() {
		return doctpoori;
	}

	public void setDoctpoori(String doctpoori) {
		this.doctpoori = doctpoori;
	}

	public String getDocfchini() {
		return docfchini;
	}

	public void setDocfchini(String docfchini) {
		this.docfchini = docfchini;
	}

	public String getDocetxt() {
		return docetxt;
	}

	public void setDocetxt(String docetxt) {
		this.docetxt = docetxt;
	}

	public Integer getSeccomid() {
		return seccomid;
	}

	public void setSeccomid(Integer seccomid) {
		this.seccomid = seccomid;
	}

	public Integer getDviguunid() {
		return dviguunid;
	}

	public void setDviguunid(Integer dviguunid) {
		this.dviguunid = dviguunid;
	}

	public Integer getDviglote() {
		return dviglote;
	}

	public void setDviglote(Integer dviglote) {
		this.dviglote = dviglote;
	}

	public Integer getDvigmanz() {
		return dvigmanz;
	}

	public void setDvigmanz(Integer dvigmanz) {
		this.dvigmanz = dvigmanz;
	}

	public Integer getDvigdis() {
		return dvigdis;
	}

	public void setDvigdis(Integer dvigdis) {
		this.dvigdis = dvigdis;
	}

	public String getDocobssit() {
		return docobssit;
	}

	public void setDocobssit(String docobssit) {
		this.docobssit = docobssit;
	}

	public Integer getDocflgcreq() {
		return docflgcreq;
	}

	public void setDocflgcreq(Integer docflgcreq) {
		this.docflgcreq = docflgcreq;
	}

	public Integer getDocubifol() {
		return docubifol;
	}

	public void setDocubifol(Integer docubifol) {
		this.docubifol = docubifol;
	}

	public Estados getEstados() {
		return estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public UnidadOrganica getUnidadOrganica() {
		return unidadOrganica;
	}

	public void setUnidadOrganica(UnidadOrganica unidadOrganica) {
		this.unidadOrganica = unidadOrganica;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Usuarios getUsuariosa() {
		return usuariosa;
	}

	public void setUsuariosa(Usuarios usuariosa) {
		this.usuariosa = usuariosa;
	}

	public Usuarios getUsuariosb() {
		return usuariosb;
	}

	public void setUsuariosb(Usuarios usuariosb) {
		this.usuariosb = usuariosb;
	}

}
