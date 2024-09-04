package com.study.springarchitecture.order.infrastructure.entity;

import com.study.springarchitecture.goods.infrastructure.entity.GoodsEntity;
import com.study.springarchitecture.order.domain.model.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "orders_detail")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_detail_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orders_id", nullable = false)
    private OrderEntity orderEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", nullable = false)
    private GoodsEntity goodsEntity;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "orderStatus", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

}
