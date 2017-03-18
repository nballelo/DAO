/**
 * Created by Ignacio on 15/03/2017.
 */
public class Office extends DAO{
    String nombre;
    String addres;
    public Office(String nombre,String addres){
        this.nombre=nombre;
        this.addres=addres;
    }
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}
    public void setAddres(String addres){this.addres=addres;}
    public String getAddres (){return addres;}
}
