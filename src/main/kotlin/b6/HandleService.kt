package b6

import NameOfOperation.NameOfOperation

open class HandleService(serviceListPara : MutableList<Service>) : NameOfOperation("List of service") {
    private var serviceList : MutableList<Service> = serviceListPara
    constructor() : this(mutableListOf<Service>())
    fun seeService(index : Int) {
        for(i in 0 until serviceList.size) {
            if(index - 1 == i) {
                serviceList[i].informationOfService()
            }
        }
    }
    fun getServiceList() : MutableList<Service> {
        return serviceList
    }
    fun addService(svAdd : Service) {
        serviceList.add(svAdd)
    }

    private fun delService(svDel : Service) {
        serviceList.remove(svDel)
    }
    fun sizeOfService() : Int {
        return serviceList.size
    }
    fun printService() {
        serviceList.forEachIndexed { index, service -> println("${index + 1}. ${service.getNameService()} have price ${service.getMoneyService()} and have amount ${service.getAmountService()}") }
    }

    fun chooseService() : Int {
        var choosing : Int?
        var numEle : Int = -1
        outLoop@while(true) {
            println("Enter number you want to choose: ")
            choosing = readLine()?.toIntOrNull()
            if (choosing != null) {
                if(choosing > 0 && choosing < serviceList.size) {
                    for (i in 0 until serviceList.size) {
                        if (choosing-1 == i) {
                            if (serviceList[i].updateAmountService(1) == 1) {
                                println("Choosing success")
                                numEle = i
                                break@outLoop
                            } else {
                                println("number not in range")
                                break@outLoop
                            }
                        }
                    }
                } else {
                    println("The number is greater than 0 and must be in range of service list")
                    continue@outLoop
                }
            } else {
                println("The number is wrong format, try again")
                continue@outLoop
            }
            break@outLoop
        }
        return if(numEle > -1) {
            numEle
        } else {
            numEle
        }
    }
}