package com.jroadie.hibernate;

import org.hibernate.Session;

public class App {
    public static void main( String[] args ){
       Session ss = Util.getSessionFactory().openSession();
       
       ss.beginTransaction();
       
       Student std = new Student();
       std.setName("Mike McLeaod");
       std.setStudentId("STD-08023");
       
       ss.save(std);
       ss.getTransaction().commit();
    }
}
