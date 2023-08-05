//  create a class Account with 3 property : accountname, balance and transactions(should be a list)
//  create functions : deposit, withdraw, calculateBalance
//  add check to check if the deposited amount is greater than 0 or not.
fun main(args: Array<String>) {
    var user1 = Account("Rosetta", 20000.0)
    println(user1.acc_name)
    println(user1.balance)
    user1.deposit(200.0)
//    user1.withdraw(20000.0)
    user1.withdraw(5000.0)
    println("The balance amount is ${user1.calcBalance()}")
}



class Account(var acc_name: String, var balance: Double, var transaction: ArrayList<Double>?) {
    constructor(acc_name: String, balance: Double) : this(acc_name, balance, arrayListOf(balance)) {}
    fun deposit(amount: Double) {
        if (amount == 0.0)
            println("Invalid! Enter an amount.")
        else {
            balance += amount
            transaction?.add(amount)
            println("$amount deposited.\n Balance : $balance")
        }
    }
    fun calcBalance(): Double {
        var balanceAmount = 0.0
        for (transactions in transaction!!) {
//            println(transactions)
            balanceAmount += transactions
        }
        return balanceAmount

    }
    fun withdraw(amount: Double) {
        if (balance < amount)
            println("Insufficient funds. Cannot withdraw!")
        else {
            balance -= amount;
            var value: Double = -amount
            transaction?.add(value)
            println("$amount withdrawn.\n Balance : $balance")
        }
    }


}