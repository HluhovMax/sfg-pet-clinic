package io.mh.sfgpetclinic.propertysource.config;

import io.mh.sfgpetclinic.propertysource.factory.YamlPropertySourceFactory;
import io.mh.sfgpetclinic.propertysource.model.FakeDataSource;
import io.mh.sfgpetclinic.propertysource.model.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
	@PropertySource(value = {"classpath:jms.yml"}, factory = YamlPropertySourceFactory.class)
})
public class PropertyConfig {

//	final Environment environment;
//
//	public PropertyConfig(Environment environment) {
//		this.environment = environment;
//	}

	// .PROPERTIES
	@Value("${mh.username}")
	String user;
	@Value("${mh.password}")
	String password;
	@Value("${mh.db.url}")
	String url;
	// .YAML
	@Value("${mh.jms.username}")
	String jmsUser;
	@Value("${mh.jms.password}")
	String jmsPassword;
	@Value("${mh.jms.url}")
	String jmsUrl;

	@Bean
	public FakeJmsBroker jmsBroker() {
		return new FakeJmsBroker
			.Builder()
			.user(jmsUser)
			.password(jmsPassword)
			.url(jmsUrl)
			.build();
	}

	@Bean
	public FakeDataSource fakeDataSource() {
		return new FakeDataSource
			.Builder()
//			.user(environment.getProperty("USERNAME"))
			.user(user)
			.password(password)
			.url(url)
			.build();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
