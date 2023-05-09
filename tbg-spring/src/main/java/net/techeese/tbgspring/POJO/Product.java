package net.techeese.tbgspring.POJO;

import java.time.Instant;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "product", indexes = @Index(columnList = "id, barcode"))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "metal_id")
    private Metal metal;

    @ManyToOne
    @JoinColumn(name = "designs_id")
    private Designs designs;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "total_weight")
    private Float total_weight;

    @Column(name = "gemstone_weight")
    private Float gemstone_weight;

    @Column(name = "processing_price")
    private Integer processing_price;

    @Column(name = "photo")
    private String photo;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}