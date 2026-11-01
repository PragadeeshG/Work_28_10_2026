create table if not exists group_retention_scheme_audit(
scheme_audit_id bigint not null,
scheme_id bigint null,
audit_type varchar(255) null,
previous_scheme_gb bigint null,
updated_scheme_gb bigint null,
change_reason varchar(255) null,
changed_by varchar(255) null,
change_date varchar(255) null,
business_justification varchar(255) null,
audit_reference_number varchar(255) null,
compliance_status varchar(255) null,
constraint group_retention_scheme_audit_pk primary key(scheme_audit_id));