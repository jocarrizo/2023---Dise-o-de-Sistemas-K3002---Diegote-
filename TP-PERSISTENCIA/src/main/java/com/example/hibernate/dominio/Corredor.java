package com.example.hibernate.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Corredor extends Persona {

    private String solIncripcion;

}