package io.mh.sfgpetclinic.propertysource.model;

public class FakeJmsBroker {

	private String user;
	private String password;
	private String url;

	public static class Builder {
		private final FakeJmsBroker jmsBroker;

		public Builder() {
			this.jmsBroker = new FakeJmsBroker();
		}

		public FakeJmsBroker.Builder user(String user) {
			this.jmsBroker.user = user;
			return this;
		}

		public FakeJmsBroker.Builder password(String password) {
			this.jmsBroker.password = password;
			return this;
		}

		public FakeJmsBroker.Builder url(String url) {
			this.jmsBroker.url = url;
			return this;
		}

		public FakeJmsBroker build() {
			return this.jmsBroker;
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
