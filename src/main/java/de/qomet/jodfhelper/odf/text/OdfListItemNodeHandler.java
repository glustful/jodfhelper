/*******************************************************************************
 * Copyright (c) 2009 Softwareschmiede Höffl GmbH
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	 Markus Buch - initial API and implementation
 *******************************************************************************/

package de.qomet.jodfhelper.odf.text;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.doc.text.OdfTextListItem;
import org.w3c.dom.Node;

class OdfListItemNodeHandler implements INodeHandler {

	private final OdfFileDom contentDom;
	private final OdfTextListItem srcNode;

	OdfListItemNodeHandler(OdfFileDom contentDom, final OdfTextListItem srcNode) {
		this.contentDom = contentDom;
		this.srcNode = srcNode;
	}

	@Override
	public Node handleNode() throws Exception {
		OdfTextListItem listItem = new OdfTextListItem(contentDom);

		if (srcNode.getTextStartValueAttribute() != null) {
			listItem.setTextStartValueAttribute(srcNode
					.getTextStartValueAttribute());
		}

		return listItem;
	}
}