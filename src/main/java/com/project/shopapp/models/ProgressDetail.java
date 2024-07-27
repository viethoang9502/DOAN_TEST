package com.project.shopapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "progress_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProgressDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "progress_id")
    @JsonBackReference
    private Order order;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson product;

    @Column(name = "evaluation_score", nullable = false)
    private Float price;

    @Column(name = "attempt_count", nullable = false)
    private int numberOfProducts;

    @Column(name = "total_score", nullable = false)
    private Float totalMoney;

    @Column(name = "break_start")
    private String color;

    @ManyToOne
    @JoinColumn(name = "reward_id", nullable = true)
    @JsonBackReference
    private Coupon coupon;
}
