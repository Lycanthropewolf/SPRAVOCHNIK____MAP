import java.util.HashMap;
import java.util.Map;

public class Spravochnik {
    private static  String name;
    private static String telefonNamber;

    public static Map<String,String> directory=new HashMap<>();

    public static void addDirectory(String name,String telefonNamber){
        directory.put(name,telefonNamber);
    }
    public static void printDirectoty(){
        System.out.println(directory.entrySet());
    }

}
