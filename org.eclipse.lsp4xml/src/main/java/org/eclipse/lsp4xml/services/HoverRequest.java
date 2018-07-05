/**
 *  Copyright (c) 2018 Angelo ZERR
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.lsp4xml.services;

import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4xml.extensions.IHoverRequest;
import org.eclipse.lsp4xml.internal.parser.BadLocationException;
import org.eclipse.lsp4xml.model.XMLDocument;

/**
 * Hover request implementation.
 *
 */
class HoverRequest extends AbstractPositionRequest implements IHoverRequest {

	public HoverRequest(XMLDocument xmlDocument, Position position) throws BadLocationException {
		super(xmlDocument, position);
	}

}
