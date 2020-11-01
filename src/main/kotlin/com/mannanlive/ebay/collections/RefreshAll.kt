package com.mannanlive.ebay.collections

import com.mannanlive.ebay.collections.base.BaseSetBaseSet
import com.mannanlive.ebay.collections.base.BaseSetBaseSetShadowless
import com.mannanlive.ebay.collections.base.BaseSetFossil
import com.mannanlive.ebay.collections.base.BaseSetJungle
import com.mannanlive.ebay.collections.base.BaseSetTeamRocket

class RefreshAll {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().run {
                collect(BaseSetBaseSet.collection)
                collect(BaseSetBaseSetShadowless.collection)
                collect(BaseSetFossil.collection)
                collect(BaseSetJungle.collection)
                collect(BaseSetTeamRocket.collection)
                collect(XyEvolutions.collection)
                collect(SunMoonCosmicEclipse.collection)
                collect(SunMoonHiddenFates.collection)
                collect(SwordShieldBase.collection)
                collect(SwordShieldRebelClash.collection)
                collect(SwordShieldDarknessAblaze.collection)
                collect(SwordShieldRebelClash.collection)
                collect(SwordShieldChampionsPath.collection)
                collect(SwordShieldVividVoltage.collection)
            }
        }
    }
}
