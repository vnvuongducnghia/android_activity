package com.example.androidactivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_f.*

class ActivityF : BaseActivity() {

    companion object {
        private const val TAG = "ActivityF"
    }

    override val classSimpleName: String
        get() = TAG

    override val activityTaskId: Int
        get() = taskId

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)

        btnStandard.setOnClickListener {
            startActivity(Intent(this, ActivityF::class.java))
        }

        btnSingleTop.setOnClickListener {
            startActivity(Intent(this, ActivityF::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            })
        }

    }
}