package edu.upc.eetac.dsa.rlorenzo.libros.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dsa.rlorenzo.libros.api.model.BookError;

public class ReviewNotFoundException extends WebApplicationException {
	private final static String MESSAGE = "Review not found";

	public ReviewNotFoundException() {
		super(Response
				.status(Response.Status.NOT_FOUND)
				.entity(new BookError(Response.Status.NOT_FOUND
						.getStatusCode(), MESSAGE))
				.type(MediaType.BOOKS_API_ERROR).build());
	}

}
