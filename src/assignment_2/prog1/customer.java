package assignment_2.prog1;

public class customer {
    private String firstName;
    private String lastName;
    private String socSecurityNumber;
    private address billingAddress;
    private address shippingAddress;
    private final String DEFAULT_FIRSTNAME = "Greg";
    private final String DEFAULT_LASTNAME = "Stephens";


    public customer(String firstName, String lastName, String socSecurityNumber, address billingAddress, address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNumber = socSecurityNumber;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + socSecurityNumber + '\'' +
                ']';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNumber() {
        return socSecurityNumber;
    }

    public void setSocSecurityNumber(String socSecurityNumber) {
        this.socSecurityNumber = socSecurityNumber;
    }

    public address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
