Java Persistence API - JPA Theory

https://www.youtube.com/watch?v=otinfgwkMbY&t=3s

JPA: Java Persistence API 

In technological world we deal with data.
Data is temporary and in case appln shuts dwn we want to persist that data

We can persist data in a file/data base.
Java -> JDBC = persists. Lot of issues. 
In JDBC we fetch one one value and store it in database.
In ORM we create an object(Student) of the class and save the whole object in DB

To save the class and objects in rows n columns => Object relation mapping ==> ORM

ORM is applicable for all languages - java, .net etc

To implement ORM in java we need tool like Hibernate, iBertis, Toplink

We can build ORM application using Hibernate.

If today we are using Hibernate and entire application is built using Hibernate. If we want to switch to iBertis tomorrow
we will need to make alot of changes. 
To make a seemless movement from one ORM tool to another we use JPA - Java Persistence API

Advantage: 
Applications need to be build on JPA for easier movement. JPA is just a specification. It needs to be implemented with Hibernate.
When we use JPA we can't use it alone. We need to use either of the ORM tool along with JPA.

Hibernate can be made stand alone but to build JPA we need Hibernate.

In future if we work with Spring Boot and need to connect to DB we use Spring boot JPA.

 
//https://www.youtube.com/watch?v=otinfgwkMbY&t=3s

//Practical
//https://www.youtube.com/watch?v=LEgkdCBnjcM&list=PL6oD2syjfW7COL__RNrWl4S97vNcqh3mO&index=2

