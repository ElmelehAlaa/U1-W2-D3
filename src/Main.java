import ClassiEs.Prodotti;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Prodotti prodotto1 = new Prodotti(1L, "libro1", "Books", 75.0);
        Prodotti prodotto2 = new Prodotti(2L, "libro2", "Books", 110.0);
        Prodotti prodotto3 = new Prodotti(3L, "libro3", "Sasso", 500.0);
        Prodotti prodotto4 = new Prodotti(4L, "libro4", "Baby", 300.0);

        ///////////////////////// creo  una lista di prodotti//////////////////////////////////////
        List<Prodotti> productList = new ArrayList<>();
        productList.add(prodotto1);
        productList.add(prodotto2);
        productList.add(prodotto3);
        productList.add(prodotto4);

        //////////////// filtro dei prodotti che appartengono alla categoria "Books" e hanno un prezzo minore di 100//////////////////////////////
        List<Prodotti> booksUnder100 = productList.stream()
                .filter(product -> product.getCategory().equals("Books") && product.getPrice() < 100)
                .toList();

        List<Prodotti>booksBaby= productList.stream() .filter(product ->product.getCategory().equals("Baby")).toList();

        ///////////////// Stampo i prodotti trovati
        for (Prodotti product : booksUnder100) {
            System.out.println("ID: " + product.getId() + ", Nome: " + product.getName() + ", Categoria: " + product.getCategory() + ", Prezzo: " + product.getPrice());
        }
        for(Prodotti product:booksBaby){
            System.out.println("ID: " + product.getId() + ", Nome: " + product.getName() + ", Categoria: " + product.getCategory() + ", Prezzo: " + product.getPrice());

        }
    }
}