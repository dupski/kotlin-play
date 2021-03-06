
package org.revcrm.server

import io.ktor.http.content.defaultResource
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.routing.Routing

fun Routing.graphiQL() {
    static("graphiql") {
        resources("/graphiql")
        defaultResource("/graphiql/index.html")
    }
}
