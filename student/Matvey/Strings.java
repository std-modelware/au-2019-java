public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings");
        String s0 = "Oleg";
        String s1 = "Olegsey";
        String s2 = s0 + " ot slova " + s1;
        System.out.println(s2);

        String s3 = new String(new char[]{'A','b','c','d','e','f','g','h'}, 1, 3);
        System.out.println(s3);
        System.out.println("-----------");

        String s4 = "END".join(" and ",s2,"AND", "AND", "AND");
        System.out.println(s4);

        String s5 = "AbCdEFhhQwesdS";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase().equalsIgnoreCase(s5.toUpperCase()));

        String s6 = String.format("Etot tekst sostoit iz %d slov", 6);
        System.out.println(s6);
        System.out.println("-----------");


        System.out.println("abcabc".endsWith("bc"));
        System.out.println("Keine platz".indexOf(' '));
        System.out.println("Keine platz".indexOf(' ',6));
        System.out.println("-----------");

        String s = "    Just normal string            ";
        System.out.println(s.trim());

        System.out.println(s.replace('n','q').replace('s','r').trim());

    }
}
