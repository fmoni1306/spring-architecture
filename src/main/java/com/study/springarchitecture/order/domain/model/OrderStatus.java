package com.study.springarchitecture.order.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {
    READY,
    OUTBOUND_DONE,
    SHIPPED,
    DELIVERED
}
