/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededato;

import java.sql.*;

/**
 *
 * @author Santos
 */
public class Conexion {
    Connection conectar=null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password= "";//  aqui va la contraseña que se puso al instalar mysql
    private static final String url="jdbc:mysql://localhost:3306/bdcine";
        public Connection conect(){
            try{
            Class.forName("driver");
            conectar=DriverManager.getConnection(url, user, password);
            }
         catch(Exception e){
            System.out.print(e.getMessage());
        }
            return conectar;
        }
     
}
