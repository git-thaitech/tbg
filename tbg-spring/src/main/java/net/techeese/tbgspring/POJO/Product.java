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
@DynamicInsert
@DynamicUpdate
@Table(name = "product", indexes = @Index(columnList = "id, barcode"))
public class Product {
    private enum STATUS {
        AVAILABLE, // đang bán
        STORAGE, // đang lưu kho
        SOLD, // quá hạn đóng lãi
        PULLED //
    }

    private enum TYPE {
        NEW,
        RECYCLED
    }

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "metal_id")
    private Metal metal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "designs_id")
    private Designs designs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "total_weight")
    private Float total_weight;

    @Column(name = "gemstone_weight")
    private Float gemstone_weight;

    @Column(name = "processing_price")
    private Integer processing_price;

    @Column(name = "status")
    private STATUS status;

    @Column(name = "type")
    private TYPE type;

    @Column(name = "photo1")
    private String photo1;

    @Column(name = "photo2")
    private String photo2;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public Product() {
    }
}
