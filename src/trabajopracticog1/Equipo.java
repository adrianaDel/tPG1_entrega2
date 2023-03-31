/*
Modificar las clases en base al nuevo diseño planteado en esta etapa 
(ver diagrama de clases), para identificar las entidades de forma unívoca 
para su correcto procesamiento, 
(agregar el atributo id+NombreEntidad con el tipo Integer). 
Se deberán generar nuevamente los métodos generales: constructores, 
setters (entrada), getters (salida), 
toString (String con todos los datos que tendrán los objetos).
 */
package trabajopracticog1;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private String descripcion;
   
    public Equipo(int idEquipo, String nombre, String descripcion){
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Equipo() {  
        this.idEquipo= 0;
        this.nombre= null;
        this.descripcion= null;     
    }
    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    } 
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    } 
    
    //toString
    @Override
    public String toString() {
        return "Equipo [" + "idEquipo=" + idEquipo + ",nombre=" + nombre + ", descripcion=" + descripcion +  "]";
    }  
 }
   
