import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class one {

    @Test
    public void testString(){
        String name = "Hallo Den";

        for (int i = name.length()-1; i >= 0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
