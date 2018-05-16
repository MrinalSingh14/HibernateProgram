import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EmpClass")
public class EmpClass {
    @Id
    @Column(name = "Emp_Id")
    private int empid;
    @Column(name = "Emp_Name")
    private String empname;
    @Column(name = "Emp_Dept")
    private String dept;
    @ManyToMany
    private List<Laptop> laptop = new ArrayList<Laptop>();

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
}
