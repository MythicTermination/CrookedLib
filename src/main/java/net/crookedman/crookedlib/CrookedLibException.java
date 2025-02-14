package net.crookedman.crookedlib;

import net.minecraft.resources.ResourceLocation;

import java.io.Serial;

/**
 * Generic {@link Exception} wrapper for CrookedLib.<br>
 * Mostly just serves as a marker for internal error handling.
 */
public class CrookedLibException extends RuntimeException {
	@Serial
	private static final long serialVersionUID = 1L;

	public CrookedLibException(ResourceLocation fileLocation, String message) {
		super(fileLocation + ": " + message);
	}

	public CrookedLibException(ResourceLocation fileLocation, String message, Throwable cause) {
		super(fileLocation + ": " + message, cause);
	}
}
