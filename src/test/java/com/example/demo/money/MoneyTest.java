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
  // -> TODO: DollarとFrancの重複
  // DONE: equalsの一般化
  // TODO: timesの一般化
  // DONE: FrancとDollarを比較する
  // TODO: 通貨の概念

  @Test
  public void testMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertTrue(Money.franc(5).equals(Money.franc(5)));
    assertFalse(Money.franc(5).equals(Money.franc(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }
}
