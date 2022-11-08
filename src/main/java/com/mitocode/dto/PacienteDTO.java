package com.mitocode.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PacienteDTO {

    private Integer idPaciente;

    @NotEmpty
    @Size(min = 1, message = "Los/El nombre(s) es obligatorio")
    private String nombres;

    @NotEmpty
    @Size(min = 1, message = "Los/El apellido(s) es obligatorio")
    private String apellidos;

    @NotEmpty
    @Size(min = 10, message = "El DNI es obligatorio")
    private String dni;
    private String direccion;
    private String telefono;
    @Email(message = "El formato del correo no es valido")
    private String email;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
