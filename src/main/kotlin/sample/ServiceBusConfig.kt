package sample

import com.azure.spring.cloud.service.servicebus.properties.ServiceBusEntityType
import com.azure.spring.messaging.servicebus.core.ServiceBusTemplate
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@Configuration
class ServiceBusConfig(
    private val serviceBusTemplate: ServiceBusTemplate
) {
    private val logger: Log = LogFactory.getLog(javaClass)

    @PostConstruct
    fun postConstruct() {
        logger.info("set defaultEntityType of ServiceBusTemplate.")
        serviceBusTemplate.setDefaultEntityType(ServiceBusEntityType.QUEUE)
        // serviceBusTemplate.setDefaultEntityType(ServiceBusEntityType.TOPIC)
    }
}
