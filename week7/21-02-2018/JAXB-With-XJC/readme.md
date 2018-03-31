## Task: XML JAXB Using XJC command(Marshalling & Unmarshalling)
To run this application
```JDK Version : 1.8 ``` 
Design program to parse the XMl data(book Store) and then create the appropriate object return the list with book objects.
display the book details.(Create POJO classes using xjc command).

### Step1:
#### Create bookstore.xsd file
```
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
targetNamespace="http://www.example.org/books"
xmlns:tns="http://www.example.org/books" elementFormDefault="qualified">
    <element name="bookstore" type="tns:bookstore"></element>

    <complexType name="bookstore">
    	<sequence>
    		<element name="book" maxOccurs="unbounded" minOccurs="0">
    			<complexType>
    				<sequence>
    					<element name="title" type="string"
    						maxOccurs="1" minOccurs="1">
    					</element>
    					<element name="author" type="string"></element>
    					<element name="category" type="string"></element>
    					<element name="price" type="double"></element>
    					<element name="year" type="int"></element>
    				</sequence>
    				<attribute name="isbn" type="string"></attribute>
    			</complexType>
    		</element>
    	</sequence>
    </complexType>
</schema>
```
### Step2:
#### To generate POJO classes from bookstore.xsd filr use XJC command.

```xjc bookstore.xsd ```
```
It can generate all the POJO java class files from bookstore.xsd and then write marshalling and unmarshalling using JAXB.
```
### Output
```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<bookstore xmlns="http://www.example.org/books">
    <book isbn="12345678">
        <title>Java for Beginners</title>
        <author>Krishnakanth</author>
        <category>JAVA</category>
        <price>200.0</price>
        <year>2018</year>
    </book>
    <book isbn="12345678">
        <title>Java for Beginners</title>
        <author>Krishnakanth</author>
        <category>JAVA</category>
        <price>200.0</price>
        <year>2018</year>
    </book>
</bookstore>


```