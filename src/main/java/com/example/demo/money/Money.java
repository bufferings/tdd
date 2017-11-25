package com.example.demo.money;

class Money implements Expression {

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  int amount;

  String currency;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && currency().equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(String to) {
    int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
    return new Money(amount / rate, to);
  }
}
