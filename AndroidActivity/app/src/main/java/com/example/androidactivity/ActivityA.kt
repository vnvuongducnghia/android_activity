package com.example.androidactivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : BaseActivity() {

    companion object {
        private const val TAG = "ActivityA"
    }

    override val classSimpleName: String
        get() = TAG

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        openB.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }

        // Take message Main Activity
        val messageA = intent.getStringExtra(EXTRA_MESSAGE)
        txtMessage.text = messageA

    }
}