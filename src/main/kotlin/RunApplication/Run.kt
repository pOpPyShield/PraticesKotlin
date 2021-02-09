package RunApplication
import b1b2b3.b1
import b1b2b3.b2
import b1b2b3.b3
import b6.HandleService
import b6.Service
fun main() {
    var zz = Service()
    var z1 = Service()
    var pp = HandleService()
    zz.operation()
    z1.operation()
    pp.addService(zz)
    pp.addService(z1)
    pp.printService()
}