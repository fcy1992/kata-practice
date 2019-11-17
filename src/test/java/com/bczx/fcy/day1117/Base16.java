package com.bczx.fcy.day1117;

import java.util.List;
import java.util.Objects;

public class Base16 extends BaseEncoder<Object> {

  public Base16(int bitCount) {
    this.bitCount = bitCount;
  }

  @Override
  public String encode(String src) {
    if (Objects.isNull(src) || src.length() == 0) {
      return "";
    }
    byte[] bytes = src.getBytes();
    char[] bits = getBitChars(bytes);
    List<Integer> indexes = getBaseIndexes(bits, bitCount);
    StringBuilder stringBuilder = new StringBuilder();
    indexes.forEach(converterIndex ->
            stringBuilder.append(baseCodes[converterIndex])
    );
    String result = stringBuilder.toString();
    System.out.println(src + " : " + result);
    return result;
  }

  private static final char[] baseCodes = {
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
          'A', 'B', 'C', 'D', 'E', 'F',
  };
}
