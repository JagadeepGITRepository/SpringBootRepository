package com.jagadeep.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name="CONTACT_DTLS")
@Data
public class ContactDetails  implements Serializable {
	
	@Id
	@Column(name="C_ID")
	private  int       contactId;
	@Column(name="C_NAME")
	private String contactName;
	@Column(name="C_NO")
	private   long   contactNo;

}
