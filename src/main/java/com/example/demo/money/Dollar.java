package com.example.demo.money;

class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  Money times(int multiplier) {
    return new Dollar(amount * multiplier, currency);
  }

}
