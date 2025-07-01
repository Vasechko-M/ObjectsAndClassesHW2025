public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author chehov = new Author("Антон", "Павлович", "Чехов");
        Book posleBala = new Book("После бала", tolstoy, 1910);
        Book malchiki = new Book("Мальчики", chehov, 1887);
        Book malchiki1 = new Book("Мальчики", chehov, 1887);
        System.out.println(malchiki.hashCode());
        System.out.println(malchiki1.hashCode());
        System.out.println(malchiki.equals(malchiki1));
        System.out.println("После бала = " + posleBala);
        System.out.println("Мальчики = " + malchiki);
        posleBala.setYear(1911);
        System.out.println("После бала = " + posleBala);
    }
}