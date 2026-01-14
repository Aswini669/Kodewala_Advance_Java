package com.kodewala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.entity.Payment;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("\\com\\kodewala\\config\\hibernate-cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction trsn = session.beginTransaction();
        
        Payment payment = new Payment();
        payment.setAmount(1000);
        payment.setDescription("This is electronics");
        payment.setSentBy("Abinash");
        payment.setStatus("SUCCESS");
        
        session.save(payment);
        trsn.commit();
    }
}
