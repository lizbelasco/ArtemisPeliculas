/**
 * 
 */
package com.soa.dto;

import com.google.gson.Gson;

/**
 * Clase que modela la informacion resumida de una persona
 */
public class Usuario {
    /* Id del usuario */
    private long id;
    /* Login del usuario */
    private String nombre;
    /* Pelicula rentada del usuario */
    private String peliculaRentada;
    /* Pelicula rentada del usuario */
    private Integer tiempo;
    
    
    
    @Override /*sobreescritura*/
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }



    /**
     * @return the id
     */
    public long getId() {
        return id;
    }



    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
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
     * @return the peliculaRentada
     */
    public String getPeliculaRentada() {
        return peliculaRentada;
    }



    /**
     * @param peliculaRentada the peliculaRentada to set
     */
    public void setPeliculaRentada(String peliculaRentada) {
        this.peliculaRentada = peliculaRentada;
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

}
