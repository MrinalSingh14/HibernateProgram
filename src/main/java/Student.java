import org.hibernate.annotations.Columns;

import javax.persistence.*;


@Entity
@Table(name = "StudentInfo")
public class Student {
    @Id
    @Column(name = "Id")
    private int id;
    //@Column(name = "Name")
    private EmbedNameClass name;
    @Column(name = "Branch_Name")
    private String Branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmbedNameClass getName() {
        return name;
    }

    public void setName(EmbedNameClass name) {
        this.name = name;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String toString(){
        return "Fetching Values from "+this.getClass().getSimpleName()+" Table [ Id = "+ getId()+ " | Name = "+name+" | Branch = "+getBranch()+" ]";
    }
}
