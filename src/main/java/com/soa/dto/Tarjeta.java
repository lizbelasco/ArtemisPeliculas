/**
 * 
 */
package com.soa.dto;

import java.math.BigDecimal;

import com.google.gson.Gson;

/**
 * 
 */
public class Tarjeta {

    /* Id del usuario */
    private long id;

    /* Nombre del encargado de la tarjeta */
    private String nombre;

    /* Numero de tarjeta */
    private String numero;

    /* Nombre del encargado de la tarjeta */
    private BigDecimal saldo;

    @Override /* sobreescritura */
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
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
}
