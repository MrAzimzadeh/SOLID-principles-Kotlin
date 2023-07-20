package refatored.srp

import refatored.ocp.managers.CarManager
import refatored.ocp.managers.ExternalManager
import refatored.ocp.service.DeliveryServices
import refatored.ocp.service.StoreService
import refatored.srp.factory.NotificationFacade
import refatored.srp.factory.OrderFacade
import refatored.srp.manager.*

fun main() {
    val order = OrderFacade(InvoceGenerator(), ReminderManager(), SaveRepository());

    val notification = NotificationFacade(SenderSMS(), SaveManager(), GeneralReportManager());

    notification.genrateReport("asdfg");
    notification.sendSMS("salam");
    notification.saveUUID(5);


    var storeService = StoreService()
    storeService.Store(ExternalManager())

    var delivery = DeliveryServices()

    delivery.Delivery(CarManager())

}
