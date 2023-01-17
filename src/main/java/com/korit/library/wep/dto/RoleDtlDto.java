package com.korit.library.wep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class RoleDtlDto {
    private int roleDtlId;

    private int userId;
    private int roleId;

    private RoleMstDto roleMstDto;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;

}
