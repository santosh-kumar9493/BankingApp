package com.banking.accounts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data@AllArgsConstructor
public class ErrorResponseDto {
    public String apiPath;
    public HttpStatus errorCode;
    public int errorMessage;
    public LocalDateTime errorTime;
}
