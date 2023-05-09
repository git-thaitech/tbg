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

    @Column(name = "fixed_number")
    private Integer fixed_number;

    @Column(name = "upper_limit_weight")
    private Float upper_limit_weight;

    @Column(name = "lower_limit_weight")
    private Float lower_limit_weight;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public Tray() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFixed_number() {
        return fixed_number;
    }

    public void setFixed_number(Integer fixed_number) {
        this.fixed_number = fixed_number;
    }

    public Float getUpper_limit_weight() {
        return upper_limit_weight;
    }

    public void setUpper_limit_weight(Float upper_limit_weight) {
        this.upper_limit_weight = upper_limit_weight;
    }

    public Float getLower_limit_weight() {
        return lower_limit_weight;
    }

    public void setLower_limit_weight(Float lower_limit_weight) {
        this.lower_limit_weight = lower_limit_weight;
    }

    public Instant getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Instant created_on) {
        this.created_on = created_on;
    }

    public Instant getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Instant updated_on) {
        this.updated_on = updated_on;
    }
}
