package learn.code.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import io.ebean.annotation.WhenCreated;

@Entity
public class URL {
    @Id
    private long id;

    @Column(unique = true)
    String name;

    @WhenCreated
    private Instant createdAt;

    public URL(String name) {
        this.name = name;
    }

    /**
    * Метод для получения id обьекта.
    * @return id of URL
    * */
    public long getId() {
        return id;
    }

    /**
     * Метод для получения имени обьекта.
     * @return name of URL
     * */
    public String getName() {
        return name;
    }

    /**
     * Метод для получения даты создания обьекта.
     * @return the creation date of URL
     * */
    public Instant getCreatedAt() {
        return createdAt;
    }


}
