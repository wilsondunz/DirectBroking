package nz.co.seclib.dbroker.utils

import android.app.Application
import nz.co.seclib.dbroker.data.DirectBrokingWeb
import nz.co.seclib.dbroker.data.model.StockMarketInfo

class MyApplication : Application() {
    companion object {
        var instance: MyApplication = MyApplication.instance
        //var stockCharLink = mutableMapOf<String,String>()
        //val dbWeb = DirectBrokingWeb()
        val stockMarketInfo = StockMarketInfo()
    }

    init {
        instance = this
    }

}