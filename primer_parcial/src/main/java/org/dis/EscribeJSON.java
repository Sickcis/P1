package org.dis;//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.jsonpac

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class EscribeJSON {

    private static final String dir_csv = "/Volumes/DATA MAC OSX/andres/Documents/aaUni/Tercer Curso/Primer Cuatrimestre/DIS/examen_andres/primer_parcial/best-golf-players.json";
    public static void crearFicheroJson(List<GolfPlayer> golfPlayers){
        try{
            FileWriter mywriter = new FileWriter(dir_csv);
            mywriter.write(new Gson().toJson(golfPlayers));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static void main(String[] args){
        List<GolfPlayer> players = LeerCSV.parseaCSV(dir_csv);

        EscribeJSON.crearFicheroJson(players);
    }

 }
