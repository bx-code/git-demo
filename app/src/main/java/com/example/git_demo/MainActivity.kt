package com.example.git_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mhandler : Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_one.animate()
            .translationX(200f)
            .translationY(100f)
            .scaleX(2f)
            .start()
        Thread{
            Thread.sleep(2000)
            mhandler.post {
                tv_one.setText("小白糖")
            }
        }.start()
    }

}