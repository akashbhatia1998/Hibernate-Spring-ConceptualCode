package com.spring1;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class AlienDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAliens()
    {
        Session session = sessionFactory.getCurrentSession();
        List<Alien> aliens = session.createQuery("from Alien" ).list();
        return aliens;
    }

    @Transactional
    public void addAlien(Alien a) {
        Session session = sessionFactory.getCurrentSession();
        a.setState(1);
        session.save(a);
    }

    @Transactional
    public Alien getAlien(int aid) {

        Session session = sessionFactory.getCurrentSession();
        Alien al = (Alien) session.get(Alien.class ,aid);
        return al;
    }

    @Transactional
    public int deleteAlien(int aid) {
        Session session = sessionFactory.getCurrentSession();
        Query qry = session.createQuery("delete from Alien a where a.aid =:a");
        qry.setParameter("a" , aid);
        int res = qry.executeUpdate();
        return res;

    }


   @Transactional
    public int updateAlien(int aid, int phone) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "UPDATE Alien set phone = :phone "  +
                "WHERE aid = :aid";
        Query query = session.createQuery(hql);
        query.setParameter("phone", phone);
        query.setParameter("aid",aid);
        int result = query.executeUpdate();
        if(result == 1) return 1;
        return 0;
    }
}
