package com.example.androidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : BaseActivity() {

    companion object {
        private const val TAG = "ActivityB"
    }

    override val classSimpleName: String
        get() = TAG

    override val activityTaskId: Int
        get() = taskId

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        openC.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: taskID $taskId")
    }
}