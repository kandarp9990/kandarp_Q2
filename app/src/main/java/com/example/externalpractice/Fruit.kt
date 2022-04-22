package com.example.externalpractice

class Fruit (var fname:String, var price:Double, var quantity: Int) {
    var Id:Int = 0
    constructor(Id:Int, fname: String,price: Double,quantity: Int): this(fname, price, quantity)
    {
        this.Id =Id
    }
}