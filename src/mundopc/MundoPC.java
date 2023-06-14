package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");

        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);

        Monitor monitorGamer = new Monitor("Asus", 27);
        Teclado tecladoGamer = new Teclado("USB", "Redragon");
        Mouse mouseGamer = new Mouse("Wireless", "Logitech");

        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, mouseGamer);

        Computadora computadoraMixta = new Computadora("Computadora Mixta", monitorHP, tecladoGamer, mouseGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraMixta);

        orden1.mostrarOrden();
    }
}
