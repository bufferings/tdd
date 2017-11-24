package com.example.demo.money;

class Franc extends Money {

  private String currency;

  Franc(int amount) {
    this.amount = amount;
    this.currency = "CHF";
  }

  @Override
  Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }

}
