package smells.ocp

import kotlin.reflect.typeOf

enum class StoredManagement {
    SD_INTERNAL,
    EXTERNAL,
    SD
}


fun main (){
    val ocp = OCPViolated()
    ocp.saveNotes(StoredManagement.SD)
}
class OCPViolated {
    fun saveNotes(type : StoredManagement){
        when(type)
        {
            StoredManagement.SD_INTERNAL -> {
                saveInternal()
            }
            StoredManagement.EXTERNAL -> {
                saveEternal()
            }
            StoredManagement.SD -> {
                saveSD()
            }
        }
    }
    private fun   saveInternal()
    {

    }

    private fun saveEternal()
    {

    }
    private fun saveSD()
    {

    }
}