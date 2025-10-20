package dev.donmanuel.app;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simple console Pokedex
 * Single-file Java program.
 * Features:
 * - List Pokémon
 * - View details
 * - Search by id or name
 * - Add Pokémon
 * - Save / Load to CSV (pokedex.csv)
 * <p>
 * How to run:
 * javac Pokedex.java
 * java Pokedex
 */


public class Pokedex {
    private static final String DATA_FILE = "pokedex.csv";
    private final List<Pokemon> pokes = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Pokedex app = new Pokedex();
        app.run();
    }

    private void run() {
        load();
        if (pokes.isEmpty()) addSampleData();

        while (true) {
            showMenu();
            String choice = in.nextLine().trim();
            switch (choice) {
                case "1" -> listAll();
                case "2" -> viewDetails();
                case "3" -> search();
                case "4" -> addPokemon();
                case "5" -> removePokemon();
                case "6" -> save();
                case "7" -> {
                    save();
                    System.out.println("Saliendo. Datos guardados.");
                    return;
                }
                default -> System.out.println("Opción no válida. Intenta otra vez.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n=== POKEDEX (consola) ===");
        System.out.println("1) Listar todos");
        System.out.println("2) Ver detalles por ID");
        System.out.println("3) Buscar por nombre o tipo");
        System.out.println("4) Agregar Pokémon");
        System.out.println("5) Eliminar por ID");
        System.out.println("6) Guardar ahora");
        System.out.println("7) Guardar y salir");
        System.out.print("Elige una opción: ");
    }

    private void listAll() {
        if (pokes.isEmpty()) {
            System.out.println("Pokedex vacío.");
            return;
        }
        System.out.println("\nID\tNombre\tTipo");
        for (Pokemon p : pokes) {
            System.out.printf("%d\t%s\t%s\n", p.id, p.name, p.type);
        }
    }

    private void viewDetails() {
        System.out.print("Introduce ID: ");
        String line = in.nextLine().trim();

        try {
            int id = Integer.parseInt(line);
            Pokemon p = findById(id);

            if (p == null) System.out.println("No existe Pokémon con ID " + id);
            else System.out.println(p.detailedString());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
        }
    }

    private void search() {
        System.out.print("Buscar (nombre o tipo): ");
        String q = in.nextLine().trim().toLowerCase();
        List<Pokemon> found = new ArrayList<>();

        for (Pokemon p : pokes) {
            if (p.name.toLowerCase().contains(q) || p.type.toLowerCase().contains(q) || p.description.toLowerCase().contains(q)) {
                found.add(p);
            }
        }

        if (found.isEmpty()) System.out.println("No se encontraron coincidencias.");
        else {
            System.out.println("Resultados:");
            for (Pokemon p : found) System.out.println(p.shortString());
        }
    }

    private void addPokemon() {
        System.out.print("Nombre: ");
        String name = in.nextLine().trim();
        System.out.print("Tipo(s) (ej: Fire, Flying): ");
        String type = in.nextLine().trim();
        System.out.print("Descripción: ");
        String desc = in.nextLine().trim();

        int id = nextId();
        Pokemon p = new Pokemon(id, name, type, desc);
        pokes.add(p);
        System.out.println("Pokémon agregado con ID " + id);
    }

    private void removePokemon() {
        System.out.print("ID a eliminar: ");
        String line = in.nextLine().trim();

        try {
            int id = Integer.parseInt(line);
            Pokemon p = findById(id);
            if (p == null) System.out.println("No existe Pokémon con ID " + id);
            else {
                pokes.remove(p);
                System.out.println("Eliminado " + p.name);
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
        }
    }

    private Pokemon findById(int id) {
        for (Pokemon p : pokes) if (p.id == id) return p;
        return null;
    }

    private int nextId() {
        int max = 0;
        for (Pokemon p : pokes) if (p.id > max) max = p.id;
        return max + 1;
    }

    private void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(DATA_FILE))) {
            pw.println("id,name,type,description");
            for (Pokemon p : pokes) {
                pw.printf("%d,%s,%s,%s\n", p.id, escape(p.name), escape(p.type), escape(p.description));
            }
            System.out.println("Guardado en " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    private void load() {
        File f = new File(DATA_FILE);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = splitCsv(line);
                if (parts.length < 4) continue;
                int id = Integer.parseInt(parts[0]);

                String name = unescape(parts[1]);
                String type = unescape(parts[2]);
                String desc = unescape(parts[3]);
                pokes.add(new Pokemon(id, name, type, desc));
            }

            System.out.println("Cargado " + pokes.size() + " entradas desde " + DATA_FILE);
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

    // Simple CSV helpers (no external libs)
    private String escape(String s) {
        return s.replace("\"", "\"\"").replace(',', ' ');
    }

    private String unescape(String s) {
        return s;
    }

    private String[] splitCsv(String line) {
        return line.split(",", -1);
    }

    private void addSampleData() {
        pokes.add(new Pokemon(1, "Bulbasaur", "Grass/Poison", "A strange seed was planted on its back at birth."));
        pokes.add(new Pokemon(4, "Charmander", "Fire", "Obviously prefers hot places."));
        pokes.add(new Pokemon(7, "Squirtle", "Water", "After birth, its back swells and hardens into a shell."));
        pokes.add(new Pokemon(25, "Pikachu", "Electric", "When several of these Pokémon gather, their electricity could build and cause lightning."));
    }
}






















