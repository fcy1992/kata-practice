package com.bczx.fcy.day1113;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Base64 extends BaseEncoder {

  @Override
  public String encode(String src) {
    if (Objects.isNull(src) || src.length() == 0) {
      return "";
    }
    byte[] bytes = src.getBytes();
    char[] bits = getBitChars(bytes);
    List<Integer> indexes = getBaseIndexes(bits);
    StringBuilder stringBuilder = new StringBuilder();
    indexes.forEach(converterIndex ->
      stringBuilder.append(baseCodes[converterIndex])
    );
    String result = stringBuilder.toString();
    addPadding(bits, stringBuilder, result);
    System.out.println(src + " : " + result);
    return result;
  }

  private char[] getBitChars(byte[] bytes) {
    StringBuilder bitStr = new StringBuilder();
    for (byte b : bytes) {
      for (int i = 0; i < 8; i++) {
        int bit = (b & 128) == 0 ? 0 : 1;
        bitStr.append(bit);
        b <<= 1;
      }
    }
    return bitStr.toString().toCharArray();
  }

  private List<Integer> getBaseIndexes(char[] bits) {
    int counter = 0;
    int index = 0;
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < bits.length; i++) {
      index += Math.pow(2, 5 - counter) * Integer.parseInt(String.valueOf(bits[i]));
      counter ++;
      if (counter >= 6) {
        indexes.add(index);
        index = 0;
        counter = 0;
        continue;
      }
      if (i == bits.length - 1) {
        indexes.add(index);
      }
    }
    return indexes;
  }

  private String addPadding(char[] bits, StringBuilder stringBuilder, String result) {
    int remainder = bits.length % 24;
    if (remainder == 8) {
      result = stringBuilder.toString() + "==";
    } else if (remainder == 16) {
      result = stringBuilder.toString() + "=";
    }
    return result;
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

}
