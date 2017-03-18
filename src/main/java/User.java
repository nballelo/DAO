/**
 * Created by Ignacio on 15/03/2017.
 */
public class User extends DAO{
    String nombre;
    int id;
    public User(String nombre,int id){
        this.nombre=nombre;
        this.id=id;
    }
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}
    public void setId(int id){this.id=id;}
    public int getId(){return id;}

}
