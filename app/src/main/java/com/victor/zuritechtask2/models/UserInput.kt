package com.victor.zuritechtask2.models

import java.io.Serializable

@kotlinx.serialization.Serializable
data class UserInput(
    val firstName:String,
    val lastName:String,
    val userName:String,
    val email:String,
    val sex:String,
    val phoneNumber:String
){

}
