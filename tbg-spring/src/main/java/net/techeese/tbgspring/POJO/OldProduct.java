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
@Table(name = "old_product")
public class OldProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "metal_id")
    private Metal metal;

    @Column(name = "total_weight")
    private Float total_weight;

    @Column(name = "gemstone_weight")
    private Float gemstone_weight;

    @Column(name = "buy_price")
    private Float buy_price;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public OldProduct() {
    }
}
