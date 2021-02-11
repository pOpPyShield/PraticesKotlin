package b6

import NameOfOperation.NameOfOperation
import operationAndInput.OperationAndInput

class Customer(nameOfCustomer : String?,
               ageOfCustomer : Int?,
               homeTown : String?,
               listOfServiceCustomer : MutableList<Service>,
               listOfServiceServer : MutableList<Service>
               ) :
    NameOfOperation("Enter information for customer"), OperationAndInput {

        private var nameOfCustomerInside = nameOfCustomer
        private var ageOfCustomerInside = ageOfCustomer
        private var homeTownOfCustomer = homeTown
        private var listOfServiceOfCustomer1 = HandleService(listOfServiceCustomer)
        private var listOfServiceOfCustomer = HandleService(listOfServiceServer)
        //Constructor no para
        constructor() : this("", 0,"", mutableListOf(), mutableListOf())
    override fun operation() {
            println(nameOfOperationInside)
            if(input() == 1) {
                informationOfCustomer()
            }
        while(true) {
            println("type q to quit")
            val quitChoose = readLine()?.toUpperCase()?.trim()
            if(quitChoose.isNullOrEmpty() || quitChoose == "Q") {
                break
            } else {
                println("Wrong format")
                continue
            }
        }
    }
    override fun input() : Int {
        var nameOfCustomerInsideInputFun : String?
        var ageOfCustomerInsideInputFun : Int?
        var homeTownOfCustomerInsideInputFun : String?
        outLoop@while(true) {
            nameOfCustomer@while(true) {
                println("Enter name of customer: ")
                nameOfCustomerInsideInputFun = readLine()?.capitalizeFirstLetter()
                if (nameOfCustomerInsideInputFun.isNullOrEmpty()) {
                    println("The name can not be null or empty, try again")
                    continue@nameOfCustomer
                } else {
                    nameOfCustomerInside = nameOfCustomerInsideInputFun
                    break@nameOfCustomer
                }
            }
            ageOfCustomer@while(true){
                println("Enter age of customer: ")
                ageOfCustomerInsideInputFun = readLine()?.toIntOrNull()
                if(ageOfCustomerInsideInputFun == null || ageOfCustomerInsideInputFun < 0 || ageOfCustomerInsideInputFun == 0) {
                    println("The age is not valid")
                    continue@ageOfCustomer
                } else {
                    ageOfCustomerInside = ageOfCustomerInsideInputFun
                    break@ageOfCustomer
                }
            }
            homeTown@while(true) {
                println("Enter hometown of customer: ")
                homeTownOfCustomerInsideInputFun = readLine()?.capitalizeFirstLetter()
                if(homeTownOfCustomerInsideInputFun.isNullOrEmpty()) {
                    println("The hometown is not valid, try again")
                    continue@homeTown
                } else {
                    homeTownOfCustomer = homeTownOfCustomerInsideInputFun
                    break@homeTown
                }
            }
            chooseServiceForCustomer@while(true) {
                println("All of service")
                var inpSeeDetail : Int?
                var quest : String?
                var choosing : Int?
                seeDetailService@while(true) {
                    if (listOfServiceOfCustomer.sizeOfService() > 0) {
                        seeDetailService2@while(true) {
                            listOfServiceOfCustomer.printService()
                            println("Enter number to see detail: ")
                            inpSeeDetail = readLine()?.toIntOrNull()
                            if (inpSeeDetail == null || inpSeeDetail < 0 || inpSeeDetail > listOfServiceOfCustomer.sizeOfService()) {
                                println("Some thing wrong, try again")
                                continue@seeDetailService
                            } else {
                                listOfServiceOfCustomer.seeService(inpSeeDetail)
                                println("Do you want to see again or out? y(yes) to continue, n(no) for quit")
                                quest = readLine()?.toUpperCase()?.trim()
                                if (quest.isNullOrEmpty() || quest == "N" || quest == "NO") {
                                    println("Out of see detail")
                                    break@seeDetailService2
                                } else continue@seeDetailService2
                            }
                        }
                        choosingService@while(true) {
                            listOfServiceOfCustomer.printService()
                            println("Enter the service you choose: ")
                            choosing = readLine()?.toIntOrNull()
                            if (choosing == null || choosing < 0 || choosing > listOfServiceOfCustomer.sizeOfService()) {
                                println("Oops, so-me problem occurred")
                                continue@choosingService
                            } else {
                                var isSuccess = false
                                loopChoosing@for(i in 0 until listOfServiceOfCustomer.sizeOfService()) {
                                    if(choosing - 1 == i) {
                                        if(listOfServiceOfCustomer.getServiceList()[i].updateAmountService(1) == 1 ) {
                                            println("Choosing success")
                                            listOfServiceOfCustomer1.addService(listOfServiceOfCustomer.getServiceList()[i])
                                            isSuccess = true
                                            break@loopChoosing
                                        } else {
                                            println("Choosing fail, not enough amount, choose another service")
                                            break@loopChoosing
                                        }
                                    }
                                }
                                if(isSuccess) {
                                    if(listOfServiceOfCustomer1.sizeOfService() == 0) {
                                        println("Oops don't have any service in your list")
                                        println("Do you want to choose or quit? y(yes) to continue, or n(no) for quit")
                                        val choosingAgain = readLine()?.toUpperCase()?.trim()
                                        if(choosingAgain == "Y" || choosingAgain == "YES") {
                                            continue@choosingService
                                        } else {
                                            println("Thanks for visiting")
                                            break@choosingService
                                        }
                                    } else {
                                        println("You have choose service: ")
                                        listOfServiceOfCustomer1.getServiceList().forEachIndexed { index, service -> println("${index + 1}. ${service.getNameService()} have money ${service.getMoneyService()}") }
                                        println("Calculate the money in your list service you have choose")
                                        println("The sum: ${calculateSumOfMoney()}")
                                    }
                                } else {
                                    continue@choosingService
                                }
                            }
                        }
                    } else {
                        println("Don't have anything here")
                        break@chooseServiceForCustomer
                    }
                }
            }
            break@outLoop
        }
        return 1
    }

    override fun getNameOfOperationInsidezzzz(): String {
        return nameOfOperationInside
    }

    private fun String.capitalizeFirstLetter() = this.split(" ").joinToString(" ") {it.capitalize()}.trimEnd()
    fun calculateSumOfMoney() : Double {
        var doubleCal = 0.0
        for(i in 0 until listOfServiceOfCustomer1.sizeOfService()) {
            doubleCal += listOfServiceOfCustomer1.getServiceList()[i].getMoneyService()!!
        }
        return doubleCal
    }
    private fun informationOfCustomer() {
        println("Name customer: $nameOfCustomerInside")
        println("Age customer: $ageOfCustomerInside")
        println("hometown customer: $homeTownOfCustomer")
    }
    fun getService() {
        if(listOfServiceOfCustomer1.sizeOfService() > 0) {
            for(i in 0 until listOfServiceOfCustomer1.sizeOfService()) {
                println("Service ${i+1}")
                listOfServiceOfCustomer1.seeService2(i)
            }
        } else {
            println("Don't have any service here")
        }
    }
    fun getNameCustomer() : String? {
        return nameOfCustomerInside
    }

    fun getAgeOfCustomerInside() : Int? {
        return ageOfCustomerInside
    }

    fun getHomeTownCustomer() : String? {
        return homeTownOfCustomer
    }
}