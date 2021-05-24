package com.mannanlive.ebay.collections

import com.mannanlive.ebay.collections.base.BaseSetBaseSet
import com.mannanlive.ebay.collections.base.BaseSetBaseSetShadowless
import com.mannanlive.ebay.collections.base.BaseSetFossil
import com.mannanlive.ebay.collections.base.BaseSetJungle
import com.mannanlive.ebay.collections.base.BaseSetTeamRocket
import com.mannanlive.ebay.collections.dp.DiamondPearlMajesticDawn
import com.mannanlive.ebay.collections.ecard.ECardSkyridge
import com.mannanlive.ebay.collections.sm.SunMoonGuardiansRisingBase
import com.mannanlive.ebay.collections.sm.SunMoonBase
import com.mannanlive.ebay.collections.sm.SunMoonBurningShadows
import com.mannanlive.ebay.collections.sm.SunMoonCelestialStorm
import com.mannanlive.ebay.collections.sm.SunMoonCosmicEclipse
import com.mannanlive.ebay.collections.sm.SunMoonCrimsonInvasion
import com.mannanlive.ebay.collections.sm.SunMoonDragonMajesty
import com.mannanlive.ebay.collections.sm.SunMoonForbiddenLight
import com.mannanlive.ebay.collections.sm.SunMoonHiddenFates
import com.mannanlive.ebay.collections.sm.SunMoonLostThunder
import com.mannanlive.ebay.collections.sm.SunMoonShiningLegends
import com.mannanlive.ebay.collections.sm.SunMoonTeamUp
import com.mannanlive.ebay.collections.sm.SunMoonUltraPrism
import com.mannanlive.ebay.collections.sm.SunMoonUnbrokenBonds
import com.mannanlive.ebay.collections.sm.SunMoonUnifiedMinds
import com.mannanlive.ebay.collections.swsh.SwordShieldBase
import com.mannanlive.ebay.collections.swsh.SwordShieldBattleStyles
import com.mannanlive.ebay.collections.swsh.SwordShieldChampionsPath
import com.mannanlive.ebay.collections.swsh.SwordShieldDarknessAblaze
import com.mannanlive.ebay.collections.swsh.SwordShieldRebelClash
import com.mannanlive.ebay.collections.swsh.SwordShieldShiningFates
import com.mannanlive.ebay.collections.swsh.SwordShieldVividVoltage

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
                collect(ECardSkyridge.collection)
                collect(DiamondPearlMajesticDawn.collection)
                collect(XyEvolutions.collection)
                collect(SunMoonBase.collection)
                collect(SunMoonGuardiansRisingBase.collection)
                collect(SunMoonBurningShadows.collection)
                collect(SunMoonShiningLegends.collection)
                collect(SunMoonCrimsonInvasion.collection)
                collect(SunMoonUltraPrism.collection)
                collect(SunMoonForbiddenLight.collection)
                collect(SunMoonCelestialStorm.collection)
                collect(SunMoonDragonMajesty.collection)
                collect(SunMoonLostThunder.collection)
                collect(SunMoonTeamUp.collection)
                collect(SunMoonUnbrokenBonds.collection)
                collect(SunMoonUnifiedMinds.collection)
                collect(SunMoonCosmicEclipse.collection)
                collect(SunMoonHiddenFates.collection)
                collect(SwordShieldBase.collection)
                collect(SwordShieldRebelClash.collection)
                collect(SwordShieldDarknessAblaze.collection)
                collect(SwordShieldRebelClash.collection)
                collect(SwordShieldChampionsPath.collection)
                collect(SwordShieldVividVoltage.collection)
                collect(SwordShieldShiningFates.collection)
                collect(SwordShieldBattleStyles.collection)
            }
        }
    }
}
