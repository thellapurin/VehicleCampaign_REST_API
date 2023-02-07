package com.campaign.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.TypeDef;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "t_campaign")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Data
public class T_Campaign {

	@Id
	private Integer id;

	private Integer parent_id;

	private String name;

	private String nickname;

	private String description;

	@ElementCollection
	@Column(columnDefinition = "jsonb")
	@Type(JsonBinaryType.class)
	private Map<String, String> Message;

	private Integer kind;

	@CreationTimestamp
	private LocalDateTime execution_date;

	@CreationTimestamp
	private LocalDateTime end_date;

	private Integer compensation;

	private boolean condition1;

	private boolean condition2;

	private boolean condition3;

	private Integer updated_user_notification_info_file_id;

	private Integer rxswin_update_info_file_id;

	private String notification_number;

	private Integer package_kind;

	private Integer filter_conditions_type;

	private Integer reprodata_id;

	private Integer software_type;

	private Integer package_id;

	private String managed_id;

	private Integer state;

	private Integer evaluation_state;
	
	@CreationTimestamp
	private LocalDateTime approved_at;

	@CreationTimestamp
	private LocalDateTime executed_at;

	@CreationTimestamp
	private LocalDateTime cancelled_at;

	@CreationTimestamp
	private LocalDateTime evaluation_approved_at;

	@CreationTimestamp
	private LocalDateTime evaluation_cancelled_at;

	private Boolean editable;

	@CreationTimestamp
	private LocalDateTime updated_at;

	@CreationTimestamp
	private LocalDateTime created_at;
}
