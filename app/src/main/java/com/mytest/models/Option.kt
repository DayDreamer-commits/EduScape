package com.mytest.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger

@Entity
data class Option(
        @PrimaryKey(autoGenerate = true)
        val optionId:BigInteger,
        var question: Question,
        val optionA:String,
        val optionB:String,
        val optionC:String,
        val optionD:String) {
}