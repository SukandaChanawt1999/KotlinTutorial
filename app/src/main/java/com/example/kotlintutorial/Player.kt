package com.example.kotlintutorial

class Player(val name: String,var level: Int = 1, var lives: Int = 3, var score: Int = 0 ) {


    fun show(){
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            """)
    }
}