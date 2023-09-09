public class VideojuegoEjemplo123 {


    public static void main(String[] args) {

        // 1) VARIABLES

        String nombreVideojuego = "Rocket League";
        int calificacion = 5;
        //System.out.println(nombreVideojuego + " " + 9);


        // 2) CONDICIONALES

//        if(calificacion > 7) {
//            System.out.println("Muy buen juego");
//        } else if(calificacion < 8) {
//            System.out.println("Buen juego");
//        }


        // 3) LOOPS (BUCLES)

        String[] listaJuegos = {"FIFA", "Dragon Ball Tenkaichi", "Bully"};
        System.out.println(listaJuegos); // ⇨ dirección en la memoria

        for(int i = 0; i < listaJuegos.length; i++) {
            System.out.println(listaJuegos[i]);
        }

        for (String juego : listaJuegos) {
            System.out.println(juego);
        }


    }

}
