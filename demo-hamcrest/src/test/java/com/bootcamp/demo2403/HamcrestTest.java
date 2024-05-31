package com.bootcamp.demo2403;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {

  @Test
  void testString() {
    String actualValue = "Hello";
    String expectedValue = "Hello";
    String expectedValue2 = "Hello2";

    // Junit 5
    assertEquals(actualValue, expectedValue);

    // Hamcrest
    assertThat(actualValue, is(equalTo(expectedValue)));
    assertThat(actualValue, is(not(equalTo(expectedValue2))));

    // Null Value Check
    String s1 = null;
    assertThat(s1, is(nullValue()));
    String s2 = "abc";
    assertThat(s2, is(notNullValue()));

    // Same instance
    String s3 = "Hello";
    String s4 = "Hello";
    String s5 = new String("Hello");
    assertThat(s3, is(sameInstance(s4)));
    assertThat(s5, is(not(sameInstance(s4))));

    int value = 42;
    assertThat(value, allOf( //
        greaterThan(41), //
        greaterThanOrEqualTo(42), //
        equalTo(42), //
        lessThan(43), //
        lessThanOrEqualTo(42) //
    ));

    assertThat(value, anyOf( //
        is(greaterThan(43)), // false
        is(greaterThanOrEqualTo(42)), // true
        is(equalTo(43)), // false
        is(lessThan(41)), // false
        is(lessThanOrEqualTo(41)) // false
    ));

    assertThat("hello", startsWith("h"));
    assertThat("hello", not(startsWith("l")));
    assertThat("hello", endsWith("o"));
    assertThat("hello", not(endsWith("l")));

    assertThat("hello", containsString("ll"));
    assertThat("hello", not(containsString("lll")));

    assertThat("hello", is(not(emptyString())));
    assertThat("", is(emptyString()));
  }

  @Test
  void testList() {
    // you cannot add/remove elements in the below list.
    List<String> wrongway = List.of("apple", "banana"); // this is not an arraylist object

    // Correct way
    List<String> strings = new ArrayList<>(List.of("apple", "banana"));
    List<String> strings2 = Arrays.asList("apple", "banana");

    assertThat(strings, hasSize(2));
    // check if contains all element and with order
    assertThat(strings, contains("apple", "banana"));
    assertThat(strings, not(contains("banana", "apple")));
    assertThat(strings, not(contains("orange")));

    assertThat(strings, containsInAnyOrder("banana", "apple"));
    assertThat(strings, containsInAnyOrder("apple", "banana"));

    List<String> emptyList = new ArrayList<>();
    List<String> emptyList2 = Collections.emptyList();
    assertThat(emptyList, is(empty()));
    assertThat(strings, is(not(empty())));

    assertThat(strings, hasItem("banana"));
    assertThat(strings, hasItems("apple", "banana"));
  }

  @Test
  void testArray() {
    String[] arr = new String[] {"hello", "abc"};
    // contains all elements and with order
    assertThat(arr, arrayContaining("hello", "abc"));
    assertThat(arr, not(arrayContaining("abc", "hello")));

    assertThat(arr, arrayContainingInAnyOrder("abc", "hello"));
    assertThat(arr, arrayContainingInAnyOrder("hello", "abc"));
  }

  @Test
  void testTolerance() {
    double tolerance = 0.1d;
    double actual = 3.14159d; // 3.04159 < x < 3.25158
    assertThat(actual, closeTo(3.1111, tolerance));
    assertThat(actual, not(closeTo(3.04100, tolerance)));
    assertThat(actual, not(closeTo(3.26, tolerance)));
    assertThat(actual, closeTo(3.24, tolerance));
    assertThat(actual, closeTo(3.05, tolerance));
  }

  @Test
  void testInstanceOf() {
    Number number = Long.valueOf(13);
    assertThat(number, is(instanceOf(Long.class)));
    assertThat(number, is(instanceOf(Number.class)));

    assertThat(Long.class, typeCompatibleWith(Number.class));
  }


}
