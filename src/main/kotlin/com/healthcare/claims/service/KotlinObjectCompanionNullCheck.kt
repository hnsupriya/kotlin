package com.healthcare.claims.service

class KotlinObjectCompanionNullCheck {

        fun addTwoIntegers(a: Int, b: Int): Int {
            return a + b;
        }
        companion object { // static
            val stateTax: Double = 2.1 // java ==public static final double stateTax = 2.1;
            fun greetings(): String {
                return "hi how are you";
            }
        }
    }

//    fun main() {
//        val tax = KotlinObjectCompanionNullCheck.stateTax
//        println(tax)// companion  constant === static
//        val greetings = KotlinObjectCompanionNullCheck.greetings()
//        println(greetings) // companion function === static
//
//        var obj = KotlinObjectCompanionNullCheck()// default constructor
//        println(obj.addTwoIntegers(10,12))
//    }
