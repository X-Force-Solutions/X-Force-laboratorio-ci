package Model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
public class StarWarsCharacterTest {
    private static StarWarsCharacter starWarsCharacter;

    @BeforeAll
    public static void initializerStarWarsCharacter(){
        starWarsCharacter = new StarWarsCharacter();
    }
    @Test
    void setHeightAndCheckHeight(){
        starWarsCharacter.height = "1";
        assertEquals ("1",starWarsCharacter.height);

    }
}
