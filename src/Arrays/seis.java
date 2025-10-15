package Arrays;
import java.util.Arrays;
public class seis {
    static void main() {
// password.txt
     String[] password={"ASDFDFA","34958234985234820934","243082304920394","ASDFAFMMMMMMMMM99999999","12212112","23094230482"};
     Arrays.sort(password);
     String[] sortedPass={password[0],password[1],password[2]};
    StringBuilder passphrase=new StringBuilder();
    for (String part: sortedPass) {
        passphrase.append(part);
    }
        System.out.println("Sorted array (first 3): "
                + sortedPass[0] + ", "
                + sortedPass[1] + ", "
                + sortedPass[2]);
        System.out.println("Secret passphrase: " + passphrase.toString());



    }
}
