package com.example.demo.money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
  // TODO: $5 + 10CHF(スイスフラン) = $10(レートが2:1の場合)
  // DONE: $5 * 2 = $10
  // TODO: amountをprivateにする
  // TODO: Dollarの副作用どうする？
  // TODO: Moneyの丸め処理どうする？

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
    five.times(3);
    assertEquals(15, five.amount);
  }
}
