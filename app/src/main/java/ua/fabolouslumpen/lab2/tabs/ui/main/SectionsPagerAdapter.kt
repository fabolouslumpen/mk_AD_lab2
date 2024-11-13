package ua.fabolouslumpen.lab2.tabs.ui.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import ua.fabolouslumpen.lab2.tabs.BlankFragment
import ua.fabolouslumpen.lab2.tabs.GoToHomeFragment
import ua.fabolouslumpen.lab2.tabs.TabsActivity

class SectionsPagerAdapter(activity: TabsActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0, 1 -> BlankFragment()
            2 -> GoToHomeFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}