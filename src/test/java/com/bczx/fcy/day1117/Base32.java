package com.bczx.fcy.day1117;

import java.util.List;
import java.util.Objects;

public class Base32 extends BaseEncoder<Base32.CoderType> {

  protected Base32(int bitCount, CoderType coderType) {
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
      stringBuilder.append(coderType == CoderType.BASE ? baseCodes[converterIndex] : baseHexCodes[converterIndex])
    );
    String result = stringBuilder.toString();
    result += addPadding(bits);
    System.out.println(src + " : " + result);
    return result;
  }


  private String addPadding(char[] bits) {
    int remainder = bits.length % 40;
    if (remainder == 8) {
      return "======";
    } else if (remainder == 16) {
      return "====";
    } else if (remainder == 24) {
      return "===";
    } else if (remainder == 32) {
      return "=";
    }
    return "";
  }

  private static final char[] baseCodes = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
          '2', '3', '4', '5', '6', '7'
  };

  private static final char[] baseHexCodes = {
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'
  };

  enum CoderType {
    BASE,
    HEX;
  }
}
