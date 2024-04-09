
package Domain;


public class Client {
    private String id;
    private String name;
    private String number;
    private String address;

    public Client(String id, String name, String number, String address) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public String toString() {

        String result = "Client Information"
                + "\n-----------------------"
                + "\n ID: " + this.getId()
                + "\n Name: " + this.getName()
                + "\n Phone: " + this.getNumber()
                + "\n Address: " + this.getAddress();
        return result;
    }

}
