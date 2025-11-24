
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  
        println(arr1);           
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

  
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }


    public static char charAt(char[] arr, int index) {        
        return arr[index];
    }


    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
         return false;
        } 
        else { 
            for (int i = 0; i < arr1.length; i++) {
              if (arr1[i] != arr2[i]) {
            return false; 
        }
    }
   }
    return true;
}
    

 
    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch)
                return i;
        }
        return -1;
    }


    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch)
                return i;
        }
        return -1;
    }


    public static int lastIndexOf(char[] arr, char ch) {
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == ch)
                return i;
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] connect = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            connect[i] = arr1[i];
        }
        for (int k = 0; k < arr2.length; k++) {
            connect[arr1.length + k] = arr2[k];
        }
        return  connect;
    }
    
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        
        if (beginIndex < 0 || endIndex > arr.length || beginIndex > endIndex)
            return new char[0];
        int newLenght = endIndex - beginIndex;
         char[] newArr = new char[newLenght];
        for (int i = 0; i < newLenght; i++) {
            newArr[i] = arr[beginIndex + i];
        }
        return newArr;
    }
    public static long hashCode(char[] arr) {
        int arrLenght = arr.length;
       long sum =0;
        if (arr.length == 0)
            return 0;        
        for (int i = 0; i < arr.length; i++) {
            int ex = (arrLenght-1-i);
            sum += (long)arr[i] * (long)Math.pow(7, ex);

        }        
        return sum;
    }

    public static int compareTo(String str1, String str2) {            
        int minLegnth= Math.min(str1.length(), str2.length());
        char letter1;
        char letter2;
        
        for (int i = 0; i < minLegnth; i++) {
            letter1 = str1.charAt(i);
            letter2 = str2.charAt(i);
        
            if (letter1!=letter2){
                if (letter1 < letter2)
                    return -1;
                else if (letter1 > letter2)
                    return 1;
            }
        }
        
        if (str1.length() < str2.length())
            return -1;
        else if (str1.length() > str2.length())
            return 1;
        
        return 0;
    
    }
}
