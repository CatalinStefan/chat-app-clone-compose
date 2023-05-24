package com.example.whatsapptest.data

data class UserData(
    val userId: String? = "",
    val name: String? = "",
    val imageUrl: String? = "",
    val number: String? = "",
    val status: String? = "",
    val statusImg: String? = "",
    val contacts: List<String>? = listOf()
) {
    fun toMap() = mapOf(
        "userId" to userId,
        "name" to name,
        "imageUrl" to imageUrl,
        "number" to number,
        "status" to status,
        "statusImg" to statusImg,
        "contacts" to contacts
    )
}

data class ChatData(
    val chatId: String? = "",
    val user1: ChatUser = ChatUser(),
    val user2: ChatUser = ChatUser()
)

data class ChatUser(
    val userId: String? = "",
    val name: String? = "",
    val imageUrl: String? = "",
    val number: String? = ""
)

data class Message(
    val sentBy: String? = null,
    val message: String? = null,
    val timestamp: String? = null
)

data class Status(
    val user: ChatUser? = null,
    val imageUrl: String? = null,
    val timestamp: Long? = null
)