package com.jaxws.top.down.service.impl;

import in.benchresources.entities.book.BookRequestType;
import in.benchresources.entities.book.BookResponseType;
import in.benchresources.entities.book.UserDefinedFault;
import in.benchresources.services.bookservice.IBookService;
import in.benchresources.services.bookservice.UserDefinedException;

public class BookServiceImpl implements IBookService{

	public BookResponseType getBookByISDNRequestNumber(
			BookRequestType parameters) throws UserDefinedException{
		BookResponseType bookResponseType = new BookResponseType();
		if(!parameters.getIsbnNumber().isEmpty()){
	        bookResponseType.setBookISBN(parameters.getIsbnNumber());
	        bookResponseType.setBookName("Objective Microbiology");
	        bookResponseType.setAuthor("S. Nandi");
	        bookResponseType.setCategory("Microbiology");
		}
		else{
			UserDefinedFault u = new UserDefinedFault();
			u.setFaultCode(100);
			u.setFaultMessage("Please provide isbn number");
			throw new UserDefinedException("Server Error",u);
			
		}
		
        return bookResponseType;
	}

}
