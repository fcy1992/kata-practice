package com.bczx.fcy.day1117;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

  @Test
  public void testBase64Encoder() {
    BaseEncoder encoder = new Base64Factory().getCoder(Base64.CoderType.BASE);
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

  @Test
  public void testBase32Encoder() {
    BaseEncoder encoder = new Base32Factory().getCoder(Base32.CoderType.BASE);
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
    encoder = new Base32Factory().getCoder(Base32.CoderType.HEX);
    result = encoder.encode("");
    assertEquals("", result);
    result = encoder.encode("f");
    assertEquals("CO======", result);
    result = encoder.encode("fo");
    assertEquals("CPNG====", result);
    result = encoder.encode("foo");
    assertEquals("CPNMU===", result);
    result = encoder.encode("foob");
    assertEquals("CPNMUOG=", result);
    result = encoder.encode("fooba");
    assertEquals("CPNMUOJ1", result);
    result = encoder.encode("foobar");
    assertEquals("CPNMUOJ1E8======", result);
  }

  @Test
  public void testBase16Encoder() {
    BaseEncoder encoder = new Base16Factory().getCoder(null);
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
