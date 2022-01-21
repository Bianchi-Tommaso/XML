package xml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Questa Classe Deserializza Un File XML. Legge Il File XML, Tramite Il Metodo toString Stampiamo I Valori Che Ci Interessano
 */

public class Deserializza 
{
    /**
     * Questo Metodo Legge E Stampa Il Contenuto Del File, In Particolare Stamperà La Classe Con La Specializzazione Associata 
     * E Infine La Quantità Degli Studenti.
     * 
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */

    public void ReadFileAndPrint() throws JsonParseException, JsonMappingException, IOException
    {
        

        XmlMapper xmlMapper = new XmlMapper();  

        File file = new File("src/classe.xml");     //Lettura File XML

        
        root value = xmlMapper.readValue(file, root.class);     //Lettura Della Root XML


        System.out.println(toString(value));        //Stampa Del Contenuto
        
    }

    /**
     * 
     * @param value
     * @return s Ritorna Tutto Il Contenuto Da Noi Scelto.
     */
    public String toString(root value)
    {
        String s = "La Classe " + value.getClasse() + " " + value.getSpecializzazione() + 
                   " Si Trova Nell'aula " + value.getAula().getNome() + " Ed è Composta Dai Seguenti Studenti: \n";

                   //For Per La Lettura Degli Studenti
                   for(int i = 0; i < value.getStudenti().size(); i++)
                        s += value.getStudenti().get(i).getCognome() + " ";

        return s;
    }
}
