package by.it.dorostchenok.jd01_12.variant_c.tasks;

/**
 * класс-контейнер для хранения объектов и хэш-кодов
 */
// реализуем интерфейс Comparable чтобы иметь возможность сортировать стандартными средствами
public class Element implements Comparable<Element>{

    public Element(String name){
        this.name = name;
        this.hash = new String(name).hashCode();
    }

    private String name;
    private Integer hash;

    public String getName() {
        return name;
    }

    public Integer getHash() {
        return hash;
    }
    // переписываем метод, чтобы сравнение шло только по хэшам
    @Override
    public int compareTo(Element o) {
        return this.getHash().compareTo(o.getHash());
    }
    // возврашаем наш хэш, вместо такового из Object
    @Override
    public int hashCode() {
        return hash;
    }
    // для удобной печати на всякий случай переоперделяем toString()
    @Override
    public String toString(){
        return "[" + name + "], " + "[" + hash + "]";
    }

}
