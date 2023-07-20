package refatored.srp.factory

import refatored.srp.manager.InvoceGenerator
import refatored.srp.manager.ReminderManager
import refatored.srp.manager.SaveRepository

class OrderFacade(
    private  val InvoiceGGenerator : InvoceGenerator,
    private  val reminderManager: ReminderManager,
    private  val orderRepository: SaveRepository,

    ){
    fun save()
    {
        orderRepository.save()
    }

    fun reminder()
    {
        reminderManager.sendReminder()
    }
    fun generateInvoice()
    {
        InvoiceGGenerator.generateInvoice()
    }
}
