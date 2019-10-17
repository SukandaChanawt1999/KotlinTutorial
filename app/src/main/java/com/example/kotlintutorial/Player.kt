package com.example.kotlintutorial

import Loot
import Weapon

class Player(val name: String,var level: Int = 1, var lives: Int = 3, var score: Int = 0 ) {
    var weapon: Weapon = Weapon("Fist",1)
    val inventory = ArrayList<Loot>()

    fun show(){
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
            """)
    }

    fun showInventory(){
        println("$name's Inventory")
        println(inventory.get(0))
        println("==============================")
    }
}