package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "COUNTRY", schema = "dbo", catalog = "LaptopDB")
public class CountryEntity {
    private int countryId;
    private String name;
    private String countryAbbreviation;

    @Id
    @Column(name = "COUNTRY_ID")
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "COUNTRY_ABBREVIATION")
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return countryId == that.countryId &&
                Objects.equals(name, that.name) &&
                Objects.equals(countryAbbreviation, that.countryAbbreviation);
    }

    @Override
    public String toString() {
        return countryAbbreviation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, name, countryAbbreviation);
    }
}
