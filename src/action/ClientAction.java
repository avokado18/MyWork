package action;

import model.Client;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Collection;
import java.util.List;

/**
 * Created by 1 on 16.09.2016.
 */
public class ClientAction {
    public void addClient(Client client) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
    }

    public void updateClient(int id, Client client){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(client);
        session.getTransaction().commit();
    }

    public Client getClientById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Client client = (Client) session.load(Client.class, id);
        return client;
    }

    public Collection getAllClients(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List clients = session.createCriteria(Client.class).list();
        return clients;
    }

    public void deleteClient(Client client){
        Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(client);
            session.getTransaction().commit();
    }

}
