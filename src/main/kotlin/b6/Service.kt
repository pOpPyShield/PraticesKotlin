package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class Service(nameServicez: String?, moneyz: Double?, amountz: Int ) : NameOfOperation(nameOfOperation = "Service information"), OperationAndInput {
    private var nameService: String? = nameServicez
    private var money: Double? = moneyz
    private var amount: Int = amountz

    constructor() : this("", null, 0)

    override fun operation() {
        if(input() == 1) {
            informationOfService()
        }
    }



    override fun input() : Int {
        println(nameOfOperationInside)
        var nameSv : String?
        var moneySv : Double?
        var amountSv : Int?
        outLoop@while(true) {
            nameSv@while(true) {
                println("Enter name service: ")
                nameSv = readLine()?.toString()
                if (nameSv.isNullOrEmpty()) {
                    println("Name service can not be null or empty, try again :D ")
                    continue@nameSv
                } else{
                    nameService = nameSv
                    break@nameSv
                }
            }
            moneySv@while(true) {
                println("Enter money of service: ")
                moneySv = readLine()?.toDoubleOrNull()
                if(moneySv == null) {
                    println("Money of service wrong format or empty, try again")
                    continue@moneySv
                } else {
                    money = moneySv
                    break@moneySv
                }
            }
            amountSv@while(true) {
                println("Enter amount of service: ")
                amountSv = readLine()?.toIntOrNull()
                if(amountSv == null) {
                    println("Amount of service wrong format or empty, try again")
                    continue@amountSv
                } else {
                    amount = amountSv
                    break@amountSv
                }
            }
            break@outLoop
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    fun informationOfService() {
        println("Name service: $nameService")
        println("Money: $money")
        println("Amount: $amount")
    }
    fun getNameService(): String? {
        return nameService
    }
    fun getMoneyService() : Double? {
        return money
    }
    fun getAmountService() : Int {
        return amount
    }
    fun updateAmountService(amountOfUpdate : Int) : Int {
        return if(amount >= amountOfUpdate) {
            amount -= amountOfUpdate
            1
        } else {
            0
        }
    }
}