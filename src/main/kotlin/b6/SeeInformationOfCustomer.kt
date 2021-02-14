package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class SeeInformationOfCustomer(Infor : InformationForCustomer) : NameOfOperation("See information of customer"), OperationAndInput {
    var seeInforArr = Infor

    override fun operation() {
        input()
    }

    override fun input(): Int {
        seeInforArr.seeInforCus()
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }



}