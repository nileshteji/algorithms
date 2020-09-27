class Solution{
    public static void main(String[] args) {
        String a="Abhay Nand";
        String b="Abhay";
        System.out.println(a.concat("Maurya"));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(0));
        System.out.println(a.compareTo(b));
        String c=" Abhay    ";
        System.out.println(c.hashCode());
        System.out.println(c.trim());
        System.out.println(c.intern());
        System.out.println(c.length());
        System.out.println(c.replace('A', 'N'));
        System.out.println(c.substring(0,2));

        
    }
}