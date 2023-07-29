package tempopal.schema

data class Tag(
    val userId: Int,
    val tagId: Int,
    val tagName: String,
    val childrenTrackedItems: List<Int>
)
