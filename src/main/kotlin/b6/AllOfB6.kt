package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class AllOfB6(zz : MutableList<Service> = mutableListOf()) : NameOfOperation("======Welcome to b6====="), OperationAndInput {
    private var opeInformationForCustomer = InformationForCustomer(zz)
    private var opeSeeInformationOfCustomer = SeeInformationOfCustomer(opeInformationForCustomer)
    private var opeArrangeCustomer = ArrangeCustomer(opeInformationForCustomer)
    private var opeFindCustomer = FindCustomer(opeInformationForCustomer)
    private var opeExit = Exit()
    private var arrOpeHandle : MutableList<OperationAndInput> = mutableListOf()

    override fun operation() {
        input()
    }

    override fun input(): Int {
        var inpProgram: Int?
        addAllOperation()
        while (true) {
            println(nameOfOperationInside)
            for (i in 0 until arrOpeHandle.size) {
                println("==${i + 1}.${arrOpeHandle[i].getNameOfOperationInsidezzzz()}")
            }
            println("=> Enter number: ")
            inpProgram = readLine()?.toIntOrNull()
            if (inpProgram == null || inpProgram <= 0 || inpProgram > 5) {
                println("Oops, some problem happened")
                continue
            } else if(inpProgram == 5) {
                println("Thanks for using my program :D ")
                break
            } else{
                executeOperation(inpProgram)
            }
        }
        return 1
    }

    private fun executeOperation(index : Int) {

        for(i in 0 until arrOpeHandle.size) {
            if(index == i + 1) {
                arrOpeHandle[i].operation()
            }
        }
    }
    private fun addArrOperation() {

    }
    private fun addAllOperation() {
        arrOpeHandle.add(opeInformationForCustomer)
        arrOpeHandle.add(opeSeeInformationOfCustomer)
        arrOpeHandle.add(opeArrangeCustomer)
        arrOpeHandle.add(opeFindCustomer)
        arrOpeHandle.add(opeExit)
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }
}