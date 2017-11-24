package com.example.demo.money;

abstract class Money {

  static Money dollar(int amount) {
    return new Dollar(amount);
  }

  static Franc franc(int amount) {
    return new Franc(amount);
  }

  int amount;

  String currency;

  abstract Money times(int multiplier);

  abstract String currency();

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
