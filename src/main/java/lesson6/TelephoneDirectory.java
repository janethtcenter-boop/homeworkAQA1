package lesson6;

import java.util.HashMap;

public class TelephoneDirectory {
    private HashMap<String, Integer> telephoneDirectory = new HashMap<String, Integer>();
    public TelephoneDirectory () {}
    public void addRecord (String LastName, Integer Number) {
        telephoneDirectory.put(LastName, Number);
    }
    public String getRecord (String LastName) {
        Integer Number = telephoneDirectory.get(LastName);
        return LastName;
    }
}
