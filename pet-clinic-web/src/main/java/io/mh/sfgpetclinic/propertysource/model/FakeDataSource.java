package io.mh.sfgpetclinic.propertysource.model;

public class FakeDataSource {
	private String user;
	private String password;
	private String url;

	public static class Builder {
		private final FakeDataSource dataSource;

		public Builder() {
			this.dataSource = new FakeDataSource();
		}

		public FakeDataSource.Builder user(String user) {
			this.dataSource.user = user;
			return this;
		}

		public FakeDataSource.Builder password(String password) {
			this.dataSource.password = password;
			return this;
		}

		public FakeDataSource.Builder url(String url) {
			this.dataSource.url = url;
			return this;
		}

		public FakeDataSource build() {
			return this.dataSource;
		}

	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
}
