package money

class Dollar (var amount: Int)
{
  def times(multiplier: Int) : Dollar =
  {
     new Dollar(amount * multiplier)
  }

  // TODO: how implemented cast?
  def equals(rhs: Dollar) : Boolean =
  {
   amount == rhs.amount
  }
}
