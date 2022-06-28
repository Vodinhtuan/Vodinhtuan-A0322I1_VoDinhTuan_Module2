package casestudyfuramaresort.models;

public class Employee extends Person{
    private String Education, position, salary;

    public Employee() {
    }

    public Employee(String code, String name, String birthDay, boolean sex, int id, int phoneNumber, String email, String education, String position, String salary) {
        super(code, name, birthDay, sex, id, phoneNumber, email);
        Education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Education='" + Education + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
