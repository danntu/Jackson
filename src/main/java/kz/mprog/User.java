package kz.mprog;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@JsonPropertyOrder({"id","name","phone"})
public class User {

    @JsonProperty("number")
    private long id;
    @JsonProperty("First Name")
    private String name;
    @JsonProperty("Phone Number")
    private String phone;
    @JsonIgnore
    private String level;

    private List<Param> params;

    private Map<String,String> properties;

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public String toString(){
        return "User[ID: "+id+", Name: "+name+", Phone: "+phone+"]";
    }
}
