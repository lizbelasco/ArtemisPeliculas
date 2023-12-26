/**
 * 
 */
package com.soa.dto;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;

/**
 * 
 */
public class RespuestaCobroTotal {
    
    /*Mensaje de respuesta.*/
    private String message;
    /*Mensaje de respuesta pelicula.*/
    private List<Pelicula> peliculas;
    /*Mensaje de respuesta tarjeta*/
    private List<Tarjeta> tarjetas;
    private String nombre;
    private Integer tiempo;
    private String noTc;   
    private BigDecimal cobro;
    private boolean disponibilidad;

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tiempo
     */
    public Integer getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the noTc
     */
    public String getNoTc() {
        return noTc;
    }

    /**
     * @param noTc the noTc to set
     */
    public void setNoTc(String noTc) {
        this.noTc = noTc;
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
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the cobro
     */
    public BigDecimal getCobro() {
        return cobro;
    }

    /**
     * @param cobro the cobro to set
     */
    public void setCobro(BigDecimal cobro) {
        this.cobro = cobro;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
