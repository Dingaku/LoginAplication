/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.*;
import Frontera.FramePrincipal;
/**
 *
 * @author Diego
 */
public class ValidarLogin {
    private Sistema sistema = FramePrincipal.sistema;
    
    public ValidarLogin(){
    }
    public String verificarLogin(Usuario usuario){
        String s = "";
        if (!verificarLongitudNombre(usuario.getNombre())){
            s = "Longitud de nombre no valida";
        }
        if (!verificarLongitudPassword(usuario.getPassword())){
            s = "Longitud de contraseña no valida";
        }
        for (Usuario u: sistema.getUsuarios()){
            if (u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
                 s = "Bienvenido";
            }
        }
        return s;
    }
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() > 1 && nombre.length() <= 6);
    }
    public boolean verificarLongitudPassword(String password){
        return (password.length() >= 3 && password.length() < 6);
    }
}
