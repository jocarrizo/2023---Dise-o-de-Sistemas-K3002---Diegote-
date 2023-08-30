package com.example.hibernate.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Equipo_de_COMP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEAM")
    private String nombre;

    @OneToMany(mappedBy = "equipoDeCompetencia")
    private List<Corredor> corredores= new ArrayList<>();
    @OneToMany(mappedBy = "equipoDeCompetencia")
    private List<Tecnico> tecnicos= new ArrayList<>();

}
