package com.bczx.fcy.day1117;

import java.util.List;
import java.util.Objects;

public class Base64 extends BaseEncoder<Base64.CoderType> {

  private Base64() {}

  Base64(int bitCount, CoderType coderType) {
    this.bitCount = bitCount;
    this.coderType = coderType;
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
            stringBuilder.append(coderType == CoderType.BASE ? baseCodes[converterIndex] : baseURLCodes[converterIndex])
    );
    String result = stringBuilder.toString();
    result += getPadding(bits);
    System.out.println(src + " : " + result);
    return result;
  }

  private String getPadding(char[] bits) {
    int remainder = bits.length % 24;
    if (remainder == 8) {
      return "==";
    } else if (remainder == 16) {
      return "=";
    }
    return "";
  }

  private static final char[] baseCodes = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
          'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
          'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
  };

  private static final char[] baseURLCodes = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
          'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
          'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'
  };

  enum CoderType {
    BASE,
    URL;
  }
}
