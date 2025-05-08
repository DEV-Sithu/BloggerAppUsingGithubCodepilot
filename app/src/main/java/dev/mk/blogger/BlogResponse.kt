package dev.mk.blogger

data class BlogResponse(
    val items: List<BlogPost>?,
    val nextPageToken: String?,
    val kind: String?
)