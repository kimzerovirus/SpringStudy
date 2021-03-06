package com.kzv.tdd.springbootjpa_tdd.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}

/*
    @Getter
     - 선언된 모든 필드의 get메서드 생성

    @RequiredArgsConstructor
     - 선언된 모든 final필드가 포함된 생성자를 생성해 준다(final이 없는 필드는 생성x).

*/