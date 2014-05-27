package uts.ws;

import java.util.*;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authors")
public class Authors implements Serializable {
	@XmlElement(name = "author")
    private ArrayList<Author> list = new ArrayList<Authorr>();
    public ArrayList<Author> getList() {
        return list;
    }
    public void addAuthor(Author author) throws JAXBException {
        list.add(author);
        
    }
    
    public void removeAuthor(Author author) {
        list.remove(author);
    }
    public Author login(String email, String password) {
        // For each author in the list...
        for (Author author : list) {
            if (author.getEmail().equals(email) && author.getPassword().equals(password))
            	return author; // Login correct. Return this author.
        }
        return null; // Login incorrect. Return null.
    }
   
    public Author findByEmail(String email) {
    	
    	// For each author in the list...
        for (Author author : list) {
            if (author.getEmail().equalsIgnoreCase(email))
            	return author; // Email has not been used. Return the author.
        }
        	return null; // Email has been used. Return a null author.
    }
    
    public Author findByName(String name) {
    	
    	// For each author in the list...
        for (Author author : list) {
            if (author.getName().equalsIgnoreCase(name))
            	return author; // Email has not been used. Return the author.
        }
        	return null; // Email has been used. Return a null author.
    }
    
    
    	
}

