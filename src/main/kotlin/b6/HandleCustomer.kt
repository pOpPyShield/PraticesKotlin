package b6

class HandleCustomer {
    private var arrCustomer : MutableList<Customer> = mutableListOf()

    fun addCustomer(CM : Customer) {
        arrCustomer.add(CM)
    }
    fun getArrCustomer() : MutableList<Customer> {
        return arrCustomer
    }
    fun informationOfCustomerArr() : Int{
        return if(arrCustomer.size > 0) {
            for (i in 0 until arrCustomer.size) {
                println("${i + 1}. ${arrCustomer[i].getNameCustomer()}")
                println("-> Age: ${arrCustomer[i].getAgeOfCustomerInside()}")
                println("-> HomeTown: ${arrCustomer[i].getHomeTownCustomer()}")
                arrCustomer[i].getService()
            }
            0
        } else {
            println("Don't have any customer here")
            1
        }
    }
    fun findCustomerByName(nameCustomer : String) : Boolean {
        var isIn = false
        for(i in 0 until arrCustomer.size) {
            if(arrCustomer[i].getNameCustomer() == nameCustomer) {
                println("Have customer here")
                println("${arrCustomer[i].getNameCustomer()}")
                println("${arrCustomer[i].getAgeOfCustomerInside()}")
                println("${arrCustomer[i].getHomeTownCustomer()}")
                isIn = true
                break
            }
        }
        return isIn
    }
    fun getSize() : Int {
        return arrCustomer.size
    }
}