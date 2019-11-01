package com.mytest.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger

@Entity
data class Question(
        @PrimaryKey(autoGenerate = true)
        val questionId : BigInteger,
        val questionType:Int,
        val questionBody:String,
        val option:Option) {
}