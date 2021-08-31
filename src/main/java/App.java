import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập mật khẩu");
        String mk = sc.nextLine();
        Pattern pUpper = Pattern.compile("^.*[A-Z]+.*$");
        Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
        Pattern pNumber = Pattern.compile("^.*[0-9]+.*$");
        Pattern pSpecial = Pattern.compile("^.*[#?!_.*-]+.*$");
        Pattern pLength = Pattern.compile("^.{10,}$");
        if (pUpper.matcher(mk).find() && pLower.matcher(mk).find() && pNumber.matcher(mk).find()
                && pSpecial.matcher(mk).find()
                &&pLength.matcher(mk).find()){
            System.out.println("Continue");

        }
        else System.out.println("Mời nhập lại password");

    }
}
