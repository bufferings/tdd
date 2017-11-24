package com.example.demo.money;

class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  Money times(int multiplier) {
    return new Franc(amount * multiplier, currency);
  }

}
