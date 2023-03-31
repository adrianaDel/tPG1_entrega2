/*

 */
package trabajopracticog1;

public class Partido {
   private int idPartido;
   private Equipo Equipo1;
   private Equipo Equipo2;
   private int golesEquipo1;
   private int golesEquipo2;

  public Partido(int idPartido, Equipo Equipo1, Equipo Equipo2, int golesEquipo1, int golesEquipo2) {
        this.idPartido = idPartido;
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
      public Partido() {
        this.idPartido = 0;
        this.Equipo1 = new Equipo();
        this.Equipo2 = new Equipo();
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }
    public int getIdPartido() {
        return idPartido;
    }
    
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    } 
      
    public Equipo getEquipo1() {
        return Equipo1;
    }
    
    public void setEquipo1(Equipo Equipo1) {
        this.Equipo1 = Equipo1;
    }
    
    public Equipo getEquipo2() {
        return Equipo2;
    }   
    public void setEquipo2(Equipo Equipo2) {
        this.Equipo2 = Equipo2;
    }
    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    
    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }
    
    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    
    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
    @Override
    public String toString() {
    return "Partido{"+ "idPartido:" + idPartido+ "Equipo1:" + Equipo1 + ",Equipo2=" + Equipo2 + ", golesEquipo1=" + golesEquipo1
                + ", golesEquipo2=" + golesEquipo2 + '}';
    }
   
    public char resultado(Equipo equipo) {
        if (equipo == Equipo1) {
            if (golesEquipo1 > golesEquipo2) {
                return 'G';
            } else if (golesEquipo1 < golesEquipo2) {
                return 'P';
            } else {
                return 'E';
            }
        } else if (equipo == Equipo2) {
            if (golesEquipo2 > golesEquipo1) {
                return 'G';
            } else if (golesEquipo2 < golesEquipo1) {
                return 'P';
            } else {
                return 'E';
            }
        } else {
            return 'I';
        }
    }
}
 

    
