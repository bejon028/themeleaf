package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @InitBinder
    protected void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setValidator(new validator());
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        Greeting greeting = new Greeting();
        greeting.setId(1);
        greeting.setContent("this is default content");
        List<Choice> choiceList = new ArrayList<>();
        Choice choice = new Choice();
        choice.isSelected = false;
        choice.name = "one";
        choiceList.add(choice);
        Choice choice2 = new Choice();
        choice2.isSelected = false;
        choice2.name = "two";
        choiceList.add(choice2);
        greeting.setChoices(choiceList);
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute @Valid Greeting greeting) {
        System.out.println(greeting);
        return "result";
    }

}
