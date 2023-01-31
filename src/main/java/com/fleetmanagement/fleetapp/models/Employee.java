package com.fleetmanagement.fleetapp.models;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person {

    @ManyToOne
    @JoinColumn(name = "employeetypeid", insertable = false, updatable = false)
    private EmployeeType empployeeType;
    private Integer employeetypeid;
    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name = "jobtitleid", insertable = false, updatable = false)
    private JobTitle jobTitle;
    private Integer jobtitleid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;

}