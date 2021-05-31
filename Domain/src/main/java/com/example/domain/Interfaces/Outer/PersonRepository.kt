package com.example.domain.Interfaces.Outer

import com.example.domain.Models.Person
import kotlinx.coroutines.flow.Flow

interface PersonRepository {

    suspend fun getPersons(): Flow<List<Person>>

    suspend fun getPersons(ids: List<Long>): Flow<List<Person>>

    suspend fun getPerson(id:Long):  Flow<Person>

    suspend fun updatePersons()
}