package pro.thomassen.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import pro.thomassen.models.Article

val articleStorage = mutableListOf<Article>(
    Article("1", "Foo", "https://foo.com"),
    Article("2", "Bar", "https://bar.baz"),
)

fun Route.articleRouting() {
    route("/article") {
        get {
            call.respond(articleStorage)
        }
    }
}
