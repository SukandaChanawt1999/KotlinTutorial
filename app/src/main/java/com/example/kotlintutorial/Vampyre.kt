package com.example.kotlintutorial

open class Vampyre(name:String,hitPoints: Int = 20) : Enemy(name,hitPoints,3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}