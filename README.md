# Online-Fashion-Store-Back-End
A web application for an Online Fashion Store was developed by me as a project in internship programme at Avtra.
This is the back end implementation of it using Spring Boot.
What this basically does is, retrieving details of the items to be sold from the database and sending to the front end whenever they want. Other than the item details, this transfers the fashion category names, background images and store branch details.

I have impemented the data retrieving in three ways.

1) JDBC
   Here, I'm using a MySQL database to store my data and they are manipulated using written queries.
   
3) Hibernate
   Here, I'm doing the ORM implementation. Again, data is stored in a MySQL database and they are manipulated using Hibernate.
    
5) Hard coded data
   Here, the data are hard coded in a back end file.

There are two controllers to handle remate calls. 

1) ItemListController contains APIs for manipulating itemlist details.
2) OtherServicesCotroller contains APIs for sending branch, background images and fashion category details.

Back end is executed on the TomCat server which is provided by Spring Boot.
