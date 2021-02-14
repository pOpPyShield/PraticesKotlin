package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class CustomerInfoOpe : NameOfOperation("Enter information of customer"), OperationAndInput {
    override fun operation() {
        input()
    }

    override fun input(): Int {
        println(nameOfOperationInside)
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

}