package com.example.hibernate.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Tecnico extends Persona {

    private String certificadosEst;
    private String certificaciones;

}