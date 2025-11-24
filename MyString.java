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
        for (int i = 0; i < str.length(); i++) {
            newStr += str.indexOf(i) + 32;
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        if (str2.length()>str1.length())
            return false;
        else {
            while (count != str2.length()){
                if (index1 < str1.length()){
                     if (str1.indexOf(index1) == str2.indexOf(index2)){
                    count++;
                    index1++;
                    index2++;
                }
                 else   {
                    count = 0;
                    index2 = 0;
                    index1++;
                  }
            }   
           }
        }
        if (count == str2.length())
            return true;
        else{
            return false;
        }
    }
}
