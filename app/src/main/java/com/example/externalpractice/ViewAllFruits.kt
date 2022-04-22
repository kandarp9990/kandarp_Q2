package com.example.externalpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_all_fruits.*

class ViewAllFruits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_fruits)

        var arr = ArrayList<Fruit>()
        var db = DBHelper(this)

        arr = db.GetAllFruits()
        var adapt = FruitAdapter(this,arr)

        MyRecycleOP.adapter = adapt
    }
}