package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class Exit : NameOfOperation("Exit"), OperationAndInput {
    override fun operation() {
        input()
    }

    override fun input(): Int {
        return 1
    }
    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

}