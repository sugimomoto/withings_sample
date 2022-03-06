package sugimomoto.withings4j;

public class Utilities {
    
    public static boolean isNullOrEmpty(String... args){

        for (String string : args) {
            if(string == null || string.isEmpty()){
                return true;
            }
        }

        return false;
    }
}
