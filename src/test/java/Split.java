import org.testng.annotations.Test;

public class Split {

    @Test
    public void main(){

        String email = "denis@gmail.com";

        String[] emailSplit = email.split("@");

              System.out.println(emailSplit[0].split("g")[0]);

                }
    }

