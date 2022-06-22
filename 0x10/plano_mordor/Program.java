import comida.*;

public class Program {
    public static void main(String[] args) {
        Personagem gandalf = new Personagem(-9);
        Personagem bilbo = new Personagem(-3);
        Personagem legolas = new Personagem(6);
        Personagem tauriel = new Personagem(16);

        gandalf.comer(new Comida[] {
                new Maca(1),
                new Maca(1),
                new Cogumelo(-10),
                new OutraComida(-1)
        });

        System.out.println(gandalf.toString());

        bilbo.comer(new Comida[] {
                new BoloDeMel(5),
                new Maca(1),
                new Melao(1),
                new Cogumelo(-10)
        });

        System.out.println(bilbo.toString());

        legolas.comer(new Comida[] {
                new BoloDeMel(5),
                new Maca(1),
                new Melao(1),
                new Cogumelo(-10),
                new BoloDeMel(5),
                new Cram(2),
                new Cram(2)
        });

        System.out.println(legolas.toString());

        tauriel.comer(new Comida[] {
                new BoloDeMel(5),
                new Maca(1),
                new Melao(1),
                new Cogumelo(-10),
                new BoloDeMel(5),
                new Lembas(3),
                new Lembas(3),
                new Cram(2)
        });

        System.out.println(tauriel.toString());
    }
}
