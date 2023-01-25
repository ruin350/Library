package com.korit.library.repogitory;

import com.korit.library.wep.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {
    public UserDto findUserByUsername(String username);
}
