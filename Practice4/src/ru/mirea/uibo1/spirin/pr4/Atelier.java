package ru.mirea.uibo1.spirin.pr4;

// Класс Atelier
public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("\nМужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.S, 25.0, "Белый"),
                new Pants(Size.M, 50.0, "Черный"),
                new Skirt(Size.XS, 40.0, "Синий"),
                new Tie(Size.L, 15.0, "Красный")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
