import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Maggie", "Caramelo", 25, 5.5);
        cachorro1.menu();
        System.out.println();

        Gato gato1 = new Gato("Gamora", "Branco", 23, 4.3);
        gato1.menu();
        System.out.println();
        Passaro passaro1 = new Passaro("Lôro", "Verde", 12, 1.6);
        passaro1.menu();
        System.out.println();

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
