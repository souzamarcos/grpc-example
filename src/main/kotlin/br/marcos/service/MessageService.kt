package br.marcos.service

import br.marcos.message.MessageRequest
import br.marcos.message.MessageResponse
import br.marcos.message.MessageServiceGrpcKt

class MessageService : MessageServiceGrpcKt.MessageServiceCoroutineImplBase() {
    override suspend fun sayHello(request: MessageRequest): MessageResponse = MessageResponse
        .newBuilder()
        .setMessage("Hello ${request.name}")
        .build()
}