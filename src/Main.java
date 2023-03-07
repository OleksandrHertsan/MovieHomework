public class Main {
    public static void main(String[] args) {


        MovieCatalog catalog = new MovieCatalog();

        catalog.addMovie("Puss in Boots: The last wish", 2022, "Comedy",8.8);
        catalog.addMovie("Police Academy", 1984, "Criminal", 8.6);
        catalog.addMovie("Batman", 2022, "Adventure", 7.8);
        catalog.addMovie("Teenage Mutant Ninja Turtles", 2014, "Comedy", 5.8);
        catalog.addMovie("Transformers", 2007, "Action", 9.5);
        catalog.addMovie("1+1", 2011, "Comedy", 8.8);
        catalog.addMovie("Green Book", 2018, "Comedy", 8.2);
        catalog.addMovie("Avengers: Endgame", 2019, "Action", 8.4);
        catalog.addMovie("Spider-Man: No Way Home", 2021, "Action", 8.1);

//        catalog.remove("Green Book");
//        catalog.updateTitle("Green Book", "Green");
//        catalog.updateRating("Avengers: Endgame", 9.9);
//        catalog.updateReleaseDate("1+1", 2023);
//        catalog.updateGenre("Transformers", "Comedy");

//        catalog.searchByTitle("ninja");
//        catalog.searchByReleaseDate(2019);
//        catalog.searchByReleaseDate(1984, 2007);
//        catalog.searchByGenre("Adventure");
//        catalog.searchByRating(7, 9);
//        catalog.searchByRating(8.5);

        System.out.println();
        System.out.println("-----------");

        System.out.println(catalog.getMovies());


    }
}
