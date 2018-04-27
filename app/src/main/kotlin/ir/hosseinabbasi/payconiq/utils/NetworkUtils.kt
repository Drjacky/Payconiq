package ir.hosseinabbasi.payconiq.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Dr.jacky on 2018/04/27.
 */
class NetworkUtils {

    companion object {
        fun isNetworkConnected(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting
        }
    }
}