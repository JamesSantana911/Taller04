/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;
import java.time.LocalDateTime;
import java.util.*;
/**
 *
 * @author CltControl
 */
public class Indicente {
    
    public int id;
    public LocalDateTime fecha_reportado;
    public String estado;
    public String titulo;
    public String descripcion;
    public List log_actualizaciones;
    public LocalDateTime fecha_cerrado;
    public String tipo;
    public Usuario responsable;
    public PersonalAcademico beneficiario;
    
}
