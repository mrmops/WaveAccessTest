package com.example.domain.Interfaces.Inner.Imp

import com.example.domain.Interfaces.Inner.PersonProvider
import com.example.domain.Interfaces.Outer.PersonRepository
import com.example.domain.Models.Person
import kotlinx.coroutines.flow.Flow

class PersonProviderImp(
    private val personRepository: PersonRepository
) : PersonProvider {

    override suspend fun getAllPersons(): Flow<List<Person>> = personRepository.getPersons()

    override suspend fun getPersonFriend(person: Person): Flow<List<Person>> =
        personRepository.getPersons(person.friendIdS ?: ArrayList())

    override suspend fun getPerson(id: Long): Flow<Person> = personRepository.getPerson(id)

    override suspend fun updatePersons() {
        personRepository.updatePersons()
    }
}