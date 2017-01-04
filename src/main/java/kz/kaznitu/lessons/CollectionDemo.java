package kz.kaznitu.lessons;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDemo {
    private List<Object> lists;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        String msg = "lists: " + lists + "\n"+
                "sets: " + sets  + "\n" +
                "maps: " + maps + "\n" +
                "props: " + pros  + "\n" ;
        return msg ;
    }
}
