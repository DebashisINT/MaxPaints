package com.breezefieldsalesmaxpaints.features.marketAssist

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.breezefieldsalesmaxpaints.CustomStatic
import com.breezefieldsalesmaxpaints.features.orderhistory.model.ActionFeed
import com.breezefieldsalesmaxpaints.features.performanceAPP.OwnPerformanceFragment
import com.breezefieldsalesmaxpaints.features.performanceAPP.TeamPerformanceFragment

class MATabPagerAdapter (fm: FragmentManager?) : FragmentStatePagerAdapter(fm!!), ActionFeed {
    override fun refresh() {
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return ShopListMarketAssistFrag()
        } else if (position == 1) {
            return ChurnProbFrag()
        } else {
            return Fragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }
}