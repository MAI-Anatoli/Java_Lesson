package task01;

import java.util.HashMap;
import java.util.Map;


public class Passports {
      Map<String, String> passports = new HashMap<>();

      public void addNote(String numPassports, String name ){
          passports.put(numPassports, name);

    }

    public String getAllRecords(){
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("passports: \n");
          for (Map.Entry<String, String> entry: passports.entrySet()){
              stringBuilder.append(entry);
              stringBuilder.append("\n");
          }
          return stringBuilder.toString();

    }

    public String finByName(String name){
          StringBuilder stringBuilder = new StringBuilder();
          for (String key: passports.keySet()){
              if (passports.get(key).equalsIgnoreCase(name)){
                  stringBuilder.append(key);
                  stringBuilder.append(": ");
                  stringBuilder.append(passports.get(key));
                  stringBuilder.append("\n");

              }
          }
          return stringBuilder.toString();
    }
}
