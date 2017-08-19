package com.example.junmorita.customviewsample

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 * Created by junmorita on 2017/08/19.
 */
class CustomView: LinearLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_main, this)
        message_textview.text = "This is CustomView…"
    }

}