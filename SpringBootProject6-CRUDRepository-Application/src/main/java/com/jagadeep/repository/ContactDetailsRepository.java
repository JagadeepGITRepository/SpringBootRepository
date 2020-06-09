package com.jagadeep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jagadeep.entity.ContactDetails;

public interface ContactDetailsRepository extends CrudRepository<ContactDetails, Integer> {
	
	  public  ContactDetails   findBycontactName(String name);
	  public  ContactDetails   findBycontactNo(long number);
	  public  ContactDetails  findByContactNoAndContactName(long number,String name);
	  
	  @Query("SELECT  contactName  from ContactDetails  where  contactId=:contactId")
	  public String  getContactNameByContactId(int contactId);
	  
	  @Query("from  ContactDetails  where  contactName  like   'S%'  ")
	  public List<ContactDetails>    getAllContactsStartWithSChar();
	  
	  @Query("select  contactName   from  ContactDetails")
	  public List<String>    getAllContactNames();

}
