package com.example.demo.money;

class Money {

  static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  int amount;

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }

}
