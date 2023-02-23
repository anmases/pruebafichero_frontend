package org.example;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;

public class Main {

      private static File archivo = new File("pruebafichero_backend/texto.csv");

    public static void main(String[] args) throws IOException {



        //Libreria libreria = new Libreria(RUTA);
        Libreria.escribirFichero();


    }
}