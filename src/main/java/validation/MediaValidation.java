package validation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.Media;

@Controller
public class MediaValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Media.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nameFile", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "file", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "category", "field.required");
		Media media = (Media) target;
	}
	
}
