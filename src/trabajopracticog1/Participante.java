/*

 */
package trabajopracticog1;
import java.util.Arrays;
public class Participante {
    private int idParticipante;
    private String nombre;
    private  Pronostico [] pronosticos ;
    
    public Participante(int idParticipante, String nombre, Pronostico[] pronosticos) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
        this.pronosticos = pronosticos;
    }
    public Participante() {
        this.idParticipante = 0;
        this.nombre = "";
        this.pronosticos=null;
    }
     public int getIdParticipante() {
        return idParticipante;
    }  
    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    } 
    public String getNombre() {
        return nombre;
    }  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    public Pronostico[] getPronosticos() {
        return pronosticos;
    } 
    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }
 
    @Override
    public String toString() {
        return "Participante{" +"idParticipante:"+ idParticipante+"nombre:" + nombre + ", pronosticos:" + Arrays.toString(pronosticos) +'}';
    }  
 }
   

   
 