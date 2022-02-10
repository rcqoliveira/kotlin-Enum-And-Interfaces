package enum

import `interface`.PaymentMethods
import core.PayCredit
import core.PayInCash
import core.PayTicket

enum class PaymentTypes(var description: String = "") : PaymentMethods {
    Credit("PayCredit") {
        override fun pay() = PayCredit().pay()
    }, Ticket ("PayTicket") {
        override fun pay() = PayTicket().pay()
    }, InCash ("PayInCash") {
        override fun pay() = PayInCash().pay()
    }
}