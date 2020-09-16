package io.mh.sfgpetclinic.propertysource.config;

import io.mh.sfgpetclinic.propertysource.model.FakeDataSource;
import io.mh.sfgpetclinic.propertysource.model.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

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
			.user(user)
			.password(password)
			.url(url)
			.build();
	}
}
