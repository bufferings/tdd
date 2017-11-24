package com.example.demo.money;

class Money {

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Franc franc(int amount) {
    return new Franc(amount, "CHF");
  }

  int amount;

  String currency;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return null;
  }

  String currency() {
    return currency;
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
