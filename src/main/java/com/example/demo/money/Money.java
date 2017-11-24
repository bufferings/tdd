package com.example.demo.money;

abstract class Money {

  static Money dollar(int amount) {
    return new Dollar(amount);
  }

  int amount;

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

}
