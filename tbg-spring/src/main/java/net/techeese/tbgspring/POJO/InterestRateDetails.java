package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.*;

import java.time.Instant;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "interest_rate_details")
public class InterestRateDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "interest_rate_id")
    private InterestRate interest_rate;

    @Column(name = "from_day")
    private Integer from_day;

    @Column(name = "to_day")
    private Integer to_day;

    @Column(name = "rate")
    private Float rate;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public InterestRateDetails() {
    }
}
