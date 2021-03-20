package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacter {
    public String name;
    public String height;
    public String birth_year;
}
