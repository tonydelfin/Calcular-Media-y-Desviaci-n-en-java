/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlConector {

    public static String MysqlDefaultDatabase;
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    static{
        MysqlDefaultDatabase = "jdbc:mysql://Localhost:3306/mediadesviacion";
    }
    
    public MysqlConector(){
        try {
            this.conn = DriverManager.getConnection(MysqlDefaultDatabase, "root", "");
            this.stmt = this.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet ejecutarConsulta(String consulta){
        try {
            this.rs = this.stmt.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.rs;
    }
    
    
    
    public void CerrarConexion(){
        if( this.rs != null){
            try {
                this.rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(MysqlConector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

