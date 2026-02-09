public class StringAllMethodsDemo {

    public static void main(String[] args) {

        String s1 = "  Java Programming  ";
        String s2 = "JAVA";
        String s3 = "java";
        String s4 = "Hello World";
        String s5 = "A,B,C,D";

        // 1️⃣ length()
        System.out.println("Length: " + s1.length());

        // 2️⃣ charAt()
        System.out.println("charAt(2): " + s1.charAt(2));

        // 3️⃣ substring()
        System.out.println("Substring(2): " + s1.substring(2));
        System.out.println("Substring(2,6): " + s1.substring(2, 6));

        // 4️⃣ equals()
        System.out.println("equals: " + s2.equals(s3));

        // 5️⃣ equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: " + s2.equalsIgnoreCase(s3));

        // 6️⃣ compareTo()
        System.out.println("compareTo: " + s2.compareTo(s3));

        // 7️⃣ compareToIgnoreCase()
        System.out.println("compareToIgnoreCase: " + s2.compareToIgnoreCase(s3));

        // 8️⃣ toUpperCase()
        System.out.println("UpperCase: " + s3.toUpperCase());

        // 9️⃣ toLowerCase()
        System.out.println("LowerCase: " + s2.toLowerCase());

        // 🔟 trim()
        System.out.println("Trim: '" + s1.trim() + "'");

        // 1️⃣1️⃣ replace()
        System.out.println("Replace: " + s4.replace("World", "Java"));

        // 1️⃣2️⃣ replaceAll()
        System.out.println("ReplaceAll: " + s4.replaceAll("l", "L"));

        // 1️⃣3️⃣ replaceFirst()
        System.out.println("ReplaceFirst: " + s4.replaceFirst("l", "L"));

        // 1️⃣4️⃣ contains()
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        // 1️⃣5️⃣ startsWith()
        System.out.println("StartsWith Hello: " + s4.startsWith("Hello"));

        // 1️⃣6️⃣ endsWith()
        System.out.println("EndsWith World: " + s4.endsWith("World"));

        // 1️⃣7️⃣ indexOf()
        System.out.println("indexOf a: " + s1.indexOf("a"));

        // 1️⃣8️⃣ lastIndexOf()
        System.out.println("lastIndexOf a: " + s1.lastIndexOf("a"));

        // 1️⃣9️⃣ isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty: " + emptyStr.isEmpty());

        // 2️⃣0️⃣ isBlank()  (Java 11+)
        String blankStr = "   ";
        System.out.println("isBlank: " + blankStr.isBlank());

        // 2️⃣1️⃣ concat()
        System.out.println("Concat: " + s2.concat(" Language"));

        // 2️⃣2️⃣ valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("valueOf: " + numStr);

        // 2️⃣3️⃣ toCharArray()
        char[] arr = s2.toCharArray();
        System.out.print("toCharArray: ");
        for(char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 2️⃣4️⃣ split()
        String[] splitArr = s5.split(",");
        System.out.print("Split: ");
        for(String x : splitArr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 2️⃣5️⃣ join()
        String joined = String.join("-", "2026", "02", "06");
        System.out.println("Join: " + joined);

        // 2️⃣6️⃣ getBytes()
        byte[] bytes = s2.getBytes();
        System.out.print("getBytes: ");
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
