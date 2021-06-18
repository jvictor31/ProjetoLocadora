package com.mycompany.conexao;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory factory = null;

    static {
        try {

            init();
        } catch (IOException ex) {

        }
    }

    private static void init() throws IOException {

        try {

            factory = Persistence.createEntityManagerFactory("com.mycompany_locadoraCarros_jar_1.0-SNAPSHOTPU");

        } catch (Exception e) {

        }

    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

}
