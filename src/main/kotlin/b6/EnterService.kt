package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class EnterService : NameOfOperation("Enter service information"), OperationAndInput {
    private var serviceListOfAdmin = HandleService()

    override fun operation() {
        input()
    }

    override fun input(): Int {
        while(true) {
            println(getNameOfOperationInsidezzzz())
            println("Enter number service entered: ")
            val inpSer : Int? = readLine()?.toIntOrNull()
            if(inpSer == null || inpSer < 0) {
                println("The number can not be empty or small than 0")
                continue
            } else if(inpSer > 10) {
                println("The service limit to 10, try again")
                continue
            } else {
                for(i in 0 until inpSer) {
                    val ser1 = Service()
                    ser1.operation()
                    serviceListOfAdmin.addService(ser1)
                }
                break
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    fun getSize() : Int {
        return serviceListOfAdmin.sizeOfService()
    }

    fun getList() : MutableList<Service> {
        return serviceListOfAdmin.getServiceList()
    }
}