package kz.mprog;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Param> params = new ArrayList<Param>();
        params.add(new Param("position","533"));
        params.add(new Param("department","010861"));

        HashMap<String,String> properties = new HashMap<String, String>();
        properties.put("attr1","value1");
        properties.put("attr2","value2");

        User user = User.builder()
            .id(1)
            .name("Danik")
            .level("1")
            .params(params)
            .properties(properties)
            .phone("87021969826").build();

        Converter.toJson(user);

        //System.out.println(Converter.toJavaObject());

    }
}
