package com.example.Apig25.Modelos;

import org.springframework.data.annotation.Id;

public class PartidoModelo {
    @Id
    private Long id;
    private String local;
    private Integer marcadorL;
    private String visitante;
    private Integer marcadorV;
    private String fechapartido;
    private String categoria;
    private String ganador;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getMarcadorL() {
        return marcadorL;
    }
    public void setMarcadorL(int marcadorL) {
        this.marcadorL = marcadorL;
    }
    public String getVisitante() {
        return visitante;
    }
    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }
    public int getMarcadorV() {
        return marcadorV;
    }
    public void setMarcadorV(int marcadorV) {
        this.marcadorV = marcadorV;
    }
    public String getFechapartido() {
        return fechapartido;
    }
    public void setFechapartido(String fechapartido) {
        this.fechapartido = fechapartido;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getganador() {
        return ganador;
    }
    public void setganador(String ganador) {
        this.ganador = ganador;
    }
    
}
