package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String first_name;
    private String last_name;

    private String email;

    private String phone;

    private String address;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
