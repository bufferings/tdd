package com.example.demo.money;

class Franc extends Money {

  Franc(int amount) {
    this.amount = amount;
    this.currency = "CHF";
  }

  @Override
  Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }

}
