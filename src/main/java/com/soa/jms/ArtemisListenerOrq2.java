package com.soa.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import com.soa.business.PeliculasBusiness;
import com.soa.dto.RespuestaDatosTiempo;
import com.soa.dto.RespuestaValidacionPelicula;

/*
 * Class for receiving message in an artemis queue.
 */
@Component
public class ArtemisListenerOrq2 {

    @Autowired
    private PeliculasBusiness business;

    @Autowired
    private JmsSender sender;

    /** Nombre de la cola de respuesta del microservicio. */
    @Value("${queue.cobroTotal.in}")
    private String outQueueName;

    /* Nombre de la cola de respuesta del microservicio */
    @Value("${queue.fail.out}")
    private String outQueueFail;

    @JmsListener(destination = "${queue.cobro.in}")
    public void receive(String message) {
        Gson gson = new Gson();
        RespuestaValidacionPelicula datos = gson.fromJson(message, RespuestaValidacionPelicula.class);
        // Validar que exista la pelicula recibiendo el json init
        RespuestaDatosTiempo respuesta = business.validacionTiempo(datos);
        try {
            if ("Error en BD al consultar la duracion de la pelicula".equals(respuesta.getMessage())) {
                System.out.println(String.format("Fail Orq2: %s", respuesta.toString()));
                sender.sendMessage(respuesta.toString(), outQueueFail);
            } else {
                sender.sendMessage(respuesta.toString(), outQueueName);
                System.out.println(String.format("Mensaje enviado Orq2: %s", respuesta.toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
