package com.mitocode.modelo;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ConsultaExamenPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "id_consutla", nullable = false, foreignKey = @ForeignKey(name = "FK_Consulta_ConsultaExamen"))
    private Consulta consulta;

    @ManyToOne
    @JoinColumn(name = "id_examen", nullable = false, foreignKey = @ForeignKey(name = "FK_Examen_ConsultaExamen"))
    private Examen examen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaExamenPK that = (ConsultaExamenPK) o;
        return consulta.equals(that.consulta) && examen.equals(that.examen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consulta, examen);
    }
}
