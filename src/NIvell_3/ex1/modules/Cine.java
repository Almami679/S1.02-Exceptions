package NIvell_3.ex1.modules;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Cine {

    private int numFilas;
    private int numButacasXFila;
    private GestionButaca gestionButacas;
    private GestionCine gestionCine;

    public Cine() {
        numFilas = -1;
        numButacasXFila = -1;
        gestionCine = new GestionCine();
        gestionButacas = new GestionButaca();
        pedirDatosInicales();


    }

    public int getNumFilas() {
        return numFilas;
    }

    public int getButacasXFila() {
        return numButacasXFila;
    }

    public void iniciar() throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = -1;
        int loop = 0;
        ArrayList<String> nombres = new ArrayList<>();
        while(opcion != 0) {
            opcion = this.gestionCine.menu();
            switch (opcion) {
                case 1:
                    System.out.println(this.gestionCine.mostrarButacasReservadas(this.gestionButacas.getButacas()));

                    break;
                case 2:
                    for (int persona = 0; persona <= this.gestionButacas.getButacas().size(); persona++) {
                        String nombre = this.gestionButacas.getButacas().get(persona).getPersona();
                        if (nombres.isEmpty()) {
                            nombres.add(nombre);
                            ++loop;
                            System.out.println("[" + loop + "] " + nombre);
                        } else if (!nombres.contains(nombre)) {
                            nombres.add(nombre);
                            ++loop;
                            System.out.println("[" + loop + "] " + nombre);
                        }
                    }
                    try {
                        System.out.println("De que persona quieres ver las reservas?");
                        while (input.hasNext()) {
                            if (input.nextInt() > nombres.size() || input.nextInt() < 0) {
                                System.out.println(this.gestionCine.mostrarButacasPersona(nombres.get(input.nextInt() - 1)
                                        , this.gestionButacas.getButacas()));
                            } else {
                                System.out.println("No se ha introducido un numero dentro de las opciones");
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Error inesperado: " + e.getMessage());
                    } finally {
                        input.close();
                    }

                    break;
                case 3:
                    int numFila = this.gestionCine.introducirNumFila();
                    int numButaca = this.gestionCine.introducirNumButaca();
                    String nombre = this.gestionCine.introducirPersona();
                    this.gestionCine.reservarButaca(numFila, numButaca, nombre);
                    break;

                case 4:
                    this.gestionCine.anularReserva(this.gestionCine.introducirNumFila(), this.gestionCine.introducirNumButaca());
                    break;

                case 5:
                    this.gestionCine.anularReservaPersona(this.gestionCine.introducirPersona());
                    break;

                case 0:
                    System.out.println("bye!");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

        }

        public void pedirDatosInicales() throws InputMismatchException {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Cuantas filas tiene el cine?");
                while (this.numFilas == -1) {

                    if (input.hasNextInt()) {
                        this.numFilas = input.nextInt();
                    } else {
                        System.out.println("No se ha introducido un Integer: " + input.next());
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
            try {
                System.out.println("Cuantas butacas tiene cada fila?");
                while (this.numButacasXFila == -1) {

                    if (input.hasNextInt()) {
                        this.numButacasXFila = input.nextInt();
                    } else {
                        System.out.println("No se ha introducido un Integer: " + input.next());
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

}
