package com.bootcamp.demo.demo_sb_restful.infra;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import lombok.Getter;

@RestControllerAdvice // @ControllerAdvice + @ResponseBody
public class GlobalExceptionHandler {

  @Getter
  private enum ErrorCode{
    NPE(99, "Null Pointer Exception."),
    NFE(100, "Number Format Exception."),
    AE(101, "Arithmetic Exception."),
    ;

    private int code;
    private String desc;
  
    private ErrorCode(int code, String desc){
      this.code = code;
      this.desc = desc;
    }
  }
  
  // try to catch NotFoundException
  // if it is caught, call this java method, it passes the input parameter as well.
  @ExceptionHandler(NumberFormatException.class)
  public ErrorResponse numberFormatExceptionHandler(NumberFormatException e){
    return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  }

  @ExceptionHandler(NullPointerException.class)
  public ErrorResponse nullPointerExceptionHandler(NullPointerException e){
    return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  }

  @ExceptionHandler(ArithmeticException.class)
  public ErrorResponse arithmeticExceptionHandler(ArithmeticException e){
    return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  }

  // Alternative
  // @ExceptionHandler({NumberFormatException.class, 
  // NullPointerException.class, ArithmeticException.class}) // {} -> or
  // public ErrorResponse exceptionHandler(RuntimeException e){
  //   if (e instanceof NumberFormatException)
  //     return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  //   if (e instanceof NullPointerException)
  //     return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  //   if (e instanceof ArithmeticException) 
  //     return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  //   else
  //     return ErrorResponse.of(999, "Unhandled Exception.");
  // }


  // @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
  // public ErrorResponse arrayIndexOutOfBoundsExceptionHandler(ArrayIndexOutOfBoundsException e){
  //   return new ErrorResponse(102, "Array Index Out Of Bounds Exception.");
  // }

  // @ExceptionHandler(IndexOutOfBoundsException.class)
  // public ErrorResponse indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException e){
  //   return new ErrorResponse(103, "Index Out Of Bounds Exception.");
  // }

  // @ExceptionHandler(IllegalArgumentException.class)
  // public ErrorResponse illegalArgumentExceptionHandler(IllegalArgumentException e){
  //   return new ErrorResponse(104, "Illegal Argument Exception.");
  // }

  // @ExceptionHandler(IllegalStateException.class)
  // public ErrorResponse illegalStateExceptionHandler(IllegalStateException e){
  //   return new ErrorResponse(105, "Illegal State Exception.");
  // }

}
