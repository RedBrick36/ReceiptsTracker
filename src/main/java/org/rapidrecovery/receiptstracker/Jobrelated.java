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
    @NamedQuery(name = "Jobrelated.findAll", query = "SELECT j FROM Jobrelated j"),
    @NamedQuery(name = "Jobrelated.findByJobname", query = "SELECT j FROM Jobrelated j WHERE j.jobname = :jobname"),
    @NamedQuery(name = "Jobrelated.findByPretax", query = "SELECT j FROM Jobrelated j WHERE j.pretax = :pretax"),
    @NamedQuery(name = "Jobrelated.findByTenpercent", query = "SELECT j FROM Jobrelated j WHERE j.tenpercent = :tenpercent"),
    @NamedQuery(name = "Jobrelated.findByTotalreceipts", query = "SELECT j FROM Jobrelated j WHERE j.totalreceipts = :totalreceipts"),
    @NamedQuery(name = "Jobrelated.findByOverage", query = "SELECT j FROM Jobrelated j WHERE j.overage = :overage"),
    @NamedQuery(name = "Jobrelated.findByR1cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r1cardtype = :r1cardtype"),
    @NamedQuery(name = "Jobrelated.findByRc1location", query = "SELECT j FROM Jobrelated j WHERE j.rc1location = :rc1location"),
    @NamedQuery(name = "Jobrelated.findByR1amount", query = "SELECT j FROM Jobrelated j WHERE j.r1amount = :r1amount"),
    @NamedQuery(name = "Jobrelated.findByR1reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r1reconciled = :r1reconciled"),
    @NamedQuery(name = "Jobrelated.findByR2cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r2cardtype = :r2cardtype"),
    @NamedQuery(name = "Jobrelated.findByR2location", query = "SELECT j FROM Jobrelated j WHERE j.r2location = :r2location"),
    @NamedQuery(name = "Jobrelated.findByR2amount", query = "SELECT j FROM Jobrelated j WHERE j.r2amount = :r2amount"),
    @NamedQuery(name = "Jobrelated.findByR2reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r2reconciled = :r2reconciled"),
    @NamedQuery(name = "Jobrelated.findByR3cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r3cardtype = :r3cardtype"),
    @NamedQuery(name = "Jobrelated.findByR3location", query = "SELECT j FROM Jobrelated j WHERE j.r3location = :r3location"),
    @NamedQuery(name = "Jobrelated.findByR3amount", query = "SELECT j FROM Jobrelated j WHERE j.r3amount = :r3amount"),
    @NamedQuery(name = "Jobrelated.findByR3reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r3reconciled = :r3reconciled"),
    @NamedQuery(name = "Jobrelated.findByR4cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r4cardtype = :r4cardtype"),
    @NamedQuery(name = "Jobrelated.findByR4location", query = "SELECT j FROM Jobrelated j WHERE j.r4location = :r4location"),
    @NamedQuery(name = "Jobrelated.findByR4amount", query = "SELECT j FROM Jobrelated j WHERE j.r4amount = :r4amount"),
    @NamedQuery(name = "Jobrelated.findByR4reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r4reconciled = :r4reconciled"),
    @NamedQuery(name = "Jobrelated.findByR5cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r5cardtype = :r5cardtype"),
    @NamedQuery(name = "Jobrelated.findByR5location", query = "SELECT j FROM Jobrelated j WHERE j.r5location = :r5location"),
    @NamedQuery(name = "Jobrelated.findByR5amount", query = "SELECT j FROM Jobrelated j WHERE j.r5amount = :r5amount"),
    @NamedQuery(name = "Jobrelated.findByR5reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r5reconciled = :r5reconciled"),
    @NamedQuery(name = "Jobrelated.findByR6cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r6cardtype = :r6cardtype"),
    @NamedQuery(name = "Jobrelated.findByR6location", query = "SELECT j FROM Jobrelated j WHERE j.r6location = :r6location"),
    @NamedQuery(name = "Jobrelated.findByR6amount", query = "SELECT j FROM Jobrelated j WHERE j.r6amount = :r6amount"),
    @NamedQuery(name = "Jobrelated.findByR6reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r6reconciled = :r6reconciled"),
    @NamedQuery(name = "Jobrelated.findByR7cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r7cardtype = :r7cardtype"),
    @NamedQuery(name = "Jobrelated.findByR7location", query = "SELECT j FROM Jobrelated j WHERE j.r7location = :r7location"),
    @NamedQuery(name = "Jobrelated.findByR7amount", query = "SELECT j FROM Jobrelated j WHERE j.r7amount = :r7amount"),
    @NamedQuery(name = "Jobrelated.findByR7reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r7reconciled = :r7reconciled"),
    @NamedQuery(name = "Jobrelated.findByR8cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r8cardtype = :r8cardtype"),
    @NamedQuery(name = "Jobrelated.findByR8location", query = "SELECT j FROM Jobrelated j WHERE j.r8location = :r8location"),
    @NamedQuery(name = "Jobrelated.findByR8amount", query = "SELECT j FROM Jobrelated j WHERE j.r8amount = :r8amount"),
    @NamedQuery(name = "Jobrelated.findByR8reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r8reconciled = :r8reconciled"),
    @NamedQuery(name = "Jobrelated.findByR9cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r9cardtype = :r9cardtype"),
    @NamedQuery(name = "Jobrelated.findByR9location", query = "SELECT j FROM Jobrelated j WHERE j.r9location = :r9location"),
    @NamedQuery(name = "Jobrelated.findByR9amount", query = "SELECT j FROM Jobrelated j WHERE j.r9amount = :r9amount"),
    @NamedQuery(name = "Jobrelated.findByR9reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r9reconciled = :r9reconciled"),
    @NamedQuery(name = "Jobrelated.findByR10cardtype", query = "SELECT j FROM Jobrelated j WHERE j.r10cardtype = :r10cardtype"),
    @NamedQuery(name = "Jobrelated.findByR10location", query = "SELECT j FROM Jobrelated j WHERE j.r10location = :r10location"),
    @NamedQuery(name = "Jobrelated.findByR10amount", query = "SELECT j FROM Jobrelated j WHERE j.r10amount = :r10amount"),
    @NamedQuery(name = "Jobrelated.findByR10reconciled", query = "SELECT j FROM Jobrelated j WHERE j.r10reconciled = :r10reconciled"),
    @NamedQuery(name = "Jobrelated.findByR1date", query = "SELECT j FROM Jobrelated j WHERE j.r1date = :r1date"),
    @NamedQuery(name = "Jobrelated.findByR2date", query = "SELECT j FROM Jobrelated j WHERE j.r2date = :r2date"),
    @NamedQuery(name = "Jobrelated.findByR3date", query = "SELECT j FROM Jobrelated j WHERE j.r3date = :r3date"),
    @NamedQuery(name = "Jobrelated.findByR4date", query = "SELECT j FROM Jobrelated j WHERE j.r4date = :r4date"),
    @NamedQuery(name = "Jobrelated.findByR5date", query = "SELECT j FROM Jobrelated j WHERE j.r5date = :r5date"),
    @NamedQuery(name = "Jobrelated.findByR6date", query = "SELECT j FROM Jobrelated j WHERE j.r6date = :r6date"),
    @NamedQuery(name = "Jobrelated.findByR7date", query = "SELECT j FROM Jobrelated j WHERE j.r7date = :r7date"),
    @NamedQuery(name = "Jobrelated.findByR8date", query = "SELECT j FROM Jobrelated j WHERE j.r8date = :r8date"),
    @NamedQuery(name = "Jobrelated.findByR9date", query = "SELECT j FROM Jobrelated j WHERE j.r9date = :r9date"),
    @NamedQuery(name = "Jobrelated.findByR10date", query = "SELECT j FROM Jobrelated j WHERE j.r10date = :r10date")})
