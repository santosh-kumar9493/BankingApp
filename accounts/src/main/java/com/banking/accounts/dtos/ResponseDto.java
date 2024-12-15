package com.banking.accounts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor@Data
public class ResponseDto {
    public HttpStatus statusCode;
    public String statusMsg;
}
