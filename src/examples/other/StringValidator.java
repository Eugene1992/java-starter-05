package other;

/**
 * Created by Евгений on 23.05.2016.
 */
public class StringValidator {
    public boolean validayeString(StringSource stringSource){
        String currentString = stringSource.getSomeStringForValid();
        if (currentString.startsWith("A")) return true;
        else return false;
    }
}
