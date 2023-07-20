package refatored.srp.factory

import refatored.srp.manager.*

class NotificationFacade(
    private  val smsSennder : senderSMS,
    private  val saveManager :  SaveManager ,
    private  val report: GeneralReportManager
) {
    fun sendSMS(message : String) {
       smsSennder.sendSMS(message)
    }

    fun saveUUID(id:Int) {
        saveManager.saveUUID(id)
    }

    fun genrateReport(txt : String) {
        report.genrateReport(txt)
    }
}