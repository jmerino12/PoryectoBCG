/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TablaBcg;

/**
 *
 * @author Yenis Rebolledo
 */
public class DatosBcg {

    private String SQL;

    public void Guardar(TablaBcg cl) {

        /*       SQL = "INSERT INTO tabla_cliente "
                + "(idCliente,Nombre_Cliente,Apellido_Cliente,Cedula_Cliente)"
                + "VALUES ('" + cl.getIdcliente() + "','" + cl.getNombreCliente()
                + "','" + cl.getApellidoCliente() + "','" + cl.getCedulaCliente() + "')";*/
        SQL = "INSERT INTO datos "
                + "(id,utilidadGeneral,utilidadCompetidor)"
                + "VALUES ('" + cl.getId() + "','" + cl.getUtilidadGeneral()
                + "','" + cl.getUtilidadCompetidor() + "')";
        ConexionBD.Execute(SQL);
        javax.swing.JOptionPane.showMessageDialog(null, "Registro Guardado");
    }

    public ArrayList Buscar() {
        ArrayList<TablaBcg> lista = new ArrayList<TablaBcg>();
        SQL = "SELECT * FROM datos";
        ResultSet reg = ConexionBD.Query(SQL);
        try {
            TablaBcg ob;
            while (reg.next()) {
                ob = new TablaBcg();
                ob.setId(reg.getInt("id"));
                ob.setUtilidadCompetidor(BigDecimal.valueOf(reg.getInt("utilidadCompetidor")));
                ob.setUtilidadGeneral(BigDecimal.valueOf(reg.getInt("utilidadGeneral")));
                lista.add(ob);
            }// end while   
        } catch (SQLException ex) {
            System.err.println("Error en la consulta " + ex.getMessage());
        }
        return lista;
    }

}
