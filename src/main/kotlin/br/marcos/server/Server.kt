package br.marcos.server

import br.marcos.service.MessageService
import io.grpc.Server
import io.grpc.ServerBuilder

class Server(val port: Int) {
    val server: Server = ServerBuilder
        .forPort(port)
        .addService(MessageService())
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@Server.stop()
                println("*** server shut down")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }
}