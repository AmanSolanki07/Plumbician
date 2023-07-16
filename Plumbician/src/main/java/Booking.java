public class Booking {
    private String name;
    private String phoneNumber;
    private String address;
    private String professionType;
    private String problemDetails;
    private String status;

    // Constructor
    public Booking(String name, String phoneNumber, String address, String professionType, String problemDetails) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.professionType = professionType;
        this.problemDetails = problemDetails;
        this.status = "Pending";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfessionType() {
        return professionType;
    }

    public void setProfessionType(String professionType) {
        this.professionType = professionType;
    }

    public String getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(String problemDetails) {
        this.problemDetails = problemDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
