package com.bczx.fcy.day1117;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseEncoder<T> {

  int bitCount;

  T coderType;

  public abstract String encode(String src);

  protected char[] getBitChars(byte[] bytes) {
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

  protected List<Integer> getBaseIndexes(char[] bits, int bitCount) {
    int counter = 0;
    int index = 0;
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < bits.length; i++) {
      index += Math.pow(2, bitCount - 1 - counter) * Integer.parseInt(String.valueOf(bits[i]));
      counter ++;
      if (counter >= bitCount) {
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
}
