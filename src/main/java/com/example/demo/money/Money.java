package com.example.demo.money;

class Money {

  int amount;

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount;
  }

}
