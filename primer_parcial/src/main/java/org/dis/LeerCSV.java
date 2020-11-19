// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.*;

public class LeerCSV {

    public static List<GolfPlayer> parseaCSV(String path) {
        List<GolfPlayer> players = null;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("/Volumes/DATA MAC OSX/andres/Documents/aaUni/Tercer Curso/Primer Cuatrimestre/DIS/examen_andres/primer_parcial/best-golf-players.csv"));
            CsvToBean csvToBean = new CsvToBeanBuilder(fileReader).withType(GolfPlayer.class).withIgnoreLeadingWhiteSpace(true).build(); // Para ignorar blancos.build(); //Lista de beans para cargar el csv
            players = csvToBean.parse();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return players;
    }
}
