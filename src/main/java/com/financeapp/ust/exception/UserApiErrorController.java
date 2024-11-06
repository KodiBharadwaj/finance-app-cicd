package com.financeapp.ust.exception;

import com.financeapp.ust.dto.ErrorResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class UserApiErrorController {

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleRecordNotFoundError(RecordNotFoundException ex, HttpServletRequest request){
        var status = HttpStatus.NOT_FOUND;
        ErrorResponseDTO body = new ErrorResponseDTO(
                LocalDateTime.now(),
                status.value(),
                status.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(body);
    }


//    @ExceptionHandler(RecordNotFoundException.class)
//    public ProblemDetail handleRecordNotFoundError(RecordNotFoundException ex){
//        ProblemDetail response = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
//        response.setProperty("message",ex.getMessage());
//        return response;
//    }

}
