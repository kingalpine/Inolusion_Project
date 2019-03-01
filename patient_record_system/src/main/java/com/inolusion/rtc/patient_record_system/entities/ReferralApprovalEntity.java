package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "referral_approval", schema = "dbo", catalog = "Inolusion_PRS")
public class ReferralApprovalEntity {
    private int referralApprovalId;
    private String referralDecision;

    @Id
    @Column(name = "referral_approval_id")
    public int getReferralApprovalId() {
        return referralApprovalId;
    }

    public void setReferralApprovalId(int referralApprovalId) {
        this.referralApprovalId = referralApprovalId;
    }

    @Basic
    @Column(name = "referral_decision")
    public String getReferralDecision() {
        return referralDecision;
    }

    public void setReferralDecision(String referralDecision) {
        this.referralDecision = referralDecision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferralApprovalEntity that = (ReferralApprovalEntity) o;
        return referralApprovalId == that.referralApprovalId &&
                Objects.equals(referralDecision, that.referralDecision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referralApprovalId, referralDecision);
    }
}
