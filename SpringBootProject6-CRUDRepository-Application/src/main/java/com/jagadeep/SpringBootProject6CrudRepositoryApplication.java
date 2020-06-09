package com.jagadeep;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jagadeep.entity.ContactDetails;
import com.jagadeep.repository.ContactDetailsRepository;

@SpringBootApplication
public class SpringBootProject6CrudRepositoryApplication {

	public static void main(String[] args) {
		System.out.println("main method is executed);
		ConfigurableApplicationContext ctx=null;
		ContactDetailsRepository  repo=null;
		List<ContactDetails>  contactList=null;
		
		//get the Container
		ctx=SpringApplication.run(SpringBootProject6CrudRepositoryApplication.class, args);
		//get the Repository class
		repo=ctx.getBean(ContactDetailsRepository.class);
		System.out.println("Repository Class Name::"+repo.getClass().getName());
		
		/*
		 * //get the Customer Details By Customer Id Optional<ContactDetails>
		 * details=repo.findById(1001);
		 * 
		 * if(details.isPresent()) { //Print the Customer Name
		 * System.out.println(details.get()); }
		 */
		
		
		/*
		 * //get all Customer Details contactList=(List<ContactDetails>) repo.findAll();
		 * //process the contactList contactList.forEach(c->{ System.out.println(c); });
		 */
		
		/* System.out.println(repo.count()); */
		
		
		/* repo.deleteById(1003); */
		
		/* System.out.println( repo.findBycontactName("Jagadeep")); */
		
		/* System.out.println(repo.findBycontactNo(7381900988l)); */
		
		
		
		//  System.out.println(repo.findByContactNoAndContactName(7381900988l,"Jagadeep"));
		
		  //  System.out.println(repo.getContactNameByContactId(1001));
		
		/*
		 * contactList=repo.getAllContactsStartWithSChar(); contactList.forEach(c->{
		 * System.out.println(c); });
		 */
		
		List<String>  nameList=repo.getAllContactNames();
		    nameList.forEach(c->{
			System.out.println(c);
		});
	}//end of main
}//end of class
