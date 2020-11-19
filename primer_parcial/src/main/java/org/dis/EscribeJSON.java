package org.dis;//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.jsonpac

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;


public class EscribeJSON {
    private static final String dir_json = "/Volumes/DATA MAC OSX/andres/Documents/aaUni/Tercer Curso/Primer Cuatrimestre/Notas/PracticaDIS/Proyecto_DIS/src/main/java/org/thegitbrothers/datos/videotecas.json";

    public static void crearFicheroJson(ArrayList<golfPlayer> golfPlayers){
        try{
            FileWriter mywriter = new FileWriter(dir_json);
            mywriter.write(new Gson().toJson(golfPlayers));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
    
 }
