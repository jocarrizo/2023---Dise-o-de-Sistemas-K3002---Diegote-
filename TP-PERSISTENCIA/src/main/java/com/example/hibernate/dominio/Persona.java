package com.example.hibernate.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DOCUMENTO")
    private int documento;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "PESO")
    private int peso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id")
    private Equipo_de_COMP equipoDeCompetencia;
}
