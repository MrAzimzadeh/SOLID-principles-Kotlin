package refatored.srp

import refatored.srp.factory.NotificationFacade
import refatored.srp.factory.OrderFacade
import refatored.srp.manager.*

fun main() {
    val order = OrderFacade(InvoceGenerator(), ReminderManager(), SaveRepository());
    val notification = NotificationFacade(senderSMS(), SaveManager(), GeneralReportManager());
    notification.genrateReport("asdfg");
    notification.sendSMS("salam");
    notification.saveUUID(5);

}
