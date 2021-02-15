package b5

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class B5: NameOfOperation("B5"), OperationAndInput {
    override fun operation() {
        val containthree = ContainThree()
        containthree.operation()
    }

    override fun input(): Int {
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }
}