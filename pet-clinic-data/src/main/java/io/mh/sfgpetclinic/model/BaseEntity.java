package io.mh.sfgpetclinic.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class BaseEntity implements Serializable {

	protected Long id;
}
