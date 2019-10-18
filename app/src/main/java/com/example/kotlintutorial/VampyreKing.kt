package com.example.kotlintutorial

import kotlin.random.Random
import kotlin.random.Random as Random1

class VampyreKing(name: String) : Vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean{
        return lives < 2
    }

    fun dodges(): Boolean{
        val rand = java.util.Random()
        val chance = rand.nextInt(6)
        if (chance > 3){
            println("Dracula dodges")
            return true
        }
        return false
    }
}