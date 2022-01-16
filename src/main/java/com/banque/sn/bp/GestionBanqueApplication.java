package com.banque.sn.bp;

import com.banque.sn.bp.Entities.Etudiant;
import com.banque.sn.bp.Web.Rest.EtudiantController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class GestionBanqueApplication {

	public static void main(String[] args) {

		SpringApplication.run(GestionBanqueApplication.class, args);
		EtudiantController etud = new EtudiantController();
		List<Etudiant> list_etud = etud.lisEtudiant();
		System.out.println(list_etud.size());
	}
	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		//WebMvcConfigurerAdapter
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
			}
		};
	}*/

}
