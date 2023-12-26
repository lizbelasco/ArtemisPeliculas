/**
 * 
 */
package com.soa.dto;

import java.util.List;

import com.google.gson.Gson;

/**
 * 
 */
public class RespuestaStreamInit {
    
    /* Mensaje de respuesta. */
    private String message;
    /* Mensaje de respuesta pelicula. */
    private List<Pelicula> peliculas;
    /* Mensaje de respuesta tarjeta */
    private List<Tarjeta> tarjetas;
    private Integer Tiempo;
    private boolean pagoRealizado;

    /**
     * @return the peliculas
     */
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * @param peliculas the peliculas to set
     */
    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the tarjetas
     */
    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    /**
     * @param tarjetas the tarjetas to set
     */
    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    /**
     * @return the pagoRealizado
     */
    public boolean isPagoRealizado() {
        return pagoRealizado;
    }

    /**
     * @param pagoRealizado the pagoRealizado to set
     */
    public void setPagoRealizado(boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    /**
     * @return the tiempo
     */
    public Integer getTiempo() {
        return Tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(Integer tiempo) {
        Tiempo = tiempo;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
