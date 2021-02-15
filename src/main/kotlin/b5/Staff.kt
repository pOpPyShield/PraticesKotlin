package b5

import RunApplication.capitalizeFirstLetter

class Staff(override val name: String?="", override val yearOfBirth: Int?=0, override val degree: String?= "", salaryInMonth : Double? = 0.0) : ParentProperties{
    private var namez = name
    private var yearOfBirthz = yearOfBirth
    private var degreez = degree
    private var salaryInMonthz = salaryInMonth
    override fun input() : Int{
        while(true) {
            println("Staff area")
            while(true) {
                println("Enter name of staff: ")
                val name = readLine()?.capitalizeFirstLetter()
                if(name.isNullOrEmpty()) {
                    println("The name can not be empty or different format")
                    continue
                } else {
                    namez = name
                    break
                }
            }
            while(true) {
                println("Enter year of birth staff: ")
                val yearOfBirth = readLine()?.toIntOrNull()
                if(yearOfBirth != null) {
                    if(yearOfBirth > 0) {
                        yearOfBirthz = yearOfBirth
                        break
                    } else {
                        println("The year can not be small than 0")
                        continue
                    }
                } else {
                    println("The year in different format, try again")
                    continue
                }
            }
            while(true) {
                println("Enter degree of staff: ")
                val degree = readLine()?.capitalizeFirstLetter()
                if(degree.isNullOrEmpty()) {
                    println("The degree can not be empty or different format")
                    continue
                } else {
                    degreez = degree
                    break
                }
            }
            while(true) {
                println("Enter salary in month of staff: ")
                val salaryOfStaff = readLine()?.toDoubleOrNull()
                if(salaryOfStaff != null) {
                    if(salaryOfStaff > 0.0) {
                        salaryInMonthz = salaryOfStaff
                        break
                    } else {
                        println("The salary can not be small than 0")
                        continue
                    }
                } else {
                    println("The salary can not be in different format, try again")
                    continue
                }
            }
            break
        }
        return 1
    }

    override fun operation() {
        while(true) {
            if(input() == 1) {
                break
            }
        }
    }

    override fun calculateMoney(): Double? {
        return salaryInMonthz
    }

    override fun getNameOfOperationInsidezzzz() : String{
        return "Staff"
    }

}