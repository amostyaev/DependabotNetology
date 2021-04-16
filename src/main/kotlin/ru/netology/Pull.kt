package ru.netology

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pull(
    @SerialName("user")
    val user: User,
    @SerialName("issue_url")
    val issueUrl: String,
)