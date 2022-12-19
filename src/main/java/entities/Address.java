package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", nullable = false)
    private short addressId;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district",nullable = false)
    private String district;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone", nullable = false)
    private String phone;

//    @Column(name = "location", nullable = false)
//    private byte[] location;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Timestamp lastUpdate;
}
