package models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;
    private String address;
    private String city;
    private String phone;
    private String mobile;
    private String website;
    private String email;

    @ManyToOne
    @JoinColumn(name = "countryid", insertable = false, updatable = false)
    private Country country;
    private Integer countryid;

    @ManyToOne
    @JoinColumn(name = "stateid", insertable = false, updatable = false)
    private State state;
    private Integer stateid;

    private String details;

}
