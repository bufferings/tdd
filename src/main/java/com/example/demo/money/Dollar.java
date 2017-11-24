package com.example.demo.money;

class Dollar extends Money {

  Dollar(int amount) {
    this.amount = amount;
    this.currency = "USD";
  }

  @Override
  Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }

}
