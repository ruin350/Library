package com.korit.library.wep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {

    private String message;
    private T data;
}
