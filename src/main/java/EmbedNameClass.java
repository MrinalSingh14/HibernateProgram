import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbedNameClass {
    @Column(name = "First_Name")
    private String Fname;
    @Column(name = "Last_Name")
    private String Lname;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String toString(){
        return Fname+" "+Lname;
    }
}
