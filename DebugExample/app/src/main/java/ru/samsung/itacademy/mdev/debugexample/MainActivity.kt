package ru.samsung.itacademy.mdev.debugexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "Creating view..")
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "View created!")
        Log.v(LOG_TAG, "Matrix: \n" + createMatrix(5, 5)?.let { matrixToString(it) });
    }

    fun createMatrix(n: Int, m: Int): Array<IntArray>? {
        val array = Array(n) { IntArray(m) }
        for (i in array.indices) {
            for (j in array[i].indices) {
                array[i][j] = (Math.random() * 10).toInt()
            }
        }
        return array
    }

    fun matrixToString(array: Array<IntArray>): String? {
        var result = ""
        for (i in array.indices) {
            for (element in array[i]) {
                result += "$element "
            }
            result += "\n"
        }
        return result
    }
}