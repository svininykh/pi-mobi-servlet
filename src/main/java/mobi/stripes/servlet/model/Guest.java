/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.model;

import org.bson.types.ObjectId;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/**
 *
 * @author svininykh-av
 */
@Entity
public class Guest {

    @Id
    protected ObjectId id;

    private String name;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
