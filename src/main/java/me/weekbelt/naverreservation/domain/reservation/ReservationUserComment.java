package me.weekbelt.naverreservation.domain.reservation;

import lombok.Getter;
import lombok.Setter;
import me.weekbelt.naverreservation.domain.BaseEntity;
import me.weekbelt.naverreservation.domain.product.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class ReservationUserComment extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_info_id")
    private ReservationInfo reservationInfo;

    @OneToMany(mappedBy = "reservationUserComment")
    private List<ReservationUserCommentImage> reservationUserCommentImages = new ArrayList<>();

    @Column(nullable = false)
    private double score;

    @Column(nullable = false)
    private String comment;
}