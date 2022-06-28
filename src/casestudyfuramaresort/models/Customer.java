package casestudyfuramaresort.models;

public class Customer extends Person {
    private String customerType, address;

    public Customer() {
    }

    public Customer(String code, String name, String birthDay, boolean sex, int id, int phoneNumber, String email, String customerType, String address) {
        super(code, name, birthDay, sex, id, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                " customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
