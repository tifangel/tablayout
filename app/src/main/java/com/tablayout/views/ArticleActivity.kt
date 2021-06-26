package com.tablayout.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tablayout.R
import com.tablayout.adapters.TabNewsArticleAdapter
import com.tablayout.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_article)
        binding.lifecycleOwner = this

        setupToolbar()
        setupTabLayout()
    }

    private fun setupTabLayout() {
        binding.vpArticle.adapter = TabNewsArticleAdapter(supportFragmentManager, this)
        binding.tlArticle.setupWithViewPager(binding.vpArticle)
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.tbArticleNews)
        supportActionBar?.title = getString(R.string.news)
    }
}