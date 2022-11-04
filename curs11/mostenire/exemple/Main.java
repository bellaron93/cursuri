package curs11.mostenire.exemple;

import curs11.mostenire.C;

public class Main {

    public static void main(String[] args) {
        Pisica pisi1 = new Pisica("Tom", "carnivora");
        System.out.println(pisi1.nume);
        System.out.println(pisi1.tipMamifer);

        pisi1.mananca();
        System.out.println(pisi1.naste());
        Caine caine1 = new Caine("Bibi", "carnivora");
        caine1.mananca();
        System.out.println(caine1.naste());
        Mamifer mamifer1 = new Mamifer("Mamifer", "Ierbivor");
        mamifer1.mananca();
        System.out.println(mamifer1.naste());
        Animal a1 = new Animal("Animalul meu");
        a1.mananca();

        System.out.println("------------------------");
        Caine caine2 = new Caine("Bobi", " omnivor");
        //POLIMORFISM
        Mamifer caine3 = new Caine("Bobita", " omnivor");
        Mamifer mamifer2 = new Mamifer("Bobitz", " omnivor");
        caine2.latra();
//        caine3.latra();
        caine2.naste();
        caine3.naste();
        mamifer2.naste();

        if(caine2 instanceof Animal){
            System.out.println("Cainele e un animal");
        }
        System.out.println(caine2 instanceof Caine);
        System.out.println(caine2 instanceof Mamifer);
        System.out.println(caine3 instanceof Animal);
        System.out.println(mamifer1 instanceof Caine);
    }
}
