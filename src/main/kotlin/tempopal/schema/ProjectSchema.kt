package tempopal.schema

import kotlinx.serialization.Serializable
import java.sql.Connection

@Serializable
data class Project(
    val projectId: Int,
    val tagId: Int,
    val userId: Int,
    val projectName: String,
    val projectTrackedSeconds: Double,
)

class ProjectService(private val connection: Connection) {

    companion object {
        // TODO put queries strings here.
    }

    init {
        // TODO setup table here.
    }

}
