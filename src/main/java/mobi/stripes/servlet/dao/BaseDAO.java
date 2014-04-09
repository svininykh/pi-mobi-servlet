/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobi.stripes.servlet.dao;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author svininykh-av
 */
public class BaseDAO {

    Mongo mongo;
    Morphia morphia;
    String dbName;

    public void setUp() throws UnknownHostException {

        mongo = new MongoClient("localhost", 27017);
        morphia = new Morphia();
        morphia.mapPackage("mobi.stripes.servlet.model");
        dbName = "guest-log-journal";

    }

    public Mongo getMongo() {
        return mongo;
    }

    public Morphia getMorphia() {
        return morphia;
    }

    public String getDbName() {
        return dbName;
    }
}
