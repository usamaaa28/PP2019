import java.util.*;

class morse{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] morse = input.nextLine().split(" ");
        HashMap<String,Character> sandi = new HashMap<>();
        sandi.put(".-",'A');    sandi.put("-...",'B');
        sandi.put("-.-.",'C');  sandi.put("-..",'D');
        sandi.put(".",'E');     sandi.put("..-.",'F');
        sandi.put("--.",'G');   sandi.put("....",'H');
        sandi.put("..",'I');    sandi.put(".---",'J');
        sandi.put("-.-",'K');   sandi.put(".-..",'L');
        sandi.put("--",'M');    sandi.put("-.",'N');
        sandi.put("---",'O');   sandi.put(".--.",'P');
        sandi.put("--.-",'Q');  sandi.put(".-.",'R');
        sandi.put("...",'S');   sandi.put("-",'T');
        sandi.put("..-",'U');   sandi.put("...-",'V');
        sandi.put(".--",'W');   sandi.put("-..-",'X');
        sandi.put("-.--",'Y');  sandi.put("--..",'Z');
        sandi.put(".----",'1'); sandi.put("..---",'2');
        sandi.put("...--",'3'); sandi.put("....-",'4');
        sandi.put(".....",'5'); sandi.put("-....",'6');
        sandi.put("--...",'7'); sandi.put("---..",'8');
        sandi.put("----.",'9'); sandi.put("-----",'0');
        sandi.put("--...",' ');
        for (int i = 0; i < morse.length; i++) {
            System.out.print(sandi.get(morse[i]));
            

        }
    }
}
