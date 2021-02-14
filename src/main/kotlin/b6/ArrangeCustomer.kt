package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class ArrangeCustomer(zz :InformationForCustomer) : NameOfOperation("Arrange customer of money service"), OperationAndInput {
    var arrangeArrCustomer = zz
    override fun operation() {
        input()
    }

    override fun input(): Int {
        fun3@while(true) {
            if(arrangeArrCustomer.sortedArrCustomer() == 1) {
                break@fun3
            } else {
                break@fun3
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

}