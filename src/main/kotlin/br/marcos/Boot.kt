package br.marcos

import br.marcos.server.Server

class Boot {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val port = 8080
            val server = Server(port)
            server.start()
            server.blockUntilShutdown()
        }
    }
}
