import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class LapEmpMain {
    public static void main(String[] args) {
        EmpClass empClass = new EmpClass();

        empClass.setEmpid(1);
        empClass.setEmpname("Mrinal");
        empClass.setDept("Computers");

        Laptop laptop = new Laptop();

        laptop.setLid(101);
        laptop.setLname("Dell");
//        laptop.setEmp(empClass);

        laptop.getEmp().add(empClass);

        empClass.getLaptop().add(laptop);




        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(EmpClass.class);

//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

//        org.hibernate.service.ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sessionFactory = con.buildSessionFactory(reg);

        //buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
//Saving Records in Table:-
        session.save(laptop);
        session.save(empClass);

// To Fetch Data from Table:-
        //       Student =(Student) session.get(Student.class,101);

        transaction.commit();
    }
}
