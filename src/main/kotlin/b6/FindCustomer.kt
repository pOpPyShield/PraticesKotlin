package b6

import NameOfOperation.NameOfOperation
import RunApplication.capitalizeFirstLetter
import operationAndInput.OperationAndInput

class FindCustomer(zz : InformationForCustomer) : NameOfOperation("Find customer"), OperationAndInput {
    var findCustomer = zz
    override fun operation() {
        input()
    }

    override fun input(): Int {
        fun4@while(true) {
            println("Enter name to find: ")
            val nameCustomerr = readLine()?.capitalizeFirstLetter()
            if(nameCustomerr == null) {
                println("Wrong format, try again")
                continue@fun4
            } else {
                if(findCustomer.findCustomerByName(nameCustomerr)) {
                    println("Success")
                    break@fun4
                } else {
                    println("Can't find it")
                    println("Do you want to continue?y(yes) or n(no)")
                    val continueFun2 = readLine()?.toUpperCase()?.trim()
                    if(continueFun2 == null || continueFun2 == "N" || continueFun2 == "NO") {
                        break@fun4
                    } else {
                        continue@fun4
                    }
                }
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

}