//reversing the string by converting the string into the char array and then iterating over the charArray


public class Reverse {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "mitanshi";

        char[] nstr = str.toCharArray();


        for (int i = ((nstr.length)-1); i >=0; i--) {
            System.out.print(nstr[i]);
        }
    }
}

