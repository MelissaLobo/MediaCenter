package conf;
import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { AppWebConfiguration.class, JPAConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
    	CharacterEncodingFilter encodingFilter= new CharacterEncodingFilter();
    	encodingFilter.setEncoding("UTF-8");
    	return new Filter[]{encodingFilter};
    }
}

