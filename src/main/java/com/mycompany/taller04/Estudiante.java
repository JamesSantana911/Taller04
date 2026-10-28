/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Estudiante {
    private List<Curso> cursosInscritos;
    private List<Curso> cursosEnEspera;
    
    public Estudiante (){
        this.cursosInscritos= new ArrayList<>();
        this.cursosEnEspera= new  ArrayList<>();
    }
    
    public void solicitarInscripcionCurso(Curso curso ){
        if (curso != null){
            this.cursosEnEspera.add(curso);
        }
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
   
    }
    public List<Curso> getCursosInscritos() {
    return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
    this.cursosInscritos = cursosInscritos;
    }

    public List<Curso> getCursosEnEspera() {
    return cursosEnEspera;
    }

    public void setCursosEnEspera(List<Curso> cursosEnEspera) {
    this.cursosEnEspera = cursosEnEspera;
    }

}
