package collections;

/**
 * Class SimpleEntity
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SimpleEntity implements Comparable<SimpleEntity> {

    private Integer id;
    private String name;
    private Boolean isTrue;

    public SimpleEntity(Integer id, String name, Boolean isTrue) {
        this.id = id;
        this.name = name;
        this.isTrue = isTrue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isTrue=" + isTrue +
                '}';
    }

    public Boolean getTrue() {
        return isTrue;
    }

    public void setTrue(Boolean aTrue) {
        isTrue = aTrue;
    }

    @Override
    public int compareTo(SimpleEntity o) {
        return this.getName().compareTo(o.getName());
    }
}
