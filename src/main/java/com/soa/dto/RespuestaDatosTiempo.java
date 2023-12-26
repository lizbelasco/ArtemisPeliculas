package com.soa.dto;

import java.util.List;

import com.google.gson.Gson;

/**
 * Clase que modela la informacion resumida de una persona.
 */
public class RespuestaDatosTiempo {

    /** Mensaje de respuesta. */
    private String message;
    /** Lista de usuarios. */
    private List<Pelicula> peliculas;
    private String nombre;
    private Integer tiempo;
    private String noTc;
    private boolean mayor;

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
     * @return the mayor
     */
    public boolean isMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
