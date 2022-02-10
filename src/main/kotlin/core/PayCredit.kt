package core

import `interface`.PaymentMethods

class PayCredit : PaymentMethods {
    override fun pay() {
        println("credit card payment!")
    }
}