package michaelkim.byg;

/**
 * Created by Michael Kim on 8/25/2017.
 */

public class mentor {

    String name, email, grade, phone;

    public mentor() {

    }

    public mentor(String n, String e, String g, String p){
        this.name = n;
        this.email = e;
        this.grade = g;
        this.phone = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
