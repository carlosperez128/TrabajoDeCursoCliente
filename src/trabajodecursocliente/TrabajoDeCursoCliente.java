/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodecursocliente;

import com.google.gson.Gson;
import org.json.JSONObject;

/**
 *
 * @author entrar
 */
public class TrabajoDeCursoCliente {
    public static void main(String[] args) throws Exception {
        mostrarDatos("1");
        mostrarDatos("2");
    }
    public static void mostrarDatos(String id){
        BaseDeDatos sergio = new BaseDeDatos();      
        String res = sergio.buscarPorID(String.class,id);
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
    
}
