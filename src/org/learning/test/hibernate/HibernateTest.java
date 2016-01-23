package org.learning.test.hibernate;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learning.hibernate.dto.Address;
import org.learning.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		user.setCurrent(true);
		/*user.setAddress("First users address");
		user.setJoinedDate(new Date());
		user.setDescription("Description of the first user goes here");*/
		
		UserDetails user2 = new UserDetails();
		user2.setUserId(2);
		user2.setUserName("Second User");
		user.setCurrent(true);
		/*user2.setAddress("Second users address");
		user2.setJoinedDate(new Date());
		user2.setDescription("Description of the Second user goes here");
		*/
		
		Address addr = new Address();
		addr.setStreet("Ramapuram");
		addr.setCity("Chennai");
		addr.setState("TN");
		addr.setPincode("678009");
		
		Address addr2 = new Address();
		addr2.setStreet("DLFM");
		addr2.setCity("Mumbai");
		addr2.setState("MH");
		addr2.setPincode("478009");
		
		Address addr3 = new Address();
		addr3.setStreet("Kallekulangara");
		addr3.setCity("Palakkad");
		addr3.setState("KL");
		addr3.setPincode("678009");
		
		Address addr4 = new Address();
		addr4.setStreet("Amdocs");
		addr4.setCity("Pune");
		addr4.setState("MH");
		addr4.setPincode("428009");
		
		user.getListOfAddresses().add(addr);
		user.getListOfAddresses().add(addr2);
		
		user2.getListOfAddresses().add(addr3);
		user2.getListOfAddresses().add(addr4);
		
		/*user.setHomeAddress(addr);
		user.setOfficeAddress(addr2);*/
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		/*session.close();
		
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(UserDetails.class, 1);
		System.out.println("User details retreived " + user.getUserName());
		*/

	}

}
