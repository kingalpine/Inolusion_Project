package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "front_desk", schema = "dbo", catalog = "localspringbootdb")
public class FrontDeskEntity {
    private int frontDeskId;
    private String frontDeskFname;
    private String frontDeskLname;
    private String frontDeskAddress;
    private String frontDeskEmail;
    private Date frontDeskDob;
    private Integer frontDeskHphone;
    private Integer frontDeskMphone;

    @Id
    @Column(name = "front_desk_id")
    public int getFrontDeskId() {
        return frontDeskId;
    }

    public void setFrontDeskId(int frontDeskId) {
        this.frontDeskId = frontDeskId;
    }

    @Basic
    @Column(name = "front_desk_fname")
    public String getFrontDeskFname() {
        return frontDeskFname;
    }

    public void setFrontDeskFname(String frontDeskFname) {
        this.frontDeskFname = frontDeskFname;
    }

    @Basic
    @Column(name = "front_desk_lname")
    public String getFrontDeskLname() {
        return frontDeskLname;
    }

    public void setFrontDeskLname(String frontDeskLname) {
        this.frontDeskLname = frontDeskLname;
    }

    @Basic
    @Column(name = "front_desk_address")
    public String getFrontDeskAddress() {
        return frontDeskAddress;
    }

    public void setFrontDeskAddress(String frontDeskAddress) {
        this.frontDeskAddress = frontDeskAddress;
    }

    @Basic
    @Column(name = "front_desk_email")
    public String getFrontDeskEmail() {
        return frontDeskEmail;
    }

    public void setFrontDeskEmail(String frontDeskEmail) {
        this.frontDeskEmail = frontDeskEmail;
    }

    @Basic
    @Column(name = "front_desk_dob")
    public Date getFrontDeskDob() {
        return frontDeskDob;
    }

    public void setFrontDeskDob(Date frontDeskDob) {
        this.frontDeskDob = frontDeskDob;
    }

    @Basic
    @Column(name = "front_desk_hphone")
    public Integer getFrontDeskHphone() {
        return frontDeskHphone;
    }

    public void setFrontDeskHphone(Integer frontDeskHphone) {
        this.frontDeskHphone = frontDeskHphone;
    }

    @Basic
    @Column(name = "front_desk_mphone")
    public Integer getFrontDeskMphone() {
        return frontDeskMphone;
    }

    public void setFrontDeskMphone(Integer frontDeskMphone) {
        this.frontDeskMphone = frontDeskMphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrontDeskEntity that = (FrontDeskEntity) o;
        return frontDeskId == that.frontDeskId &&
                Objects.equals(frontDeskFname, that.frontDeskFname) &&
                Objects.equals(frontDeskLname, that.frontDeskLname) &&
                Objects.equals(frontDeskAddress, that.frontDeskAddress) &&
                Objects.equals(frontDeskEmail, that.frontDeskEmail) &&
                Objects.equals(frontDeskDob, that.frontDeskDob) &&
                Objects.equals(frontDeskHphone, that.frontDeskHphone) &&
                Objects.equals(frontDeskMphone, that.frontDeskMphone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontDeskId, frontDeskFname, frontDeskLname, frontDeskAddress, frontDeskEmail, frontDeskDob, frontDeskHphone, frontDeskMphone);
    }
}
