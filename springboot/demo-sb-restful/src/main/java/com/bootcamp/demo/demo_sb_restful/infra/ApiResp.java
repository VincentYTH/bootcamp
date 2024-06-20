package com.bootcamp.demo.demo_sb_restful.infra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

@ToString
public class ApiResp<T> {

  private int code;
  private String message;
  private List<T> data;

  public int getCode(){
    return this.code;
  }

  public String getMessage(){
    return this.message;
  }

  public List<T> getData(){
    return this.data;
  }

  private ApiResp(ApiRespBuilder<T> builder){
    this.code = builder.code;
    this.message = builder.message;
    this.data = builder.data;
  }

  // static generic
  public static <U> ApiRespBuilder<U> builder(){
    return new ApiRespBuilder<>();
  }

  public static class ApiRespBuilder<T>{
    private int code;
    private String message;
    private List<T> data;

    public ApiRespBuilder<T> code(int code){
      this.code = code;
      return this;
    }

    public ApiRespBuilder<T> message(String message){
      if (message == null)
        throw new NullPointerException("message is marked non-null but is null");
      this.message = message;
      return this;
    }

    public ApiRespBuilder<T> error(ErrorCode errorCode){
      if (errorCode == null)
        throw new NullPointerException("message is marked non-null but is null");
      this.code = errorCode.getCode();
      this.message = errorCode.getDesc();
      return this;
    }

    public ApiRespBuilder<T> ok(){
      this.code = 0;
      this.message = "Success.";
      return this;
    }

    // public ApiRespBuilder<T> badRequest(){
    //   this.code = 99;
    //   this.message = "Bad Request.";
    //   return this;
    // }

    public ApiRespBuilder<T> data(List<T> data){
      this.data = data;
      return this;
    }

    public ApiResp<T> build(){
      return new ApiResp<>(this);
    }

  }

  public static void main(String[] args) {
    // Java 9
    // List<String> strings = List.of("abc", "def");
    // better peformance

    // Immutable:
    // strings.set(0, "hello"); // java.lang.UnsupportedOperationException
    // strings.add("hello"); // java.lang.UnsupportedOperationException
    // strings.remove(0); // java.lang.UnsupportedOperationException

    // Java 8
    // input param -> (String... str)
    Arrays.asList("abc", "def");
    List<String> strings2 = Arrays.asList(new String[] {"abc", "def"});

    strings2.set(0, "hello"); // OK, implies sorting is fine
    // strings2.add("hello"); // java.lang.UnsupportedOperationException
    // strings2.remove(0); // java.lang.UnsupportedOperationException

    new ArrayList<String>();
    new LinkedList<String>();
    // OK -> modify, add, remove but Heavy

    ApiResp<UserDTO> response = ApiResp.<UserDTO>builder()
      .ok()
      .data(List.of(new UserDTO()))
      .build();

    // Test RestTemplate.getForObject()
    // 1. Call web API, return JSON
    // 2. Using ObjectMapper for deserialization
    // Object -> JSON
    ObjectMapper objectMapper = new ObjectMapper();
    String jsonResponse = "";
    try {
      jsonResponse = objectMapper.writeValueAsString(response);
    } catch (JsonProcessingException e) {
      
    }
    System.out.println(jsonResponse);

    try {
      TypeReference<ApiResp<UserDTO>> reference = new TypeReference<>() {};
      ApiResp<UserDTO> response2 = objectMapper.readValue(jsonResponse, reference);
      System.out.println(response2);
    } catch (JsonProcessingException e) {
      System.out.println("error.");
    }

  }
}
