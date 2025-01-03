package com.plcoding.androidstorage

import android.os.Build


/**
 * Created by Abhinay on 03/01/25.
 *
 *
 */
inline fun <T> sdk29AndUp(onSdk29: () -> T): T? {
    return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        onSdk29()
    } else null
}