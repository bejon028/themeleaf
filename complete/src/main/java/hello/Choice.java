package hello;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Bijon on 5/4/2017.
 */
@ToString
@Data
public class Choice {
    public String name;
    public boolean isSelected;
}
