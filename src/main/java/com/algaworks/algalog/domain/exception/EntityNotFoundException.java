package com.algaworks.algalog.domain.exception;

public class EntityNotFoundException extends DomainException{
	
private static final long serialVersionUID = 1L;
	
	public EntityNotFoundException(String message) {
		super(message);
	}

}
