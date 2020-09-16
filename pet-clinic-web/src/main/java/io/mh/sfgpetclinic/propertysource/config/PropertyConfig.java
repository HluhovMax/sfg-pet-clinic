package io.mh.sfgpetclinic.propertysource.config;

import io.mh.sfgpetclinic.propertysource.model.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	final Environment environment;

	@Value("${mh.username}")
	String user;
	@Value("${mh.password}")
	String password;
	@Value("${mh.db.url}")
	String url;

	public PropertyConfig(Environment environment) {
		this.environment = environment;
	}

	@Bean
	public FakeDataSource fakeDataSource() {
		return new FakeDataSource
			.Builder()
			.user(environment.getProperty("USERNAME"))
			.password(password)
			.url(url)
			.build();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
