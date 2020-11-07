/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Entidad.Usuario;
import DAO.*;
/**
 *
 * @author Diego
 */
public class Inicializacion {
    static UsuarioDAO uDao = new UsuarioDAO();
    @Test
    public void initData(){
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
        a.setNombre("Diego");
        a.setPassword("12345");
        b.setNombre("Juan");
        b.setPassword("12345");
        c.setNombre("Laura");
        c.setPassword("12345");
        
        uDao.crear(a);
        uDao.crear(b);
        uDao.crear(c);
    }
}
