package com.study.springarchitecture.goods.infrastructure.entity;

import com.study.springarchitecture.goods.domain.model.SalesStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "goods")
public class GoodsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Long id;

    @Column(name = "goods_name", nullable = false)
    private String goodsName;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "sales_status", nullable = false)
    private SalesStatus salesStatus;
}
