package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String first_name;
    private String last_name;

    private String email;

    private String phone;

    private String address;

//    private Date enroll_date;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
