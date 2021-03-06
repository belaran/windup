package org.jboss.windup.hint;

import org.jboss.windup.resource.decoration.AbstractDecoration;
import org.jboss.windup.resource.decoration.hint.MarkdownHint;

public class HintProcessor implements ResultProcessor {

	private String markdown;
	
	@Override
	public void process(AbstractDecoration result) {
		MarkdownHint mdh = new MarkdownHint();
		mdh.setMarkdown(markdown);
		result.getHints().add(mdh);
	}

}
