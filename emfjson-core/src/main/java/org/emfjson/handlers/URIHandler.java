/*
 * Copyright (c) 2015 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Guillaume Hillairet - initial API and implementation
 *
 */
package org.emfjson.handlers;

import org.eclipse.emf.common.util.URI;

/**
 * URIHandler is used during serialization/deserialization
 * of external references.
 *
 */
public interface URIHandler {

	/**
	 * Returns the base URI used by the handler.
	 *
	 * @return uri the new base URI.
	 */
	URI getBaseURI();

	/**
	 * Sets base URI used by the handler.
	 * It will be called before load or save begins.
	 *
	 * @param uri the new base URI.
	 */
	void setBaseURI(URI uri);

	/**
	 * Returns the URI {@link URI#resolve(URI) resolved} against the base URI.
	 *
	 * @param uri the URI to resolve.
	 * @return the URI resolved against the base URI.
	 * @see URI#resolve(URI)
	 */
	URI resolve(URI uri);

	/**
	 * Returns the URI {@link URI#deresolve(URI) deresolved} against the base URI.
	 *
	 * @param uri the URI to resolve.
	 * @return the URI resolved against the base URI.
	 * @see URI#deresolve(URI)
	 */
	URI deresolve(URI uri);

}
