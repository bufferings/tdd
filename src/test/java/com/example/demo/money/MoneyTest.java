package com.example.demo.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
  // TODO: $5 + 10CHF(スイスフラン) = $10(レートが2:1の場合)
  // DONE: $5 * 2 = $10
  // TODO: amountをprivateにする
  // DONE: Dollarの副作用どうする？
  // TODO: Moneyの丸め処理どうする？
  // DONE: equals()
  // TODO: hashCode()
  // TODO: nullとの等価性比較
  // TODO: 他のオブジェクトとの等価性比較

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(new Dollar(10), product);
    product = five.times(3);
    assertEquals(new Dollar(15), product);
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }
}
