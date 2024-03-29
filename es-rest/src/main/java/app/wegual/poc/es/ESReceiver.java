package app.wegual.poc.es;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import app.wegual.poc.common.model.ObjectCreate;

@Component
public class ESReceiver {

    @RabbitListener(queues = "spring-es")
    public void receiveObjectMessage(ObjectCreate oc) {
        System.out.println("ES Received object create message");
        System.out.println("name: " + oc.getName() + " creator: " + oc.getCreator());
    }
    
}
