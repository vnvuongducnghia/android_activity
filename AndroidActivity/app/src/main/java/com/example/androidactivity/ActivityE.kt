package com.example.androidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*
import kotlinx.android.synthetic.main.activity_b.openC
import kotlinx.android.synthetic.main.activity_e.*

class ActivityE : BaseActivity() {

    companion object {
        private const val TAG = "ActivityE"
    }

    override val classSimpleName: String
        get() = TAG

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)

        openF.setOnClickListener {
            startActivity(Intent(this, ActivityF::class.java))
        }
    }
}