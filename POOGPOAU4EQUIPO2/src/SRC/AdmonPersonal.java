
package SRC;

public class AdmonPersonal {
    private Personal personal[];
    private int cont;
    
    public AdmonPersonal(){
        personal  = new Personal[99];
        cont = 0;
    }
    
    public void setCont(int cont){
        this.cont = cont;
    }
    
    public int getCont(){
        return cont;
    }
    
    public int getCelda(int clave){
        for(int x = 0; x < getCont(); x++)
            if(clave == personal[x].getClave())
                return x;
        return -1;
    }
    
    public void agregar(Personal pers)
    {
        this.personal[cont] = pers;
        cont++;
    }
    
    public Personal getPersonal(int celda){
        return personal[celda];
    }
    
    public int queEs(int celda){
            if(personal[celda] instanceof Profesor)
                return 1;
            else
                //Es un Intendente
                return 2;
    }
    
    public void modificar(Personal p, int celda){
        personal[celda] = p;
    }
    
    public void eliminar(int celda){
        for(int x = celda; x < cont - 1; x++)
            personal[x] = personal[x + 1];
        cont--;
    }
    
}
