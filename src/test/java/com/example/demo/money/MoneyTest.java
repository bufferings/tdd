package com.example.demo.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
  // TODO: $5 + 10CHF(スイスフラン) = $10(レートが2:1の場合)
  // DONE: $5 * 2 = $10
  // DONE: amountをprivateにする
  // DONE: Dollarの副作用どうする？
  // TODO: Moneyの丸め処理どうする？
  // DONE: equals()
  // TODO: hashCode()
  // TODO: nullとの等価性比較
  // TODO: 他のオブジェクトとの等価性比較
  // DONE: 5CHF * 2 = 10CHF
  // TODO: DollarとFrancの重複
  // -> TODO: equalsの一般化
  // TODO: timesの一般化

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
    assertTrue(new Franc(5).equals(new Franc(5)));
    assertFalse(new Franc(5).equals(new Franc(6)));
  }

  @Test
  public void testFrancMultiplication() {
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }
}
