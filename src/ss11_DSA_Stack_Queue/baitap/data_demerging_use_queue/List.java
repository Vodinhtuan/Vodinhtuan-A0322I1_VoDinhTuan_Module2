package ss11_DSA_Stack_Queue.baitap.data_demerging_use_queue;

public class List {
    private String name;
    private boolean gender;
    private String dateOfBirthday;

    public List() {
    }

    public List(String name, boolean gender, String dateOfBirthday) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "List{ " +
                "name= '" + name + '\'' +
                ", gender= " + (gender? "Nam":"Nu") +
                ", dateOfBirthday= '" + dateOfBirthday + '\'' +
                " }";
    }
}
