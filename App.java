package com.telusko.DemoHib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
    {
        Hibernat tel=new Hibernat();
        Configuration con=new Configuration().configure().addAnnotatedClass(Hibernat.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        tel=(Hibernat)session.get(Hibernat.class,3);
        tx.commit();
        System.out.println(tel);
    }
}
