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
@Table(name = "tray_track_record", indexes = @Index(columnList = "id"))
public class TrayTrackRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tray_id")
    private Tray tray;

    @Column(name = "number_of_products")
    private Integer number_of_products;

    @Column(name = "total_tray_weight")
    private Float total_tray_weight;

    @Column(name = "tracking_time")
    private Instant tracking_time;

    @Column(name = "note")
    private String note;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}
