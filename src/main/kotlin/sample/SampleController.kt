package sample

import com.azure.spring.messaging.servicebus.core.ServiceBusTemplate
import org.springframework.integration.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val serviceBusTemplate: ServiceBusTemplate
) {
    @GetMapping("/queue")
    fun queue() {
        val message = MessageBuilder
            .withPayload("Hello, Service Bus Queue")
            .build()
        serviceBusTemplate.sendAsync("sample-queue", message).block()
    }

    @GetMapping("/topic")
    fun topic() {
        val message = MessageBuilder
            .withPayload("Hello, Service Bus Topic")
            .build()
        serviceBusTemplate.sendAsync("sample-topic", message).block()
    }
}
