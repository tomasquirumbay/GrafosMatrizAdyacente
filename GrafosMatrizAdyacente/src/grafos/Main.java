package grafos;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int contadorVertices = 0;

    public static void main(String[] args) {
        GrafoMatriz grafo = new GrafoMatriz();
        // Agregar vértices
        Scanner tc = new Scanner(System.in);
        List<String> arista = new ArrayList<String>();

            while (true) {
            	System.out.println("********* QUIRUMBAY MORALES TOMAS **********");
            	System.out.println("************** Menú Principal **************");
                System.out.println("Escriba 1 para Insertar vértices");
                System.out.println("Escriba 2 para Conectar vértices");
                System.out.println("Escriba 3 para Verificar si dos vértices son adyacentes");
                System.out.println("Escriba 4 para Mostrar nodos conectados a un vértice");
                System.out.println("Escriba 5 para Salir");
                System.out.println("********************************************");
                int opc = tc.nextInt();
                tc.nextLine(); //Salto de línea

                switch (opc) {
                	case 1:
                		System.out.print("Escriba la cantidad de vértices a ingresar: ");
                        int nVertices = tc.nextInt();
                        tc.nextLine(); //Salto de línea

                        if (nVertices >= 2 && nVertices <= 20) {
                            for (int i = 0; i < nVertices; i++) {
                                System.out.print("Ingrese el vértice " + (i + 1) + ": ");
                                String vertice = tc.nextLine();
                                grafo.nuevoVertice(vertice);
                                arista.add(vertice);
                            }
                        }else {
                            System.out.println("¡Error! Ingresar una cantidad menor a 20 y mayor a 2.");
                        }

                            contadorVertices = nVertices; // Actualizar el contador de vértices
                		break;
                    case 2:
                        System.out.print("Ingrese el primer vértice a conectar: ");
                        String vertice1 = tc.nextLine();
                        System.out.print("Ingrese el segundo vértice a conectar: ");
                        String vertice2 = tc.nextLine();
                        try {
                            grafo.nuevoArco(vertice1, vertice2);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese el primer vértice: ");
                        vertice1 = tc.nextLine();
                        System.out.print("Ingrese el segundo vértice: ");
                        vertice2 = tc.nextLine();
                        try {
                            System.out.println(grafo.adyacente(vertice1, vertice2));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese el vértice del que desea conocer los nodos conectados: ");
                        String vertice = tc.nextLine();
                        try {
                            List<Vertice> nodosConectados = grafo.nodosConectados(vertice);
                            System.out.println("Nodos conectados a " + vertice + ":");
                            for (Vertice v : nodosConectados) {
                                System.out.println(v.nomVertice());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 5:
                        System.out.println("¡Gracias! Vuelva pronto");
                        return;

                    default:
                        System.out.println("¡Opción no válida! Intente de nuevo.");
                        break;
                }
            }
         
    }
}