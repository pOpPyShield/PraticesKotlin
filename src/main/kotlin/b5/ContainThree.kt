package b5

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class ContainThree : NameOfOperation("Manager staff"), OperationAndInput{
    private var containStaffOperation = mutableListOf<ParentProperties>()
    private var storeStaff = mutableListOf<ParentProperties>()
    override fun operation() {
        while(true) {
            println(nameOfOperationInside)
            println("1. Enter info of staff")
            println("2. Calculate money have pay")
            println("3. Exit")
            println("=>Enter number to choose: ")
            val chooseOpe = readLine()?.toIntOrNull()
            if(chooseOpe != null) {
                if(chooseOpe in 1..3) {
                    if(chooseOpe == 1) {
                        input()
                    } else if(chooseOpe == 2) {
                        if(storeStaff.size > 0) {
                            println("The money you have pay is: ${caculateTheMoneyHavePay()}")
                            break
                        } else {
                            println("You must entered the staff before calculate")
                            continue
                        }
                    } else {
                        break
                    }
                }
            }
        }
    }

    override fun input(): Int {
        addOpe()
        while(true) {
            println(nameOfOperationInside)
            for(i in 0 until containStaffOperation.size) {
                println("${i + 1}. ${containStaffOperation[i].getNameOfOperationInsidezzzz()}")
            }
            println("${containStaffOperation.size + 1}. Exit")
            println("Enter number to choose: ")
            val numChoose = readLine()?.toIntOrNull()
            if(numChoose != null) {
                if(numChoose in 1..3) {
                    if(numChoose == 1) {
                        while(true) {
                            println("Enter number of scientist: ")
                            val scientistEle = readLine()?.toIntOrNull()
                            if (scientistEle != null) {
                                for(i in 0 until scientistEle) {
                                    val scientistInside = Scientist()
                                    scientistInside.operation()
                                    storeStaff.add(scientistInside)
                                }
                                break
                            } else {
                                println("Wrong format, try again")
                                continue
                            }
                        }
                    } else if(numChoose == 2) {
                        while(true) {
                            println("Enter number of manager: ")
                            val numManager = readLine()?.toIntOrNull()
                            if(numManager != null) {
                                if(numManager > 0) {
                                    for(i in 0 until numManager) {
                                        val managerInside = Manager()
                                        managerInside.operation()
                                        storeStaff.add(managerInside)
                                    }
                                    break
                                }
                            } else {
                                println("Wrong format, try again")
                                continue
                            }
                        }
                    } else if(numChoose == 3) {
                        while(true) {
                            println("Enter number of staff: ")
                            val staffEle = readLine()?.toIntOrNull()
                            if (staffEle != null) {
                                if(staffEle > 0) {
                                    for (i in 0 until staffEle) {
                                        val staffInside = Staff()
                                        staffInside.operation()
                                        storeStaff.add(staffInside)
                                    }
                                    break
                                } else {
                                    println("the number can not small than 0")
                                    continue
                                }
                                break
                            } else {
                                println("Wrong format, try again")
                                continue
                            }
                        }
                    } else {
                        break
                    }
                } else {
                    println("The fun have 3, try again")
                    continue
                }
            } else {
                println("Wrong format, try again")
                continue
            }
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    fun caculateTheMoneyHavePay() : Double {
        return storeStaff.sumByDouble { it.calculateMoney()!!}
    }

    fun addOpe() {
        val staffSci = Scientist()
        val staffManager = Manager()
        val staff = Staff()
        containStaffOperation.add(staffSci)
        containStaffOperation.add(staffManager)
        containStaffOperation.add(staff)

    }
}