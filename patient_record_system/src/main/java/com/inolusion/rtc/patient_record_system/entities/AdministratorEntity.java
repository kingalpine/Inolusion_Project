package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "administrator", schema = "dbo", catalog = "Inolusion_PRS")
public class AdministratorEntity {
    private int administratorId;
    private String administratorFname;
    private String administratorLname;
    private String administratorEmail;
    private Date administratorDob;
    private Integer administratorHphone;
    private Integer administratorMphone;

    @Id
    @Column(name = "administrator_id")
    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    @Basic
    @Column(name = "administrator_fname")
    public String getAdministratorFname() {
        return administratorFname;
    }

    public void setAdministratorFname(String administratorFname) {
        this.administratorFname = administratorFname;
    }

    @Basic
    @Column(name = "administrator_lname")
    public String getAdministratorLname() {
        return administratorLname;
    }

    public void setAdministratorLname(String administratorLname) {
        this.administratorLname = administratorLname;
    }

    @Basic
    @Column(name = "administrator_email")
    public String getAdministratorEmail() {
        return administratorEmail;
    }

    public void setAdministratorEmail(String administratorEmail) {
        this.administratorEmail = administratorEmail;
    }

    @Basic
    @Column(name = "administrator_dob")
    public Date getAdministratorDob() {
        return administratorDob;
    }

    public void setAdministratorDob(Date administratorDob) {
        this.administratorDob = administratorDob;
    }

    @Basic
    @Column(name = "administrator_hphone")
    public Integer getAdministratorHphone() {
        return administratorHphone;
    }

    public void setAdministratorHphone(Integer administratorHphone) {
        this.administratorHphone = administratorHphone;
    }

    @Basic
    @Column(name = "administrator_mphone")
    public Integer getAdministratorMphone() {
        return administratorMphone;
    }

    public void setAdministratorMphone(Integer administratorMphone) {
        this.administratorMphone = administratorMphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorEntity that = (AdministratorEntity) o;
        return administratorId == that.administratorId &&
                Objects.equals(administratorFname, that.administratorFname) &&
                Objects.equals(administratorLname, that.administratorLname) &&
                Objects.equals(administratorEmail, that.administratorEmail) &&
                Objects.equals(administratorDob, that.administratorDob) &&
                Objects.equals(administratorHphone, that.administratorHphone) &&
                Objects.equals(administratorMphone, that.administratorMphone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administratorId, administratorFname, administratorLname, administratorEmail, administratorDob, administratorHphone, administratorMphone);
    }
}
