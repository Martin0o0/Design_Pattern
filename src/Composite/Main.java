package Composite;

public class Main {
    public static void main(String[] args) {
        ProductCategory LegoCategory = new Category(1000, "LEGO");
        ProductCategory GBBCategory = new Category(2000, "GGB");

        ProductCategory LegoCityCategory = new Category(1100, "Lego City");
        ProductCategory LegoStarwarsCategory = new Category(1200, "Lego Star Wars");
        ProductCategory LegoTechnicCategory = new Category(1300, "Lego Technic");

        LegoCategory.addProduct(LegoCityCategory);
        LegoCategory.addProduct(LegoStarwarsCategory);
        LegoCategory.addProduct(LegoTechnicCategory);

        ProductCategory AssaultRifle = new Category(2100, "Assault Rifle");
        ProductCategory Pistol = new Category(2200, "Pistol");
        ProductCategory LMG = new Category(2300, "LMG");

        GBBCategory.addProduct(AssaultRifle);
        GBBCategory.addProduct(Pistol);
        GBBCategory.addProduct(LMG);

        ProductCategory Maker1 = new Category(200, "LEGO");
        ProductCategory Maker2 = new Product(100, "VFC");
        ProductCategory Maker3 = new Product(101, "Marui");

        LegoCategory.addProduct(Maker1);
        GBBCategory.addProduct(Maker2);
        GBBCategory.addProduct(Maker3);


        System.out.println(LegoCategory.getCount());
        System.out.println(LegoCategory.getName());
        System.out.println(GBBCategory.getCount());
        System.out.println(GBBCategory.getName());

    }
}
