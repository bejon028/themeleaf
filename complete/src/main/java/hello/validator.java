package hello;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Bijon on 5/4/2017.
 */
public class validator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Greeting.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
