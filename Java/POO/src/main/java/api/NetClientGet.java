package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetClientGet {
    public static void main(String[] args) {
        try {
            // Creamos una URL para la petici n GET
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");

            // Abrimos la conexion HTTP
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Establecemos el m todo de peticion (GET)
            conn.setRequestMethod("GET");

            // Establecemos el tipo de respuesta que queremos (en este caso, JSON)
            conn.setRequestProperty("Accept", "application/json");

            // Verificamos que la respuesta sea correcta (200)
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
            }

            // Leemos la respuesta del servidor
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            // Mostramos la respuesta en pantalla
            String output;

            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            // Cerramos la conexion
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet: " + e);
        }
    }
}