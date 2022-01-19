package xml;

import java.util.ArrayList;

public class root 
{
    String annoDiInizio;
    aula aula;
    String classe;
    int numeroFinestre;
    String specializzazione;
    ArrayList<element> studenti;
    
    public String getAnnoDiInizio() {
        return annoDiInizio;
    }
    public void setAnnoDiInizio(String annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }
    public aula getAula() {
        return aula;
    }
    public void setAula(aula aula) {
        this.aula = aula;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNumeroFinestre() {
        return numeroFinestre;
    }
    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }
    public String getSpecializzazione() {
        return specializzazione;
    }
    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }
    public ArrayList<element> getStudenti() {
        return studenti;
    }
    public void setStudenti(ArrayList<element> studenti) {
        this.studenti = studenti;
    }
    
    
    
}
