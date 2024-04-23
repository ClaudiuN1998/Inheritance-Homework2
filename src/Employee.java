import java.util.Date;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private Date dateOfEmployment;
    private String position;
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public Date getBirthday() {
        return this.birthday;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
    public Date getDateOfEmployment() {
        return this.dateOfEmployment;
    }
    public String getPosition() {
        return this.position;
    }
}
