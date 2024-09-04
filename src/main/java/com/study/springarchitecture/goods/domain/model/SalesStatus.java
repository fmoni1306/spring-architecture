package com.study.springarchitecture.goods.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SalesStatus {
    IN_STOCK,
    OUT_OF_STOCK,
    DISCONTINUED
}
