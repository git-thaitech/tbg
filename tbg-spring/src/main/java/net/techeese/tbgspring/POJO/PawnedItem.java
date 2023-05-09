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
@Table(name = "pawned_item")
public class PawnedItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "metal_id")
    private Metal metal;

    @ManyToOne
    @JoinColumn(name = "loan_agreement_id")
    private LoanAgreement loan_agreement;

    @Column(name = "total_weight")
    private Float total_weight;

    @Column(name = "gemstone_weight")
    private Float gemstone_weight;

    @Column(name = "status")
    private Integer status;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}