public class Jobrelated implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 40)
    @Column(nullable = false, length = 40)
    private String jobname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private BigDecimal pretax;
    @Column(precision = 5, scale = 2)
    private BigDecimal tenpercent;
    @Column(precision = 7, scale = 2)
    private BigDecimal totalreceipts;
    @Column(precision = 7, scale = 2)
    private BigDecimal overage;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r1cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String rc1location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r1amount;
    private Boolean r1reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r2cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r2location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r2amount;
    private Boolean r2reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r3cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r3location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r3amount;
    private Boolean r3reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r4cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r4location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r4amount;
    private Boolean r4reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r5cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r5location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r5amount;
    private Boolean r5reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r6cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r6location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r6amount;
    private Boolean r6reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r7cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r7location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r7amount;
    private Boolean r7reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r8cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r8location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r8amount;
    private Boolean r8reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r9cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r9location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r9amount;
    private Boolean r9reconciled;
    @javax.validation.constraints.Size(max = 30)
    @Column(length = 30)
    private String r10cardtype;
    @javax.validation.constraints.Size(max = 40)
    @Column(length = 40)
    private String r10location;
    @Column(precision = 7, scale = 2)
    private BigDecimal r10amount;
    private Boolean r10reconciled;
    @Temporal(TemporalType.DATE)
    private Date r1date;
    @Temporal(TemporalType.DATE)
    private Date r2date;
    @Temporal(TemporalType.DATE)
    private Date r3date;
    @Temporal(TemporalType.DATE)
    private Date r4date;
    @Temporal(TemporalType.DATE)
    private Date r5date;
    @Temporal(TemporalType.DATE)
    private Date r6date;
    @Temporal(TemporalType.DATE)
    private Date r7date;
    @Temporal(TemporalType.DATE)
    private Date r8date;
    @Temporal(TemporalType.DATE)
    private Date r9date;
    @Temporal(TemporalType.DATE)
    private Date r10date;

    public Jobrelated() {
    }

    public Jobrelated(String jobname) {
        this.jobname = jobname;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public BigDecimal getPretax() {
        return pretax;
    }

    public void setPretax(BigDecimal pretax) {
        this.pretax = pretax;
    }

    public BigDecimal getTenpercent() {
        return tenpercent;
    }

    public void setTenpercent(BigDecimal tenpercent) {
        this.tenpercent = tenpercent;
    }

    public BigDecimal getTotalreceipts() {
        return totalreceipts;
    }

    public void setTotalreceipts(BigDecimal totalreceipts) {
        this.totalreceipts = totalreceipts;
    }

    public BigDecimal getOverage() {
        return overage;
    }

    public void setOverage(BigDecimal overage) {
        this.overage = overage;
    }

    public String getR1cardtype() {
        return r1cardtype;
    }

    public void setR1cardtype(String r1cardtype) {
        this.r1cardtype = r1cardtype;
    }

    public String getRc1location() {
        return rc1location;
    }

    public void setRc1location(String rc1location) {
        this.rc1location = rc1location;
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

    public Date getR1date() {
        return r1date;
    }

    public void setR1date(Date r1date) {
        this.r1date = r1date;
    }

    public Date getR2date() {
        return r2date;
    }

    public void setR2date(Date r2date) {
        this.r2date = r2date;
    }

    public Date getR3date() {
        return r3date;
    }

    public void setR3date(Date r3date) {
        this.r3date = r3date;
    }

    public Date getR4date() {
        return r4date;
    }

    public void setR4date(Date r4date) {
        this.r4date = r4date;
    }

    public Date getR5date() {
        return r5date;
    }

    public void setR5date(Date r5date) {
        this.r5date = r5date;
    }

    public Date getR6date() {
        return r6date;
    }

    public void setR6date(Date r6date) {
        this.r6date = r6date;
    }

    public Date getR7date() {
        return r7date;
    }

    public void setR7date(Date r7date) {
        this.r7date = r7date;
    }

    public Date getR8date() {
        return r8date;
    }

    public void setR8date(Date r8date) {
        this.r8date = r8date;
    }

    public Date getR9date() {
        return r9date;
    }

    public void setR9date(Date r9date) {
        this.r9date = r9date;
    }

    public Date getR10date() {
        return r10date;
    }

    public void setR10date(Date r10date) {
        this.r10date = r10date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobname != null ? jobname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jobrelated)) {
            return false;
        }
        Jobrelated other = (Jobrelated) object;
        if ((this.jobname == null && other.jobname != null) || (this.jobname != null && !this.jobname.equals(other.jobname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.rapidrecovery.receiptstracker.Jobrelated[ jobname=" + jobname + " ]";
    }
    
}
