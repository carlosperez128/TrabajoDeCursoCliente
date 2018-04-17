/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodecursocliente;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author entrar
 */
public class TrabajoDeCursoCliente {
    public static void main(String[] args) throws Exception {             
        mostrarDatosTodos();
        System.out.println("-----Prueba con Datos Individuales-------");
        System.out.println("-----------------------------------------");
        mostrarDatos("1");
        mostrarDatos("2");
        mostrarId("3");
        mostrarNombre("3");
        mostrarContraseña("3");
        mostrarDept("3");
        mostrarSueldo("3");
    }
    public static void mostrarDatos(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Id: "+ obj.getInt("id"));
        System.out.println("Nombre: "+ obj.getString("nombre"));
        System.out.println("Contraseña: "+ obj.getString("contraseña"));
        System.out.println("Departamento: "+ obj.getString("dept"));
        System.out.println("Sueldo: "+ obj.getDouble("sueldo"));
        System.out.println("-----------------------------------------");
    }
        public static void mostrarContraseña(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Contraseña: "+ obj.getString("contraseña"));
        System.out.println("-----------------------------------------");
    }
        public static void mostrarId(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Id: "+ obj.getInt("id"));
        System.out.println("-----------------------------------------");
    }
        public static void mostrarNombre(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Nombre: "+ obj.getString("nombre"));
        System.out.println("-----------------------------------------");
    }
        public static void mostrarDept(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Departamento: "+ obj.getString("dept"));
        System.out.println("-----------------------------------------");
    }
        public static void mostrarSueldo(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        System.out.println("Sueldo: "+ obj.getDouble("sueldo"));
        System.out.println("-----------------------------------------");
    }        
        
    
    
    
    public static void mostrarDatosTodos(){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.MostrarTodosLosEmpleados(String.class);    
        JSONArray arr = new JSONArray(res);
        for(int i=0; i<arr.length();i++){
        JSONObject obj = arr.getJSONObject(i);
        System.out.println("Id: "+ obj.getInt("id"));
        System.out.println("Nombre: "+ obj.getString("nombre"));
        System.out.println("Contraseña: "+ obj.getString("contraseña"));
        System.out.println("Departamento: "+ obj.getString("dept"));
        System.out.println("Sueldo: "+ obj.getDouble("sueldo"));
        System.out.println("-----------------------------------------");       
        }
        
    }
    
}
