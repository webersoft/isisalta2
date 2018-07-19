/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededato;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Santos
 */
public class ConexionRemota {
    Connection conn=null;
    Statement st= null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="expertprograming";
    private static final String password= "isi111mil";
    private static final String url="jdbc:mysql://db4free.net:3306/bdcineisi";
    
    public ConexionRemota(){
        //conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            st=conn.createStatement();
            
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
