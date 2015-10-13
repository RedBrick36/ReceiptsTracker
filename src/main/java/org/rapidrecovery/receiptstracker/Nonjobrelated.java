/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rapidrecovery.receiptstracker;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RedBrick
 */
@Entity
@Table(catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nonjobrelated.findAll", query = "SELECT n FROM Nonjobrelated n"),
    @NamedQuery(name = "Nonjobrelated.findByTech", query = "SELECT n FROM Nonjobrelated n WHERE n.tech = :tech"),
    @NamedQuery(name = "Nonjobrelated.findByR1date", query = "SELECT n FROM Nonjobrelated n WHERE n.r1date = :r1date"),
    @NamedQuery(name = "Nonjobrelated.findByR1cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r1cardtype = :r1cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR1location", query = "SELECT n FROM Nonjobrelated n WHERE n.r1location = :r1location"),
    @NamedQuery(name = "Nonjobrelated.findByR1category", query = "SELECT n FROM Nonjobrelated n WHERE n.r1category = :r1category"),
    @NamedQuery(name = "Nonjobrelated.findByR1amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r1amount = :r1amount"),
    @NamedQuery(name = "Nonjobrelated.findByR1reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r1reconciled = :r1reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR2date", query = "SELECT n FROM Nonjobrelated n WHERE n.r2date = :r2date"),
    @NamedQuery(name = "Nonjobrelated.findByR2cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r2cardtype = :r2cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR2location", query = "SELECT n FROM Nonjobrelated n WHERE n.r2location = :r2location"),
    @NamedQuery(name = "Nonjobrelated.findByR2category", query = "SELECT n FROM Nonjobrelated n WHERE n.r2category = :r2category"),
    @NamedQuery(name = "Nonjobrelated.findByR2amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r2amount = :r2amount"),
    @NamedQuery(name = "Nonjobrelated.findByR2reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r2reconciled = :r2reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR3date", query = "SELECT n FROM Nonjobrelated n WHERE n.r3date = :r3date"),
    @NamedQuery(name = "Nonjobrelated.findByR3cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r3cardtype = :r3cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR3location", query = "SELECT n FROM Nonjobrelated n WHERE n.r3location = :r3location"),
    @NamedQuery(name = "Nonjobrelated.findByR3category", query = "SELECT n FROM Nonjobrelated n WHERE n.r3category = :r3category"),
    @NamedQuery(name = "Nonjobrelated.findByR3amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r3amount = :r3amount"),
    @NamedQuery(name = "Nonjobrelated.findByR3reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r3reconciled = :r3reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR4date", query = "SELECT n FROM Nonjobrelated n WHERE n.r4date = :r4date"),
    @NamedQuery(name = "Nonjobrelated.findByR4cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r4cardtype = :r4cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR4location", query = "SELECT n FROM Nonjobrelated n WHERE n.r4location = :r4location"),
    @NamedQuery(name = "Nonjobrelated.findByR4category", query = "SELECT n FROM Nonjobrelated n WHERE n.r4category = :r4category"),
    @NamedQuery(name = "Nonjobrelated.findByR4amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r4amount = :r4amount"),
    @NamedQuery(name = "Nonjobrelated.findByR4reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r4reconciled = :r4reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR5date", query = "SELECT n FROM Nonjobrelated n WHERE n.r5date = :r5date"),
    @NamedQuery(name = "Nonjobrelated.findByR5cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r5cardtype = :r5cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR5location", query = "SELECT n FROM Nonjobrelated n WHERE n.r5location = :r5location"),
    @NamedQuery(name = "Nonjobrelated.findByR5category", query = "SELECT n FROM Nonjobrelated n WHERE n.r5category = :r5category"),
    @NamedQuery(name = "Nonjobrelated.findByR5amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r5amount = :r5amount"),
    @NamedQuery(name = "Nonjobrelated.findByR5reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r5reconciled = :r5reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR6date", query = "SELECT n FROM Nonjobrelated n WHERE n.r6date = :r6date"),
    @NamedQuery(name = "Nonjobrelated.findByR6cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r6cardtype = :r6cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR6location", query = "SELECT n FROM Nonjobrelated n WHERE n.r6location = :r6location"),
    @NamedQuery(name = "Nonjobrelated.findByR6category", query = "SELECT n FROM Nonjobrelated n WHERE n.r6category = :r6category"),
    @NamedQuery(name = "Nonjobrelated.findByR6amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r6amount = :r6amount"),
    @NamedQuery(name = "Nonjobrelated.findByR6reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r6reconciled = :r6reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR7date", query = "SELECT n FROM Nonjobrelated n WHERE n.r7date = :r7date"),
    @NamedQuery(name = "Nonjobrelated.findByR7cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r7cardtype = :r7cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR7location", query = "SELECT n FROM Nonjobrelated n WHERE n.r7location = :r7location"),
    @NamedQuery(name = "Nonjobrelated.findByR7category", query = "SELECT n FROM Nonjobrelated n WHERE n.r7category = :r7category"),
    @NamedQuery(name = "Nonjobrelated.findByR7amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r7amount = :r7amount"),
    @NamedQuery(name = "Nonjobrelated.findByR7reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r7reconciled = :r7reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR8date", query = "SELECT n FROM Nonjobrelated n WHERE n.r8date = :r8date"),
    @NamedQuery(name = "Nonjobrelated.findByR8cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r8cardtype = :r8cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR8location", query = "SELECT n FROM Nonjobrelated n WHERE n.r8location = :r8location"),
    @NamedQuery(name = "Nonjobrelated.findByR8category", query = "SELECT n FROM Nonjobrelated n WHERE n.r8category = :r8category"),
    @NamedQuery(name = "Nonjobrelated.findByR8amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r8amount = :r8amount"),
    @NamedQuery(name = "Nonjobrelated.findByR8reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r8reconciled = :r8reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR9date", query = "SELECT n FROM Nonjobrelated n WHERE n.r9date = :r9date"),
    @NamedQuery(name = "Nonjobrelated.findByR9cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r9cardtype = :r9cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR9location", query = "SELECT n FROM Nonjobrelated n WHERE n.r9location = :r9location"),
    @NamedQuery(name = "Nonjobrelated.findByR9category", query = "SELECT n FROM Nonjobrelated n WHERE n.r9category = :r9category"),
    @NamedQuery(name = "Nonjobrelated.findByR9amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r9amount = :r9amount"),
    @NamedQuery(name = "Nonjobrelated.findByR9reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r9reconciled = :r9reconciled"),
    @NamedQuery(name = "Nonjobrelated.findByR10date", query = "SELECT n FROM Nonjobrelated n WHERE n.r10date = :r10date"),
    @NamedQuery(name = "Nonjobrelated.findByR10cardtype", query = "SELECT n FROM Nonjobrelated n WHERE n.r10cardtype = :r10cardtype"),
    @NamedQuery(name = "Nonjobrelated.findByR10location", query = "SELECT n FROM Nonjobrelated n WHERE n.r10location = :r10location"),
    @NamedQuery(name = "Nonjobrelated.findByR10category", query = "SELECT n FROM Nonjobrelated n WHERE n.r10category = :r10category"),
    @NamedQuery(name = "Nonjobrelated.findByR10amount", query = "SELECT n FROM Nonjobrelated n WHERE n.r10amount = :r10amount"),
    @NamedQuery(name = "Nonjobrelated.findByR10reconciled", query = "SELECT n FROM Nonjobrelated n WHERE n.r10reconciled = :r10reconciled")})
