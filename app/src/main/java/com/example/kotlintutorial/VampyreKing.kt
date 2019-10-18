package com.example.kotlintutorial

class VampyreKing(name: String) : Vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean{
        if (lives < 2){
            return true;
        }else{
            return false;
        }
    }
}