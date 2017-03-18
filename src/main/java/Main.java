/**
 * Created by Ignacio on 15/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        User usuario = new User("Masmi", 2);
        Office office =new Office("Masmi","Castefa del neng");
        usuario.insert();
        office.insert();
        usuario.delete();
        office.delete();
        usuario.findAll();
        office.findAll();
        usuario.select("id");
        office.select("addres");
        usuario.update();
        office.update();
    }
}
