package io.mh.sfgpetclinic.model;

public class Vet extends Person {

	public static class Builder {
		private final Vet vet;

		public Builder() {
			this.vet = new Vet();
		}

		public Vet.Builder id(Long id) {
			this.vet.id = id;
			return this;
		}

		public Vet.Builder firstName(String firstName) {
			this.vet.firstName = firstName;
			return this;
		}

		public Vet.Builder lastName(String lastName) {
			this.vet.lastName = lastName;
			return this;
		}

		public Vet build() {
			return this.vet;
		}
	}
}
