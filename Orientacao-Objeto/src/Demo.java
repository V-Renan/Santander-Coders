import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Maggie", "Caramelo", 25, 5.5);
        //cachorro1.menu();

        Gato gato1 = new Gato("Gamora", "Branco", 23, 4.3);
        //gato1.menu();

        Passaro passaro1 = new Passaro("Lôro", "Verde", 12, 1.6);
        //passaro1.menu();

        PetShop petShop = new PetShop();

        /*petShop.darBanho(cachorro1);
        petShop.darBanho(gato1);
        petShop.tosar(cachorro1);
        System.out.println(cachorro1.toString());
        System.out.println(gato1.toString());
        System.out.println(passaro1.toString());*/

        gato1.soar();
        cachorro1.soar();
        passaro1.soar();
    }
}
