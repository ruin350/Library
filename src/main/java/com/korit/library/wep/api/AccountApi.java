package com.korit.library.wep.api;

import com.korit.library.aop.annotation.ValidAspect;
import com.korit.library.wep.dto.CMRespDto;
import com.korit.library.wep.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/account")
public class AccountApi {

    @ValidAspect
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid UserDto userDto, BindingResult bindingResult) {
        return ResponseEntity
                .created(null)
                .body(new CMRespDto<>("Create a new User", null));
    }

}
