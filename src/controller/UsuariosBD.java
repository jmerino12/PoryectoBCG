/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author JMB
 */
public class UsuariosBD {

    private String SQL;

    public Usuario getUsuario(String login, String pas) {
        SQL = "SELECT * FROM usuario WHERE usuario='" + login
                + "' and password='" + pas + "'";
        ResultSet reg = ConexionBD.Query(SQL);
        Usuario ob = new Usuario();
        try {
            if (reg.next()) //saca los campos
            {
                ob.setId(reg.getInt("id"));
                ob.setNombre(reg.getString("nombre"));
                ob.setApellido(reg.getString("apellido"));
                ob.setUsuario(login);
                ob.setPassword(pas);

            }//end if
            else {
                return null;
            }
        } catch (SQLException ex) {
            System.err.println(" Error " + ex.getMessage());
        }
        return ob;
    }

}
