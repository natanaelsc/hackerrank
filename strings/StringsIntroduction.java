public class StringsIntroduction {
        
    // public static String capitalize(String str) {
    //     String first = str.substring(0, 1);
    //     String rest = str.substring(1, str.length());
    //     first = first.toUpperCase();
    //     str = first + rest;
    //     return str;
    // }
    
    static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static void main(String[] args) {
        
        String A = "hello";
        String B = "java";
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(capitalize(A) + " " + capitalize(B));
    }
}
