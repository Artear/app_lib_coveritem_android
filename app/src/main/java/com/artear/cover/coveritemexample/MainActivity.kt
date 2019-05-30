package com.artear.cover.coveritemexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.artear.cover.coveritem.presentation.adapter.SpanContentAdapter
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {

    companion object {
        const val SPAN_SIZE = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val gridLayoutManager = GridLayoutManager(this, SPAN_SIZE)
        recyclerView.layoutManager = gridLayoutManager
        val adapter = SpanContentAdapter(SPAN_SIZE)
        recyclerView.adapter = adapter

        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return adapter.onSpanSizeRequired(position)
            }
        }
    }

}
