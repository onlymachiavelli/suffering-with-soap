package com.info.service;
import models.Person;

import javax.jws.* ;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonServices {

    @WebMethod
    public boolean createPerson(Person p)  ;

    @WebMethod
    public boolean deletePerson (int id) ;

    @WebMethod
    public boolean updatePerson(int id, Person p) ;

    @WebMethod

    public Person getOnePerson(int id) ;

    @WebMethod
    public Person[] getAllPersons ();


}
