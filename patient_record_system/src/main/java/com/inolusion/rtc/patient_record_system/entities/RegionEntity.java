package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REGION", schema = "dbo", catalog = "localspringbootdb")
public class RegionEntity {
    private int regionId;
    private CountryEntity countryId;
    private String regionCode;
    private String name;

    @Id
    @Column(name = "REGION_ID")
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    public CountryEntity getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryEntity countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "REGION_CODE")
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionEntity that = (RegionEntity) o;
        return regionId == that.regionId &&
                countryId == that.countryId &&
                Objects.equals(regionCode, that.regionCode) &&
                Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return regionCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, countryId, regionCode, name);
    }
}
