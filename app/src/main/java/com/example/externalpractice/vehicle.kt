package com.example.externalpractice

class vehicle (var v_Name:String, var v_milage:Double, var v_capacity: Int) {
    var v_Id:Int = 0
    constructor(v_Id:Int, v_Name: String,v_milage: Double,v_capacity:Int): this(v_Name, v_milage, v_capacity)
    {
        this.v_Id =v_Id
    }
}