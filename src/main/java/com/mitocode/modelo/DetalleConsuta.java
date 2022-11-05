package com.mitocode.modelo;

import javax.persistence.*;

@Entity
@Table(name = "detalle_consulta")
public class DetalleConsuta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_consutla", nullable = false, foreignKey = @ForeignKey(name = "FK_Consulta_DetalleConsulta"))
    private Consulta consulta;

    @Column(name = "diagnostico", nullable = false)
    private String diagnostico;

    @Column(name = "tratamiento", nullable = false)
    private String tratamiento;

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
