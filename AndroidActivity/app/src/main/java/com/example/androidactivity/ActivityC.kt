package com.example.androidactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : BaseActivity() {

    companion object {
        private const val TAG = "ActivityC"
    }

    override val classSimpleName: String
        get() = TAG

    override val activityTaskId: Int
        get() = taskId

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        openD.setOnClickListener {
            startActivity(Intent(this, ActivityD::class.java))
        }
    }
}