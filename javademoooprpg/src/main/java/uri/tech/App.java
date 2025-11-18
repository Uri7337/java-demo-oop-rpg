package uri.tech;

import uri.tech.animals.Cow;
import uri.tech.characters.Mage;

public class App 
{
    public static void main( String[] args )
    {
        Mage myMage = new Mage();
        myMage.attack();

        Cow myCow = new Cow();
        myCow.poop("Berta");
    }
}
