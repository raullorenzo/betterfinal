package edu.upc.eetac.dsa.rlorenzo.libros.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dsa.rlorenzo.libros.api.model.BookError;

public class InternalServerException extends WebApplicationException {
	public InternalServerException(String message) {
		super(Response
				.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity(new BookError(Response.Status.INTERNAL_SERVER_ERROR
						.getStatusCode(), message))
				.type(MediaType.BOOKS_API_ERROR).build());
	}
}
