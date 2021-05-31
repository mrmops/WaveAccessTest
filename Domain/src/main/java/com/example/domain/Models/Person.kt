package com.example.domain.Models

import java.time.ZonedDateTime
import java.util.*

data class Person(
    var id: Long? = null,
    var guid: UUID? = null,
    var isActive: Boolean = false,
    var name: String = "",
    var age: Int = -1,
    var eyeColor: EyeColor,
    var company: String? = null,
    var gender: Gender,
    var balance: String? = null,
    var email:String? = null,
    var phone: String? = null,
    var adress: String? = null,
    var about: String? = null,
    var registered: ZonedDateTime?,
    var latitude:Float = 0f,
    var longitude:Float = 0f,
    var favoriteFruit: String? = null,
    var friendIdS: List<Long>? = null,
    var tags: List<String>? = null,
) {
}