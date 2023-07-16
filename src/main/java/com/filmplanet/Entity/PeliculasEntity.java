/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmplanet.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "PeliculasEntity")
@Table(name = "pelicula")
public class PeliculasEntity  {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "img")
    private String img;

    @Column(name = "language")
    private String language;

    @Column(name = "year")
    private LocalDate year;

    @Column(name = "video")
    private String video;

    @Column(name = "rate")
    private int rate;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne()
    @JoinColumn(name = "categoria_id", nullable = false)
    public CategoriaEntity categoria_id;

    @ManyToMany(mappedBy = "peliculas")
    public Set<UsuariosEntity> usuarios = new HashSet<>();

}
