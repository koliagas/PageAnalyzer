package learn.code.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import io.ebean.annotation.WhenCreated;

@Entity
public class URL {
    @Id
    private long id;

    private String name;

    @WhenCreated
    private Instant createdAt;

//    public URL() {
//    }

    public URL(String name) {
        this.name = name;
    }

    /**
    * Метод для получения id обьекта.
    * @return id of URL
    * */
    public long getId() {
        return this.id;
    }

    /**
     * Метод для получения имени обьекта.
     * @return name of URL
     * */
    public String getName() {
        return this.name;
    }

    /**
     * Метод для получения даты создания обьекта.
     * @return the creation date of URL
     * */
    public Instant getCreatedAt() {
        return this.createdAt;
    }


}
