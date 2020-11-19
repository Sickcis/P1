// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.*;

public class LeerCSV {

    public List<GolfPlayer> parseaCSV(String path) {

        List<GolfPlayer> players = csvToBean.parse();

        return players;
    }
}
