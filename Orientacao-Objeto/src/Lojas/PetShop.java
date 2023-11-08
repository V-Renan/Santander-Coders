package Lojas;

import Animais.Animal;
import Animais.Cachorro;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class PetShop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }
}
