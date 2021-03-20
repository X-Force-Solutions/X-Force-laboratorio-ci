package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsPeopleRequest {
    public int count;
    public StarWarsCharacter[] results;

    public String[][] convertToStringArray(){
        String[][] result = new String[results.length][3];
        for (int i = 0; i < results.length; i++){
            result[i][0] = results[i].name;
            result[i][1] = results[i].height;
            result[i][2] = results[i].birth_year;
        }
        return result;
    }

}
