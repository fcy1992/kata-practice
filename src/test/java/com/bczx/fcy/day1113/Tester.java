package com.bczx.fcy.day1113;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

  @Test
  public void testBase64Encoder() {
    BaseEncoder encoder = new Base64();
    String result = encoder.encode("");
    assertEquals("", result);
    result = encoder.encode("f");
    assertEquals("Zg==", result);
    result = encoder.encode("fo");
    assertEquals("Zm8=", result);
    result = encoder.encode("foo");
    assertEquals("Zm9v", result);
    result = encoder.encode("foob");
    assertEquals("Zm9vYg==", result);
    result = encoder.encode("fooba");
    assertEquals("Zm9vYmE=", result);
    result = encoder.encode("foobar");
    assertEquals("Zm9vYmFy", result);
  }

}
