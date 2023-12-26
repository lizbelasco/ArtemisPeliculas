/**
 * 
 */
package com.soa.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

/**
 * Clase para enviar mensajes Jms
 */
@Component
public class JmsSender {
    @Autowired /* Creado por starter artemis con las propiedades de la app */
    JmsTemplate jmsTemplate;
    
    /**
     * Envia un mensaje jms a la cola.
     * @param message Mensaje a enviar.
     * @param queueName Nombre de la cola destino.
     */
    public void sendMessage(String message, String queueName) {
        this.jmsTemplate.send(queueName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                // TODO Auto-generated method stub
                return session.createTextMessage(message);
            }
        });
    }
}
