package com.example.demo.money;

class Bank {

  Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  void addRate(String from, String to, int rate) {
  }

  int rate(String currency, String to) {
    return (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
  }
}
