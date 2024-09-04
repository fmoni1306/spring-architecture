package com.study.springarchitecture.user.infrastructure.entity;

import com.study.springarchitecture.order.infrastructure.entity.OrderEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name = "available_order_amount", nullable = false)
    private BigDecimal available_order_amount;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    @Builder.Default
    private List<OrderEntity> orderEntities = new ArrayList<>();
}
