package com.example.androidactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

abstract class BaseActivity : AppCompatActivity() {

    abstract val classSimpleName :String

    companion object{
        private const val TAG = "BaseActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "CREATED: $classSimpleName -- TASK ID: $taskId")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "DESTROYED: $classSimpleName -- TASK ID: $taskId")
    }
}