package com.example.domain.Interfaces.Inner

import com.example.domain.Models.Person
import kotlinx.coroutines.flow.Flow

interface PersonProvider {
    suspend fun getAllPersons(): Flow<List<Person>>

    suspend fun getPersonFriend(person: Person): Flow<List<Person>>

    suspend fun getPerson(id: Long): Flow<Person>

    suspend fun updatePersons()
}