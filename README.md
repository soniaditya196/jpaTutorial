# jpaTutorial
JPA stands for Java Persistence API. JPA is just a specification that faciliates object relational mapping (ORM)

ORM means to map Java Objects with relational database tables.

JPA can be implemented by the following tools :
  1. Hibernate
  2. ibatis
  3. Toplink
  4. ORM lite

JPA architecture includes following components :
  1. Entity - java persistence objects
  2. Entity Manager - manages the persistence operations
  3. Entity Transaction - each operation is a transaction
  4. Entity Manager Factory - factory to create Entity Managers
  5. Persistence - provides the interface
  6. Query - for querying the database
  
  
  In this tutorial, I have used hibernate to implement JPA and to connect to my local mysql db : soni.
  
  CODE : for fetching and inserting into database table : Candidates


<img width="1648" alt="Screenshot 2023-04-29 at 11 44 21 PM" src="https://user-images.githubusercontent.com/37475894/235318459-1f5b2654-09db-4c52-a9d7-76091ebc1898.png">
