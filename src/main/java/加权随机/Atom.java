package 加权随机;

/**
 * @Classname Atom
 * @Description TODO
 * @Date 2020/5/20 16:16
 * @Author ALexNi
 */
public class Atom {
    /**
     * 对象标识参数
     */
    private String id;
    /**
     * 对象权重参数
     */
    private int weight;

    public Atom(String id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "id='" + id + '\'' +
                ", weight=" + weight +
                '}';
    }
}
