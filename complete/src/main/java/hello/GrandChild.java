package hello;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Bijon on 5/5/2017.
 */
@ToString
public class GrandChild {
    private Boolean aBoolean;
    private String value;

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
