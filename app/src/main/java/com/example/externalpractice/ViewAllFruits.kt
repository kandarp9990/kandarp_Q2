package com.example.externalpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_all_fruits.*

class ViewAllFruits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_fruits)
        RefreshRecycler()
    }
    fun RefreshRecycler()
    {
        var arr = ArrayList<Fruit>()
        var db = DBHelper(this)
        arr = db.GetAllFruits()
        var adapt = FruitAdapter(this,arr)
        MyRecycleOP.adapter = adapt
    }
    fun Update(position:Int)
    {

    }
    fun Delete(position:Int)
    {
        Toast.makeText(applicationContext,"im here", Toast.LENGTH_LONG).show()
        var db=DBHelper(this)
        var arr:ArrayList<Fruit> = db.GetAllFruits()
        var fruit=arr.get(position)
        Toast.makeText(applicationContext,"${fruit.F_Id}", Toast.LENGTH_LONG).show()
        db.Delete(fruit.F_Id)
        RefreshRecycler()
    }
}