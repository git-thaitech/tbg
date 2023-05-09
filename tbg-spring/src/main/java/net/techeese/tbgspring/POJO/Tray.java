package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
import java.time.Instant;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "tray")
public class Tray {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "upper_limit_weight")
    private Float upper_limit_weight;

    @Column(name = "lower_limit_weight")
    private Float lower_limit_weight;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on; 
    
}
