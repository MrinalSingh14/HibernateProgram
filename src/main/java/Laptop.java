import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Laptop")
public class Laptop {
    @Id
    @Column(name = "Laptop_Id")
    private int lid;
    @Column(name = "Laptop_Name")
    private String lname;

    @ManyToMany(mappedBy = "laptop")
    private List<EmpClass> emp = new ArrayList<EmpClass>();

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<EmpClass> getEmp() {
        return emp;
    }

    public void setEmp(List<EmpClass> emp) {
        this.emp = emp;
    }
}
