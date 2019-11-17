package com.bczx.fcy.day1115;

import com.bczx.fcy.day1113.BaseEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

  @Test
  public void testBase32Encoder() {
    BaseEncoder encoder = new Base32();
    String result = encoder.encode("");
    assertEquals("", result);
    result = encoder.encode("f");
    assertEquals("MY======", result);
    result = encoder.encode("fo");
    assertEquals("MZXQ====", result);
    result = encoder.encode("foo");
    assertEquals("MZXW6===", result);
    result = encoder.encode("foob");
    assertEquals("MZXW6YQ=", result);
    result = encoder.encode("fooba");
    assertEquals("MZXW6YTB", result);
    result = encoder.encode("foobar");
    assertEquals("MZXW6YTBOI======", result);
  }

  @Test
  public void testBase16Encoder() {
    BaseEncoder encoder = new Base16();
    String result = encoder.encode("");
    assertEquals("", result);
    result = encoder.encode("f");
    assertEquals("66", result);
    result = encoder.encode("fo");
    assertEquals("666F", result);
    result = encoder.encode("foo");
    assertEquals("666F6F", result);
    result = encoder.encode("foob");
    assertEquals("666F6F62", result);
    result = encoder.encode("fooba");
    assertEquals("666F6F6261", result);
    result = encoder.encode("foobar");
    assertEquals("666F6F626172", result);
  }

}
