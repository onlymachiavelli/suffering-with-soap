package com.info.service;
import models.Person;

import javax.jws.WebService;
import java.util.*;


@WebService(endpointInterface = "com.poly.info.service.PersonService")
public class PersonServiceImpl implements  PersonServices {

    private  static final Map<Integer , Person> persons = new HashMap<Integer , Person>() ;


    @Override
    public boolean createPerson(Person p) {
        if (persons.get(p.getId()) != null) {
            System.out.println("Person already exists");
            return false ;

        }


        persons.put(p.getId() , p);

        return true ;
    }


    @Override
    public boolean deletePerson(int target) {
        if (persons.get(target) == null ) {
            System.out.println("Please provide a valid target id");
            return false ;
        }

        persons.remove(target);

        return true ;
    }

    //skip that part for now
    @Override
    public boolean updatePerson(int id, Person p) {
        return false;
    }


    public Person getOnePerson(int id) {

        Person target = persons.get(id) ;

        if (target == null) {
            System.out.println("unable to find the target ");
            return null ;
        }


        return target ;
    }


    public Person [] getAllPersons () {
        Set<Integer>  st = persons.keySet();
        Person[] pp  = new Person[st.size()] ;
       int i = 0 ;
       for (Integer id  : st ) {
           pp[i] = persons.get(id) ;
           ++i  ;
       }

       return pp ;

    }
}
