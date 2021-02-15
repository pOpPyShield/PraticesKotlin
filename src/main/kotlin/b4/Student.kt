package b4

import NameOfOperation.NameOfOperation
import RunApplication.capitalizeFirstLetter
import operationAndInput.OperationAndInput

class Student : NameOfOperation("Student information"), OperationAndInput {
    private var arrMark = mutableListOf<Float>()
    private var name : String? = null
    override fun operation() {
        input()
    }

    override fun input(): Int {
        while(true) {
            println("Enter name of student: ")
            name = readLine()?.capitalizeFirstLetter()
            if(name.isNullOrEmpty()) {
                println("Name can not be empty")
                continue
            }
            while(true) {
                println("Enter the number semester(1-6): ")
                val numberSemester = readLine()?.toIntOrNull()
                if (numberSemester != null) {
                    if(numberSemester in 1..6) {
                        for(i in 0 until numberSemester) {
                            println("Enter mark of semester ${i + 1}: ")
                            val markSemester = readLine()?.toFloatOrNull()
                            if(markSemester != null) {
                                if (checkRange(markSemester) == 1) {
                                    arrMark.add(markSemester)
                                    continue
                                } else {
                                    println("Not in range, try again")
                                    break
                                }
                            } else {
                                println("The number is wrong format, try again")
                                break
                            }

                        }
                        break
                    } else {
                        println("Invalid number, try again")
                        continue
                    }
                } else {
                    println("Wrong format, try again")
                    continue
                }
            }
            break
        }
        calculateWithSemester()
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    private fun checkRange(Num : Float?) : Int {
        if(Num!! in 0.0..10.0) {
            return 1
        }
            return 0
    }
    private fun calculateWithSemester() {
        if(arrMark.size < 6) {
            println("The mark of ${arrMark.size} semester: ${calculateAverageMark()}")
        } else {
            var total : Float= 0.0F
            for(i in 0 until arrMark.size - 1) {
                total += arrMark[i]
            }
            val average : Float = (total + (arrMark[5] * 2)) / 6
            println("The mark of 6 semester: $average")
        }
    }
    private fun calculateAverageMark() : Double {
        return arrMark.map { it -> it.toDouble() }.average()
    }
}