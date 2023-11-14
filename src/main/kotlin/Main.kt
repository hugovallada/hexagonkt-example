import com.hexagonkt.core.media.APPLICATION_JSON
import com.hexagonkt.core.media.TEXT_PLAIN
import com.hexagonkt.http.model.ContentType
import com.hexagonkt.http.server.HttpServer
import com.hexagonkt.http.server.jetty.serve

lateinit var server: HttpServer

fun main() {
    server = serve {
        get("/hello/{name}") {
            val name = pathParameters["name"]
            if (name.isNullOrBlank()) {
                badRequest("O nome não pode ser nulo", contentType = ContentType(TEXT_PLAIN))
            }
            name as String
            val user = User.builder()
                .name(name)
                .age(27)
                .build()
            val payload = user.toString()
            ok(payload, contentType = ContentType(APPLICATION_JSON))
        }
    }
}
