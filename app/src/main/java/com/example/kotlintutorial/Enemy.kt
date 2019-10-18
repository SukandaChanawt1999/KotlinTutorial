package com.example.kotlintutorial

open class Enemy (val name: String, var hitPoints: Int, var lives: Int){
    fun takeDamage(damage: Int){
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0 ){
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        }else{
            lives -= 1
            if (lives >0 ){
                println("$name lost a lite")
            }else{
                println("No lives left, $name is dead")
            }

        }
    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }
}