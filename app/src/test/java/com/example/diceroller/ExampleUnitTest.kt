package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun generates_number() {
        //create a new dice object with 6 sides
        val dice = Dice(6)
        //create a variable to hold the result of the roll
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}