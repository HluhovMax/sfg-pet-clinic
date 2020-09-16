package io.mh.sfgpetclinic.model;

public class Owner extends Person {

	public static class Builder {
		private final Owner owner;

		public Builder() {
			this.owner = new Owner();
		}

		public Owner.Builder id(Long id) {
			this.owner.id = id;
			return this;
		}

		public Owner.Builder firstName(String firstName) {
			this.owner.firstName = firstName;
			return this;
		}

		public Owner.Builder lastName(String lastName) {
			this.owner.lastName = lastName;
			return this;
		}

		public Owner build() {
			return this.owner;
		}
	}
}
