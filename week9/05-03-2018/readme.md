### This is a Java DataSource using JNDI Context example.
#### JNDI Configuration for TOMCAT 9.0
##### 1.Step(Add datasource in servlet.xml file):
In Tomcat server folder we can find servlet.xml file.(eclipse server folder)
```

	<GlobalNamingResources>
	
		<Resource auth="Container"
		driverClassName="com.mysql.jdbc.Driver"
		global="jdbc/MyDB"
		maxActive="100"
		maxIdle="20"
		maxWait="10000"
		minIdle="5"
		name="jdbc/MyDB"
		password="root"
		type="javax.sql.DataSource"
		url="jdbc:mysql://127.0.0.1:3306/autoparking"
		username="root"/>		
		
	</GlobalNamingResources>
```
##### 2.Step(Add JNDI Context in context.xml file):
In Tomcat server folder we can find servlet.xml file.(eclipse server folder)
```
<!-- <Manager pathname="" /> -->
	<ResourceLink name="jdbc/MyLocalDB" global="jdbc/MyDB"
		auth="Container" type="javax.sql.DataSource" />
```