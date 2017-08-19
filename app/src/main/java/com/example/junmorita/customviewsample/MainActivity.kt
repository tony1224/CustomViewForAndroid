package com.example.junmorita.customviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // カスタムViewを遅延処理を用いて宣言します。
    private val selfView by lazy { CustomView(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(selfView)

    }
}