public class Nonjobrelated implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 40)
    @Column(nullable = false, length = 40)
    private String tech;
    @Temporal(TemporalType.DATE)
    private Date r1date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r1cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r1location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r1category;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private BigDecimal r1amount;
    private Boolean r1reconciled;
    @Temporal(TemporalType.DATE)
    private Date r2date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r2cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r2location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r2category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r2amount;
    private Boolean r2reconciled;
    @Temporal(TemporalType.DATE)
    private Date r3date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r3cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r3location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r3category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r3amount;
    private Boolean r3reconciled;
    @Temporal(TemporalType.DATE)
    private Date r4date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r4cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r4location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r4category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r4amount;
    private Boolean r4reconciled;
    @Temporal(TemporalType.DATE)
    private Date r5date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r5cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r5location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r5category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r5amount;
    private Boolean r5reconciled;
    @Temporal(TemporalType.DATE)
    private Date r6date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r6cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r6location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r6category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r6amount;
    private Boolean r6reconciled;
    @Temporal(TemporalType.DATE)
    private Date r7date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r7cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r7location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r7category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r7amount;
    private Boolean r7reconciled;
    @Temporal(TemporalType.DATE)
    private Date r8date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r8cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r8location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r8category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r8amount;
    private Boolean r8reconciled;
    @Temporal(TemporalType.DATE)
    private Date r9date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r9cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r9location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r9category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r9amount;
    private Boolean r9reconciled;
    @Temporal(TemporalType.DATE)
    private Date r10date;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r10cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r10location;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r10category;
    @Column(precision = 7, scale = 2)
    private BigDecimal r10amount;
    private Boolean r10reconciled;

    public Nonjobrelated() {
    }

    public Nonjobrelated(String tech) {
        this.tech = tech;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Date getR1date() {
        return r1date;
    }

    public void setR1date(Date r1date) {
        this.r1date = r1date;
    }

    public String getR1cardtype() {
        return r1cardtype;
    }

    public void setR1cardtype(String r1cardtype) {
        this.r1cardtype = r1cardtype;
    }

    public String getR1location() {
        return r1location;
    }

    public void setR1location(String r1location) {
        this.r1location = r1location;
    }

    public String getR1category() {
        return r1category;
    }

    public void setR1category(String r1category) {
        this.r1category = r1category;
    }

    public BigDecimal getR1amount() {
        return r1amount;
    }

    public void setR1amount(BigDecimal r1amount) {
        this.r1amount = r1amount;
    }

    public Boolean getR1reconciled() {
        return r1reconciled;
    }

    public void setR1reconciled(Boolean r1reconciled) {
        this.r1reconciled = r1reconciled;
    }

    public Date getR2date() {
        return r2date;
    }

    public void setR2date(Date r2date) {
        this.r2date = r2date;
    }

    public String getR2cardtype() {
        return r2cardtype;
    }

    public void setR2cardtype(String r2cardtype) {
        this.r2cardtype = r2cardtype;
    }

    public String getR2location() {
        return r2location;
    }

    public void setR2location(String r2location) {
        this.r2location = r2location;
    }

    public String getR2category() {
        return r2category;
    }

    public void setR2category(String r2category) {
        this.r2category = r2category;
    }

    public BigDecimal getR2amount() {
        return r2amount;
    }

    public void setR2amount(BigDecimal r2amount) {
        this.r2amount = r2amount;
    }

    public Boolean getR2reconciled() {
        return r2reconciled;
    }

    public void setR2reconciled(Boolean r2reconciled) {
        this.r2reconciled = r2reconciled;
    }

    public Date getR3date() {
        return r3date;
    }

    public void setR3date(Date r3date) {
        this.r3date = r3date;
    }

    public String getR3cardtype() {
        return r3cardtype;
    }

    public void setR3cardtype(String r3cardtype) {
        this.r3cardtype = r3cardtype;
    }

    public String getR3location() {
        return r3location;
    }

    public void setR3location(String r3location) {
        this.r3location = r3location;
    }

    public String getR3category() {
        return r3category;
    }

    public void setR3category(String r3category) {
        this.r3category = r3category;
    }

    public BigDecimal getR3amount() {
        return r3amount;
    }

    public void setR3amount(BigDecimal r3amount) {
        this.r3amount = r3amount;
    }

    public Boolean getR3reconciled() {
        return r3reconciled;
    }

    public void setR3reconciled(Boolean r3reconciled) {
        this.r3reconciled = r3reconciled;
    }

    public Date getR4date() {
        return r4date;
    }

    public void setR4date(Date r4date) {
        this.r4date = r4date;
    }

    public String getR4cardtype() {
        return r4cardtype;
    }

    public void setR4cardtype(String r4cardtype) {
        this.r4cardtype = r4cardtype;
    }

    public String getR4location() {
        return r4location;
    }

    public void setR4location(String r4location) {
        this.r4location = r4location;
    }

    public String getR4category() {
        return r4category;
    }

    public void setR4category(String r4category) {
        this.r4category = r4category;
    }

    public BigDecimal getR4amount() {
        return r4amount;
    }

    public void setR4amount(BigDecimal r4amount) {
        this.r4amount = r4amount;
    }

    public Boolean getR4reconciled() {
        return r4reconciled;
    }

    public void setR4reconciled(Boolean r4reconciled) {
        this.r4reconciled = r4reconciled;
    }

    public Date getR5date() {
        return r5date;
    }

    public void setR5date(Date r5date) {
        this.r5date = r5date;
    }

    public String getR5cardtype() {
        return r5cardtype;
    }

    public void setR5cardtype(String r5cardtype) {
        this.r5cardtype = r5cardtype;
    }

    public String getR5location() {
        return r5location;
    }

    public void setR5location(String r5location) {
        this.r5location = r5location;
    }

    public String getR5category() {
        return r5category;
    }

    public void setR5category(String r5category) {
        this.r5category = r5category;
    }

    public BigDecimal getR5amount() {
        return r5amount;
    }

    public void setR5amount(BigDecimal r5amount) {
        this.r5amount = r5amount;
    }

    public Boolean getR5reconciled() {
        return r5reconciled;
    }

    public void setR5reconciled(Boolean r5reconciled) {
        this.r5reconciled = r5reconciled;
    }

    public Date getR6date() {
        return r6date;
    }

    public void setR6date(Date r6date) {
        this.r6date = r6date;
    }

    public String getR6cardtype() {
        return r6cardtype;
    }

    public void setR6cardtype(String r6cardtype) {
        this.r6cardtype = r6cardtype;
    }

    public String getR6location() {
        return r6location;
    }

    public void setR6location(String r6location) {
        this.r6location = r6location;
    }

    public String getR6category() {
        return r6category;
    }

    public void setR6category(String r6category) {
        this.r6category = r6category;
    }

    public BigDecimal getR6amount() {
        return r6amount;
    }

    public void setR6amount(BigDecimal r6amount) {
        this.r6amount = r6amount;
    }

    public Boolean getR6reconciled() {
        return r6reconciled;
    }

    public void setR6reconciled(Boolean r6reconciled) {
        this.r6reconciled = r6reconciled;
    }

    public Date getR7date() {
        return r7date;
    }

    public void setR7date(Date r7date) {
        this.r7date = r7date;
    }

    public String getR7cardtype() {
        return r7cardtype;
    }

    public void setR7cardtype(String r7cardtype) {
        this.r7cardtype = r7cardtype;
    }

    public String getR7location() {
        return r7location;
    }

    public void setR7location(String r7location) {
        this.r7location = r7location;
    }

    public String getR7category() {
        return r7category;
    }

    public void setR7category(String r7category) {
        this.r7category = r7category;
    }

    public BigDecimal getR7amount() {
        return r7amount;
    }

    public void setR7amount(BigDecimal r7amount) {
        this.r7amount = r7amount;
    }

    public Boolean getR7reconciled() {
        return r7reconciled;
    }

    public void setR7reconciled(Boolean r7reconciled) {
        this.r7reconciled = r7reconciled;
    }

    public Date getR8date() {
        return r8date;
    }

    public void setR8date(Date r8date) {
        this.r8date = r8date;
    }

    public String getR8cardtype() {
        return r8cardtype;
    }

    public void setR8cardtype(String r8cardtype) {
        this.r8cardtype = r8cardtype;
    }

    public String getR8location() {
        return r8location;
    }

    public void setR8location(String r8location) {
        this.r8location = r8location;
    }

    public String getR8category() {
        return r8category;
    }

    public void setR8category(String r8category) {
        this.r8category = r8category;
    }

    public BigDecimal getR8amount() {
        return r8amount;
    }

    public void setR8amount(BigDecimal r8amount) {
        this.r8amount = r8amount;
    }

    public Boolean getR8reconciled() {
        return r8reconciled;
    }

    public void setR8reconciled(Boolean r8reconciled) {
        this.r8reconciled = r8reconciled;
    }

    public Date getR9date() {
        return r9date;
    }

    public void setR9date(Date r9date) {
        this.r9date = r9date;
    }

    public String getR9cardtype() {
        return r9cardtype;
    }

    public void setR9cardtype(String r9cardtype) {
        this.r9cardtype = r9cardtype;
    }

    public String getR9location() {
        return r9location;
    }

    public void setR9location(String r9location) {
        this.r9location = r9location;
    }

    public String getR9category() {
        return r9category;
    }

    public void setR9category(String r9category) {
        this.r9category = r9category;
    }

    public BigDecimal getR9amount() {
        return r9amount;
    }

    public void setR9amount(BigDecimal r9amount) {
        this.r9amount = r9amount;
    }

    public Boolean getR9reconciled() {
        return r9reconciled;
    }

    public void setR9reconciled(Boolean r9reconciled) {
        this.r9reconciled = r9reconciled;
    }

    public Date getR10date() {
        return r10date;
    }

    public void setR10date(Date r10date) {
        this.r10date = r10date;
    }

    public String getR10cardtype() {
        return r10cardtype;
    }

    public void setR10cardtype(String r10cardtype) {
        this.r10cardtype = r10cardtype;
    }

    public String getR10location() {
        return r10location;
    }

    public void setR10location(String r10location) {
        this.r10location = r10location;
    }

    public String getR10category() {
        return r10category;
    }

    public void setR10category(String r10category) {
        this.r10category = r10category;
    }

    public BigDecimal getR10amount() {
        return r10amount;
    }

    public void setR10amount(BigDecimal r10amount) {
        this.r10amount = r10amount;
    }

    public Boolean getR10reconciled() {
        return r10reconciled;
    }

    public void setR10reconciled(Boolean r10reconciled) {
        this.r10reconciled = r10reconciled;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tech != null ? tech.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nonjobrelated)) {
            return false;
        }
        Nonjobrelated other = (Nonjobrelated) object;
        if ((this.tech == null && other.tech != null) || (this.tech != null && !this.tech.equals(other.tech))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.rapidrecovery.receiptstracker.Nonjobrelated[ tech=" + tech + " ]";
    }
    
}
