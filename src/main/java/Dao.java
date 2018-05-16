import javafx.concurrent.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;

public class Dao {
    public static void main(String[] args) {
        Student Student = new Student();

        EmbedNameClass embedNameClass = new EmbedNameClass();

        embedNameClass.setFname("Lala");
        embedNameClass.setLname("Singh");

        Student.setId(102);
        Student.setName(embedNameClass);
        Student.setBranch("Science");

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

//        org.hibernate.service.ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sessionFactory = con.buildSessionFactory(reg);

        //buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
//Saving Records in Table:-
        session.save(Student);

// To Fetch Data from Table:-
 //       Student =(Student) session.get(Student.class,101);

        transaction.commit();
//To Print Data From Table:
//        System.out.println(Student);
    }
}