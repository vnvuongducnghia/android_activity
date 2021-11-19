package com.example.androidactivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


const val EXTRA_MESSAGE = "MESSAGE"

class MainActivity : BaseActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override val classSimpleName: String
        get() = TAG

    override val activityTaskId: Int
        get() = taskId

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


}