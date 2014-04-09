/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobi.stripes.servlet.dao;

import com.mongodb.Mongo;
import mobi.stripes.servlet.model.Log;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author svininykh-av
 */
public class LogDAO extends BasicDAO<Log, String> {

    public LogDAO(Morphia morphia, Mongo mongo, String dbName)  {
        super(mongo, morphia, dbName);
    }

}
