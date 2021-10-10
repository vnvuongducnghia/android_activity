package com.example.androidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_f.*

class ActivityF : BaseActivity() {

    companion object {
        private const val TAG = "ActivityF"
    }

    override val classSimpleName: String
        get() = TAG

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)

        backA.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }
    }
}