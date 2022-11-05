package com.mitocode.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    private Integer idMenu;

    @Column(name = "icono", nullable = false, length = 50)
    private String icono;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "url", nullable = false, length = 50)
    private String url;

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
