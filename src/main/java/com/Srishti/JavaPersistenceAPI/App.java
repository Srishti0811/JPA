
//Need tomcat Server(v10.1)
package com.Srishti.JavaPersistenceAPI;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//To change from Hibernate to ibertis or any other ORM we just need to change the pom file and add its dependencies. 
    	//No need to change below source code.
    	
    	//Factory design Pattern
    	//we need to create a folder under src-main-> resource/META-INF and create a file named - persistence.xml 
    	//this xml file contains all the database configurations.
    	
    	//EntityManager(Interface) - All the classes that represent a DB table in JPA is called Entities. Used to manage those all entities. (Alien is an entity)
    	//<persistence-unit> value which has all the connection details. Can be any name.
    	//Can use different persistence unit for different setting and select any one.
    	
    	//to save a value method name - persist
    	//to fetch/select a file - method name - find
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	//To save: 
    	
    	Student a = new Student();
    	a.setName("Pete");
    	a.setId(1);
    	a.setAge(32);
    	
    	//below transaction needs to begin and close incase of saving data.
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    	
    	
		/* to select a value:
		 * //10 - is the primary key of the record to fetch Student s =
		 * em.find(Student.class, 10); System.out.println(s);
		 */
    }
}
