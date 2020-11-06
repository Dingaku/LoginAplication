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
import java.util.ArrayList;
import Entidad.Usuario;
import static Frontera.FramePrincipal.sistema;
import Control.ValidarLogin;
/**
 *
 * @author Diego
 */
public class TestLogin {
    private ValidarLogin validarLogin = new ValidarLogin();
    private String LONG_NOMBRE_INCORRECTA = "Longitud del nombre incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud de password incorrecta";
    private String DATOS_INCORRECTOS = "Datos incorrectos";
    private String USUARIO_AUTORIZADO = "Bienvenido";
    public TestLogin() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testLongitudNombre(){
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        u.setNombre("Laura");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
    }
    @Test
    public void testLongitudPassword(){
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        u.setNombre("Laura");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
    }
    @Test
    public void testNombre(){
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
        u.setNombre("Laura");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    @Test
    public void testPassword(){
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
        u.setNombre("Laura");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    @Test
    public void testTodoCorrecto(){
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
        u.setNombre("Laura");
        u.setPassword("password");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
    }
    // public void hello() {}
}
