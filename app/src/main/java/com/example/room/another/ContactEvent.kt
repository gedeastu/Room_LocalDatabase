package com.example.room.another

sealed interface ContactEvent {

    //Event with State
    object SaveContact : ContactEvent
    object ShowDialog : ContactEvent
    object HideDialog : ContactEvent

    //Event with Database
    data class SetFirstName(val firstName: String) : ContactEvent
    data class SetLastName(val lastName: String) : ContactEvent
    data class SetPhoneNumber(val phoneNumber: String) : ContactEvent
    data class SortContacts(val sortType : SortType) : ContactEvent
    data class DeleteContact(val contact: Contact) : ContactEvent
}