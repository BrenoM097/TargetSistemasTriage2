package Q5;

public class Questao5 {
    public static void main(String[] args) {
        String s = "TargetSistemas";

        String reverseString = "";

        for(int i = s.length()-1; i >= 0; i--) {
            reverseString += s.charAt(i);
        }
        System.out.println(reverseString);
    }
}

