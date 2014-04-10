/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.dao;

import com.mongodb.Mongo;
import mobi.stripes.servlet.model.Log;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;

/**
 *
 * @author svininykh-av
 */
public class LogDAO extends BasicDAO<Log, String> {

    public LogDAO(Morphia morphia, Mongo mongo, String dbName)  {
        super(mongo, morphia, dbName);
    }

}
