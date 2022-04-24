/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.marketplace.model;
import java.time.LocalDate;
/**
 *
 * @author Catalina
 */
class Comentario {
    private LocalDate  fecha;
    private String contenido;
    private Vendedores vendedor ;

    public Comentario(LocalDate fecha, String contenido, Vendedores vendedor) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.vendedor = vendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Vendedores getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }
    
}
