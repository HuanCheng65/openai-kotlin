package com.aallam.openai.api.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class ChatReference(
    @SerialName("url")
    val url: String,

    @SerialName("logo_url")
    val logoUrl: String,

    @SerialName("title")
    val title: String,

    @SerialName("summary")
    val summary: String,

    @SerialName("publish_time")
    val publishTime: String,

    @SerialName("extra")
    val extra: ChatReferenceExtra,
)

@Serializable
public data class ChatReferenceExtra(
    @SerialName("rel_info")
    val relInfo: String,

    @SerialName("freshness_info")
    val freshnessInfo: String,

    @SerialName("auth_info")
    val authInfo: String,

    @SerialName("final_rel")
    val finalRef: String,
)
