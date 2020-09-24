package UI;

import Data.Agenda;
import Data.Contacto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class UI {
    public static TreeMap<String, String> CargarListaAgendas(){
        TreeMap<String, String> agendasCargadas = new TreeMap<>();
        File entrada;
        try {
            entrada = new File("Agendas.csv");
            FileReader archivolector = new FileReader(entrada);
            BufferedReader lector = new BufferedReader(archivolector);
            String agenda;
            while((agenda = lector.readLine()) != null){
                String[] arrAgenda = agenda.split(" ");
                try {
                    agendasCargadas.put(arrAgenda[0], arrAgenda[1]);
                } catch (Exception e) {
                    agendasCargadas.put(arrAgenda[0], arrAgenda[0]);
                }
            }
            String a = agendasCargadas.firstKey();
            agendasCargadas.remove(a);
            agendasCargadas.put("Seleccione Agenda", "Seleccione Agenda");
            return agendasCargadas;
        } catch (IOException e) {
            agendasCargadas.put("Seleccione Agenda", "Seleccione Agenda");
            return agendasCargadas;
        }
    }
    
    public static String[] agendasDisponibles(){
        TreeMap<String, String> carga = CargarListaAgendas();
        Set<String> agendas;
        agendas = carga.keySet();
        String[] retorno = new String[agendas.size()];
        retorno = agendas.toArray(retorno);
        return retorno;
    }
    
    public static Agenda cargarAgenda(String nombre, String ubicacion){
        Agenda carga;
        FileInputStream entrada;
        try {
            entrada = new FileInputStream(ubicacion);
            ObjectInputStream obj = new ObjectInputStream(entrada);
            Object agenda = obj.readObject();
            carga = (Agenda) agenda;
            obj.close();
            return carga;
        } catch (IOException | ClassNotFoundException e) {
            carga = new Agenda(ubicacion, nombre, null);
            return carga;
        }
    }
    
    public static TreeMap<String, Contacto> mapaContactos(ArrayList<Contacto> contactos){
        try{
            TreeMap<String, Contacto> mapaDeContactos = new TreeMap<>();
            for(int i = 0; i < contactos.size(); i++){
                mapaDeContactos.put(contactos.get(i).getNombre(), contactos.get(i));
            }
            return mapaDeContactos;
        }
        catch(Exception ex){
            return null;
        }
    }
    
    public static String[] nombreContactos(TreeMap<String, Contacto> mapaDeContactos){
        String[] contactos;
        try{    
            Set<String> keys = mapaDeContactos.keySet();
            contactos = keys.toArray(new String[mapaDeContactos.size()]);
            return contactos;
        }catch(Exception ex){
            contactos = new String[1];
            contactos[0] = "No hay Contactos";
            return contactos;
        }
    }
    
    public static String guardarAgenda(Agenda agenda){
        FileOutputStream guardar;
        try {
            guardar = new FileOutputStream(agenda.getUbicacion());
            ObjectOutputStream obj = new ObjectOutputStream(guardar);
            obj.writeObject(agenda);
            obj.close();
            String respuesta = "La agenda " + agenda.getNombre() + " se guardo correctamente";
            return respuesta;
        } catch (IOException e) {
            String respuesta = "Fallo al guargar agenda " + agenda.getNombre();
            return respuesta;
        }
    }
    
    public static String guardarNombre(String nombre, String ubicacion){
        TreeMap<String, String> nombres = CargarListaAgendas();
        Set<String> setNombres = new HashSet<>(nombres.keySet());
        setNombres.add(nombre);
        setNombres.remove("Seleccione Agenda");
        nombres.put(nombre, ubicacion);
        FileWriter guardar;
        try {
            guardar = new FileWriter("Agendas.csv");
            for (String aux : setNombres) {
                guardar.write('\n' + aux + " "+ nombres.get(aux));
            }
            guardar.close();
            String respuesta = "La agenda " + nombre + " se agrego a la lista de agendas";
            return respuesta;
        } catch (IOException e) {
            String respuesta = "Fallo al agregar agenda" + nombre + " a la lista de agendas";
            return respuesta;
        }
    }
}