package b1b2b3

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class b3 : NameOfOperation(nameOfOperation = "Array descending and count odd number"), OperationAndInput {
    var arr : MutableList<Int> = mutableListOf()
    var countz = 0
    override fun operation() {
        while(true) {
            println(nameOfOperationInside)
            if(input() == 1) {
                countOddNumber()
                println("Result: $countz")
                println("Do you want to continue? y to continue, n to stop")
                var zz = readLine()?.toString()?.toUpperCase()?.trim()
                if(zz.isNullOrEmpty() || zz == "N") {
                    break
                } else {
                    continue
                }
            } else {
                println("Something wrong, try again")
                break
            }
        }
    }

    override fun input(): Int {
        var n : Int?
        var ext : String?
        var isOut : Boolean = false
        validN@while(true) {
                println("Enter number to add to list: ")
                n = readLine()?.toIntOrNull()
                if (n == null || n < 0) {
                    println("Wrong format, try again or exit with 'x'")
                    ext = readLine()?.toString()?.toUpperCase()?.trim()
                    if(ext.isNullOrEmpty() || ext == "X") {
                        println("Oops some problem happened, try again :D")
                        isOut = true
                        break@validN
                    } else continue@validN
                } else {
                    println("The program not handle null or other different type, only accept integer number, be careful :D")
                    var zau : Int?
                    for(i in 0 until n) {
                        validElement@while(true) {
                            println("Enter ${i+1}st number: ")
                            zau = readLine()?.toIntOrNull()
                            if(zau == null) continue@validElement
                            else {
                                arr.add(zau)
                                break@validElement
                            }
                        }
                    }
                    break@validN
                }
        }
        return if(isOut) {
            0
        } else {
            1
        }
    }
    private fun countOddNumber() : Int {
        var count = 0
        for(i in 0 until arr.size) {
            if(arr[i] % 3 == 0) {
                count++
            }
        }
        countz = count
        return countz

    }
}