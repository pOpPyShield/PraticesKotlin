import operationAndInput.OperationAndInput
import b1b2b3.*
import b4.Student
import b5.B5
import b6.B6

class RunAllApplication {
    private var operation = mutableListOf<OperationAndInput>()
    private fun add() {
        //b1b2b3 package
        val B1Pack = b1()
        val B2Pack = b2()
        val B3Pack = b3()
        operation.add(B1Pack)
        operation.add(B2Pack)
        operation.add(B3Pack)
        //b4
        val B4Pack = Student()
        operation.add(B4Pack)
        //b5
        val B5Pack = B5()
        operation.add(B5Pack)
        //b6
        val B6Pack = B6()
        operation.add(B6Pack)
    }

    fun run() {
        add()
        while(true) {
            println("==Run all exercise==")
            for(i in 0 until operation.size) {
                println("${i+1}. ${operation[i].getNameOfOperationInsidezzzz()}")
            }
            println("${operation.size + 1}. Exit")
            println("=> Enter number to choose: ")
            val numChoose = readLine()?.toIntOrNull()
            if(numChoose != null) {
                if(numChoose > 0) {
                    if (numChoose in 1..operation.size+1) {
                        if(execute(numChoose) == 0) {
                            println("Thanks for using my program")
                            break
                        }
                        continue
                    } else {
                        println("The function in this program have 6, try again")
                        continue
                    }
                } else {
                    println("The number must greater than 0")
                    continue
                }
            } else {
                println("Number is wrong format")
                continue
            }
        }
    }

    private fun execute(numChoose : Int) : Int {
        var check = 0
        if(numChoose < operation.size + 1) {
            for (i in 0 until operation.size) {
                if (numChoose - 1 == i) {
                    operation[i].operation()
                }
            }
            check = 1
        } else if(numChoose == operation.size + 1) {
            check = 0
        }
        return check
    }
}