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
public class administrador extends Usuario {
    
    private List<Usuario> usuariosGestionados;
    
    public administrador(){
        this.usuariosGestionados= new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario) {
if (usuario != null) {
this.usuariosGestionados.add(usuario);
}
}

public List<Usuario> getUsuariosGestionados() {
return usuariosGestionados;
}


public boolean crearUsuarioConRol(String usuario, String contraseña) {

return true;
}

public void asignarPermiso(String usuario) {

}

public void actualizarSoftware() {

}



public void asignarResponsable(Curso curso, Profesor responsable) {
if (curso != null && responsable != null) {
//curso.setResponsable(responsable);
}
}
}

