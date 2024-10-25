package com.plaything.api.domain.auth.model.response;

import com.plaything.api.common.exception.ErrorCode;
import io.swagger.v3.oas.annotations.media.Schema;


@Schema(description = "Login 요청")
public record LoginResponse(
        @Schema(description = "error code")
        ErrorCode description,
        @Schema(description = "jwt token")
        String token
) {}
