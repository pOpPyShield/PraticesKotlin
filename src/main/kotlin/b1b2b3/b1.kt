package b1b2b3
import operationAndInput.OperationAndInput
import NameOfOperation.NameOfOperation

class b1 :  OperationAndInput, NameOfOperation("Caculate factorial of n"){
    private var n : Int? = 0
    private var resultAll : Long = 0
    override fun operation() {
        Operation@while(true) {
            println(nameOfOperationInside)
            if (input() == 1) {
                resultAll = calculateFactorial()
                println("The result is: $resultAll")
                println("Do you want to continue calculate? y to continue, n to stop")
                var continueToCal = readLine()?.toString()?.toUpperCase()?.trim()
                if (continueToCal.isNullOrEmpty() || continueToCal == "N" || continueToCal == "NOT") {
                    break@Operation
                } else continue@Operation
            } else break@Operation
        }

    }
    override fun input() : Int{
        zau@while(true) {
            println("Enter number to calculate factorial: ")
            var zz = readLine()?.toIntOrNull()
            if(zz == null) {
                println("The number is wrong format")
                continue@zau
            } else {
                n = zz
                break@zau
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    private fun calculateFactorial() : Long {
        var Result : Long = 1
        for(i in 1..n!!) {
            Result *= i
        }
        return Result
    }
}