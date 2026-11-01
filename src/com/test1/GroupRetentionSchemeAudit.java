package com.test1;

public class GroupRetentionSchemeAudit {
	private long schemeAuditId;
	private long schemeId;
	private String auditType;
	private long previousSchemeGB;
	private long updatedSchemeGB;
	private String changeReason;
	private String changedBy;
	private String changeDate;
	private String businessJustification;
	private String auditReferenceNumber;
	private String complianceStatus;

	public GroupRetentionSchemeAudit() {

	}

	public GroupRetentionSchemeAudit(long schemeAuditId, long schemeId, String auditType, long previousSchemeGB,
			long updatedSchemeGB, String changeReason, String changedBy, String changeDate,
			String businessJustification, String auditReferenceNumber, String complianceStatus) {
		super();
		this.schemeAuditId = schemeAuditId;
		this.schemeId = schemeId;
		this.auditType = auditType;
		this.previousSchemeGB = previousSchemeGB;
		this.updatedSchemeGB = updatedSchemeGB;
		this.changeReason = changeReason;
		this.changedBy = changedBy;
		this.changeDate = changeDate;
		this.businessJustification = businessJustification;
		this.auditReferenceNumber = auditReferenceNumber;
		this.complianceStatus = complianceStatus;
	}

	public long getSchemeAuditId() {
		return schemeAuditId;
	}

	public void setSchemeAuditId(long schemeAuditId) {
		this.schemeAuditId = schemeAuditId;
	}

	public long getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(long schemeId) {
		this.schemeId = schemeId;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public long getPreviousSchemeGB() {
		return previousSchemeGB;
	}

	public void setPreviousSchemeGB(long previousSchemeGB) {
		this.previousSchemeGB = previousSchemeGB;
	}

	public long getUpdatedSchemeGB() {
		return updatedSchemeGB;
	}

	public void setUpdatedSchemeGB(long updatedSchemeGB) {
		this.updatedSchemeGB = updatedSchemeGB;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	public String getBusinessJustification() {
		return businessJustification;
	}

	public void setBusinessJustification(String businessJustification) {
		this.businessJustification = businessJustification;
	}

	public String getAuditReferenceNumber() {
		return auditReferenceNumber;
	}

	public void setAuditReferenceNumber(String auditReferenceNumber) {
		this.auditReferenceNumber = auditReferenceNumber;
	}

	public String getComplianceStatus() {
		return complianceStatus;
	}

	public void setComplianceStatus(String complianceStatus) {
		this.complianceStatus = complianceStatus;
	}

}
