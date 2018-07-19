/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Santos
 */
public class Conectar {
     Connection conn=null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password= "";//  aqui va la contraseña que se puso al instalar mysql
    private static final String url="jdbc:mysql://localhost:3306/bdcine";
    
    public Conectar(){
        //conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if (conn!=null){
                JOptionPane.showMessageDialog(null, "Conexion establecidad");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "error de conexion "+e);
        }
    }
        // el siguiente metodo me retorna la coneccion
        public Connection getConnection(){
            return conn;
        }
        // con el siguiente metodo nos desconectamos de  la base de datos
        public void desconectar(){
            conn=null;
            if (conn==null){
                JOptionPane.showMessageDialog(null, "Conexion terminada");
            }
        }
}
     
