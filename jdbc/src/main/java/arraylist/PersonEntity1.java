package arraylist;

import arraylist.AddressEntity1;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Person")
@Data
public class PersonEntity1 {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int pid;


    @Column(name = "name")
    private String name;



    // @OneToOne(mappedBy = "pid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AddressEntity1 addressenity;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddressEntity1 getAddressenity() {
        return addressenity;
    }

    public void setAddressenity(AddressEntity1 addressenity) {
        this.addressenity = addressenity;
    }
}