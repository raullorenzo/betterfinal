package edu.upc.eetac.dsa.rlorenzo.libros.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;


import edu.upc.eetac.dsa.rlorenzo.libros.api.model.BookError;

public class BadRequestException extends WebApplicationException {
	public BadRequestException(String message) {
		super(Response
				.status(Response.Status.BAD_REQUEST)
				.entity(new BookError(Response.Status.BAD_REQUEST
						.getStatusCode(), message))
				.type(MediaType.BOOKS_API_ERROR).build());
	}
}
