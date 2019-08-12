package kz.mprog;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile = "user.json";

    public static void toJson(User user) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(baseFile), user);
        System.out.println("json created!");
    }

    public static User toJavaObject() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(new File(baseFile),User.class);
        return user;
    }
}
