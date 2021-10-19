package com.example.androidactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity




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

        openA.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }

        sendMessageA.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java).apply {
                putExtra(EXTRA_MESSAGE, "Xin chao activity A")
            })
        }

        openThis.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


}