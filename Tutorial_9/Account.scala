class Account (var balance: Double){
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be greater than zero")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be greater than zero")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    withdraw(amount)
    toAccount.deposit(amount)
  }
}

class Bank(accounts: List[Account]) {
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.balance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        account.deposit(account.balance * 0.05)
      } else {
        account.withdraw(account.balance * 0.1)
      }
    }
  }
}

object Main2 {
  def main(args: Array[String]): Unit = {
    val a1 = new Account(100)
    val a2 = new Account(200)
    val a3 = new Account(300)
    val a4 = new Account(400)
    val a5 = new Account(500)
    val a6 = new Account(600)
    val a7 = new Account(700)
    val a8 = new Account(800)
    val a9 = new Account(900)
    val a10 = new Account(1000)
    val bank = new Bank(List(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10))
    println(bank.totalBalance)
    bank.applyInterest()
    println(bank.totalBalance)
  }
}
