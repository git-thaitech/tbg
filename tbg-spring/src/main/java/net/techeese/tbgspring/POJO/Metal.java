package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "metal")
public class Metal {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "sell_price")
    private Integer sell_price;

    @Column(name = "buy_price")
    private Integer buy_price;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public Metal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSell_price() {
        return sell_price;
    }

    public void setSell_price(Integer sell_price) {
        this.sell_price = sell_price;
    }

    public Integer getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(Integer buy_price) {
        this.buy_price = buy_price;
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
