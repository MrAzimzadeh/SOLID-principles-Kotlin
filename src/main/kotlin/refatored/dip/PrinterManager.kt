package refatored.dip

class PrinterManager(private val printer: Printer) {
    fun print(){
        printer.print()
    }
}