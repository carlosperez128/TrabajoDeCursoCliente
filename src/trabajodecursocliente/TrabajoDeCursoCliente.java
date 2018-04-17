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
    }
    public static void mostrarDatos(String id){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.buscarPorID(String.class,id);
        JSONObject obj = new JSONObject(res);
        String r1 = obj.toString();
        Gson gson = new Gson();
        Empleado emp = gson.fromJson(r1, Empleado.class);
        System.out.println("id: "+emp.getId());
        System.out.println("Nombre: "+emp.getNombre());
        System.out.println("Contraseña: "+emp.getContraseña());
        System.out.println("dept: "+emp.getDept());
        System.out.println("sueldo: "+emp.getSueldo());
        System.out.println("-----------------------------------------");
    }
    
    public static void mostrarDatosTodos(){
        BaseDeDatos BDD = new BaseDeDatos();      
        String res = BDD.MostrarTodosLosEmpleados(String.class);    
        JSONArray arr = new JSONArray(res);
        for(int i=0; i<arr.length();i++){
        JSONObject obj = arr.getJSONObject(i);
        String r1 = obj.toString();
        Gson gson = new Gson();        
        Empleado emp = gson.fromJson(r1, Empleado.class);
        System.out.println("id: "+emp.getId());
        System.out.println("Nombre: "+emp.getNombre());
        System.out.println("Contraseña: "+emp.getContraseña());
        System.out.println("dept: "+emp.getDept());
        System.out.println("sueldo: "+emp.getSueldo());
        System.out.println("-----------------------------------------");
        }
        
    }
    
}
