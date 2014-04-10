/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.dao;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import com.google.code.morphia.Morphia;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

/**
 *
 * @author svininykh-av
 */
public class BaseDAO {

    Mongo mongo;
    Morphia morphia;
    String dbName;
    String VCAP_SERVICES = System.getenv("VCAP_SERVICES");

    public void setUp() throws UnknownHostException {
        if (VCAP_SERVICES != null) {
            BasicDBObject obj = (BasicDBObject) JSON.parse(VCAP_SERVICES);
            dbName = (String) obj.get("db");
            MongoCredential credential = MongoCredential.createMongoCRCredential(
                    (String) obj.get("username"),
                    dbName,
                    ((String) obj.get("password")).toCharArray());
            //(String) obj.get("url")
            mongo = new MongoClient(new ServerAddress((String) obj.get("host"), Integer.parseInt((String) obj.get("port").toString())), Arrays.asList(credential));
        } else {
            mongo = new MongoClient("localhost", 27017);
            dbName = "guest-log-journal";
        }
        morphia = new Morphia();
        morphia.mapPackage("mobi.stripes.servlet.model");
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
