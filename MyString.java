public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       String newStr = "";
       char ch;
        for (int i = 0; i < str.length(); i++) {
            ch  = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                newStr += (char)(ch +32);
            else
                newStr += ch;
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        boolean good ;
        if (l2 == 0)
            return false;
        if (l2>l1)
            return false;
        for (int i = 0; i <= l1-l2; i++) {
            good = true;

                for (int m = 0; m < l2; m++) {
                    if (str1.charAt(i+m)!=str2.charAt(m)){
                        good = false;
                        break;
                    }
                }
                if(good)
                    return true;
            }
            return false;
        }
       
}
