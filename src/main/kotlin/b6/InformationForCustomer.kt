package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class InformationForCustomer(zg : MutableList<Service> = mutableListOf()) : NameOfOperation("Enter information for customer"), OperationAndInput {
    private var arrCustomer = HandleCustomer()
    private var listService = zg
    override fun operation() {
        input()
    }
    fun getArrCustomer() : MutableList<Customer> {
        return arrCustomer.getArrCustomer()
    }
    fun getObjHandle() : HandleCustomer {
        return arrCustomer
    }
    override fun input(): Int {
        fun1@ while (true) {
            println("Enter number of customer you want to add: ")
            var inpCustomer: Int? = readLine()?.toIntOrNull()
            if (inpCustomer == null || inpCustomer <= 0) {
                println("Oops, wrong format, try again")
                continue@fun1
            } else {
                for (i in 0 until inpCustomer) {
                    val cuszz = Customer("",0 ,"", mutableListOf(),listService)
                    println("Enter ${i + 1} customer")
                    cuszz.operation()
                    arrCustomer.addCustomer(cuszz)
                }
                println("Add success!!")
                break@fun1
            }
        }
        return 1
    }
    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }
    fun seeInforCus() : Int {
        return if(arrCustomer.informationOfCustomerArr() == 0) {
            println("Done")
            0
        } else {
            println("=========")
            1
        }
    }
    fun sortedArrCustomer() : Int{
        return if(arrCustomer.getSize() > 0) {
            arrCustomer.getArrCustomer().sortBy { it.calculateSumOfMoney() }
            0
        } else {
            println("Don't have any service to arrange")
            1
        }
    }
    fun findCustomerByName(nameCustomer : String) : Boolean {
        var isIn = false
        for(i in 0 until arrCustomer.getArrCustomer().size) {
            if(arrCustomer.getArrCustomer()[i].getNameCustomer() == nameCustomer) {
                println("Have customer here")
                println("${arrCustomer.getArrCustomer()[i].getNameCustomer()}")
                println("${arrCustomer.getArrCustomer()[i].getAgeOfCustomerInside()}")
                println("${arrCustomer.getArrCustomer()[i].getHomeTownCustomer()}")
                isIn = true
                break
            }
        }
        return isIn
    }
}