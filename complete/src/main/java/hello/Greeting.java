package hello;

import lombok.ToString;

import java.util.List;

@ToString
public class Greeting {

    private long id;
    private String content;
    List<Choice> choices;
    public String optionOneName = "bus";
    public String optionTwoName = "train";

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
