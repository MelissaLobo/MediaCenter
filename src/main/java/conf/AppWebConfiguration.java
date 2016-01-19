package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import controller.HomeController;
import dao.UserDao;

// Classe de configuração gerenciada pelo spring

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, UserDao.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
}
