package context;

import java.util.HashMap;

public class ScenarioContext {

    public static HashMap<String, Object> data;
    private static ScenarioContext scenarioContext;

    private ScenarioContext() {
        this.data = new HashMap<>();
    }

    public static ScenarioContext getInstance() {
        if(scenarioContext == null) {
            scenarioContext = new ScenarioContext();
        }
        return scenarioContext;
    }

    public Object get(String key) { //TODO: change to T type return like: public T get(String key, Class clazz)
        return data.get(key);
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public void remove(String key) {
        data.remove(key);
    }

    public void removeAll() {
        data.clear();
    }
}
