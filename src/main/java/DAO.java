import java.lang.reflect.Field;
import java.util.List;
/**
 * Created by Ignacio on 15/03/2017.
 */
public abstract class DAO <E> {

    public void insert(){
        StringBuffer comanda = new StringBuffer("INSERT INTO ").append(this.getClass().getSimpleName()).append("(");
        Field[] atributos = this.getClass().getDeclaredFields();
        Field a;
        for (int i=0;i<atributos.length;i++) {
            a=atributos[i];
            comanda.append(a.getName());
            if(i!=(atributos.length-1))
                comanda.append(",");
        }
        comanda.append(") VALUES (");
        for (int i=0;i<atributos.length;i++) {
            a=atributos[i];
            if(i==(atributos.length-1))
                comanda.append("?)");
            else
                comanda.append("?,");
        }
        System.out.println(comanda);
    }
    public void update(){
        StringBuffer comanda = new StringBuffer("UPDATE ").append(this.getClass().getSimpleName()).append(" SET (");
        Field[] atributos = this.getClass().getDeclaredFields();
        Field a;
        for (int i=0;i<atributos.length;i++) {
            a=atributos[i];
            comanda.append(a.getName());
            comanda.append("==?");
            if(i!=(atributos.length-1))
                comanda.append(",");
        }
        comanda.append(") WHERE (").append(atributos[0].getName()).append("==?)");
        System.out.println(comanda);
    }
    public void select(String s){
        Class c=this.getClass();
        Field[] atributos = this.getClass().getDeclaredFields();
        StringBuffer comanda = new StringBuffer("SELECT " ).append(s).append( " INTO ").append(this.getClass().getSimpleName()).append(" WHERE (").append(atributos[0].getName()).append("==");
        comanda.append("?)");
        System.out.println(comanda);
    }
    public void delete(){
        Class c=this.getClass();
        Field[] atributos = this.getClass().getDeclaredFields();
        StringBuffer comanda = new StringBuffer("DELETE FROM ").append(this.getClass().getSimpleName()).append(" WHERE (").append(atributos[0].getName()).append("==");
        comanda.append("?)");
        System.out.println(comanda);
    }
    public void findAll(){
        Field[] atributos = this.getClass().getDeclaredFields();
        StringBuffer comanda = new StringBuffer("SELECT * INTO ").append(this.getClass().getSimpleName()).append(" WHERE (").append(atributos[0].getName()).append("==");
        comanda.append("?)");
        System.out.println(comanda);
    }
}
