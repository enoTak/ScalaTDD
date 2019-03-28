package money

class Dollar (var amount: Int) {
  def times(multiplier: Int) : Dollar =
  {
     new Dollar(amount * multiplier)
  }
}
