package com.example.demo.money;

class Money {

  int amount;

  @Override
  public boolean equals(Object obj) {
    Dollar dollar = (Dollar) obj;
    return amount == dollar.amount;
  }

}
