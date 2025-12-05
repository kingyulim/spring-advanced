package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @NotBlank
    @Pattern(regexp = "^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])\\S+$",
            message = "비밀번호는 공백 없이 8자 이상이어야 하며 숫자와 대문자를 포함해야 합니다.")
    private String newPassword;
}
