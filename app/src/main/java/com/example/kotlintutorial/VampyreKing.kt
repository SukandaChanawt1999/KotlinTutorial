package com.example.kotlintutorial

class VampyreKing(name: String) : Vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}