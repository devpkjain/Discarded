package com.pkjain.demo.utils

import android.content.res.Resources
import android.support.annotation.RawRes
import com.pkjain.demo.model.FareInfo

/**
 *
 */
fun Resources.loadFareInfo(@RawRes resId: Int): FareInfo {
    val jsonSource = openRawResource(resId).bufferedReader().use { it.readText() }
    return ObjectMapperFactory.create().readValue(jsonSource, FareInfo::class.java)
}
