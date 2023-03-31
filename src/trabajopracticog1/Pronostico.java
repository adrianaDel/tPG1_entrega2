/*

 */
package trabajopracticog1;

public class Pronostico {
    private int idPronostico;
    private Equipo Equipo;
    private Partido Partido;
    private char resultado;
    
    public Pronostico(int idPronostico, Equipo Equipo, Partido Partido, char resultado) {
        this.idPronostico = idPronostico;
        this.Equipo = Equipo;
        this.Partido = Partido;
        this.resultado = resultado;
    } 
   public Pronostico() {
        this.idPronostico = 0;
        this.Equipo = new Equipo();
        this.Partido = new Partido();
        this.resultado = '\0'; 
    } 
    public int getIdPronostico() {
        return idPronostico;
    }
    
    public void setIdPronostico(int idPronostico) {
        this.idPronostico = idPronostico;
    }
   
    public Equipo getEquipo() {
        return Equipo;
    }
    
    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
    
    public Partido getPartido() {
        return Partido;
    }
    
    public void setPartido(Partido Partido) {
        this.Partido = Partido;
    }
    
    public char getResultado() {
        return resultado;
    }
    
    public void setResultado(char resultado) {
        this.resultado = resultado;
    }
    @Override
    public String toString() {
    return "Pronostico {" +"idPronostico:" + idPronostico +"Equipo:" + Equipo + ", partido=" + Partido + ", resultado=" + resultado +'}';
    }    
}