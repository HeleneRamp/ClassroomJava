public class Classroom {
    
    public static void main(String[] args) {

        Wilder studentWilderOne = new Wilder("Louisilianassina", true);
        Wilder studentWildertwo = new Wilder("Thomassminino", false);

        System.out.println(studentWilderOne.whoAmI());
        System.out.println(studentWildertwo.whoAmI());
    }
}
