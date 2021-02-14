package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class B6 : NameOfOperation("B6"), OperationAndInput {
    private var outSideB6 = mutableListOf<OperationAndInput>()
    private var serList = 0
    override fun operation() {
        input()
    }

    override fun input(): Int {
        addOperationAndInput()
        val entServ = EnterService()
        val allofb6 = AllOfB6(entServ.getList())
        while(true) {
            for(i in 0 until outSideB6.size) {
                println("${i + 1}. ${outSideB6[i].getNameOfOperationInsidezzzz()}")
            }
            println("${outSideB6.size + 1}. Exit")
            println("Enter number choose function: ")
            val z = readLine()?.toIntOrNull()
            if(z != null) {
                if(z in 1..3) {
                    if(z == 1) {
                        entServ.operation()
                        serList = 1
                    } else if(z == 2) {
                        if(serList > 0) {
                            allofb6.operation()
                        } else {
                            println("You don't have any service in your program, add one")
                            continue
                        }
                    } else {
                        println("Good bye :D")
                        break
                    }
                } else {
                    println("The program have two function, try again")
                    continue
                }
            } else {
                println("Wrong format, try again :D")
                continue
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }
    fun addOperationAndInput() {
        val zz = EnterService()
        val gg = CustomerInfoOpe()
        outSideB6.add(zz)
        outSideB6.add(gg)
    }

    fun getSerList() : Int {
        return serList
    }
}