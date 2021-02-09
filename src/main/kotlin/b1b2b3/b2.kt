package b1b2b3

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class b2 : NameOfOperation(nameOfOperation = "Count number mod 5"), OperationAndInput {
    var n = 0
    var count = 0
    override fun operation() {
        countNumberMod5@while(true) {
            println("Count number mod 5")
            if(input() == 1) {
                countThis()
                println("The result is: $count")
                println("Do you want to continue? y to continue, n to stop")
                var continueCalculate = readLine()?.toString()?.toUpperCase()?.trim()
                if(continueCalculate.isNullOrEmpty() || continueCalculate == "N" || continueCalculate == "NOT") {
                    break@countNumberMod5
                } else continue@countNumberMod5
            }
        }
    }
    override fun input() : Int {
        n = 100
        return 1
    }

    private fun countThis() : Int {
        var countt = 0
        for (i in 0..n) {
            if (i % 5 == 0) {
                countt++
            }
        }
        count = countt++
        return count
    }
}