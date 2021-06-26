package com.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.afollestad.materialdialogs.utils.MDUtil.getStringArray
import com.tablayout.R
import com.tablayout.views.ArticleActivity
import com.tablayout.views.FragmentArticle

class TabNewsArticleAdapter(fragmentManager : FragmentManager, var activity: ArticleActivity) : FragmentStatePagerAdapter
    (fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    private val tabArticle = activity.getStringArray(R.array.tab_article)

    override fun getCount(): Int {
        return tabArticle.size
    }

    override fun getItem(position: Int): Fragment {
        return FragmentArticle(tabArticle[position])
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabArticle[position]
    }
}