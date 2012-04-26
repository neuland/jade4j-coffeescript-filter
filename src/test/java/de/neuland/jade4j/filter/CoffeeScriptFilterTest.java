package de.neuland.jade4j.filter;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.template.JadeTemplate;

public class CoffeeScriptFilterTest {
	private static final String RESOURCE_PATH = "src/test/resources/";

	@Test
	public void jade() throws Exception {
		JadeConfiguration jade = new JadeConfiguration();
		jade.setFilter("coffeescript", new CoffeeScriptFilter());
		JadeTemplate template = jade.getTemplate(RESOURCE_PATH + "coffee.jade");
		String html = jade.renderTemplate(template, new HashMap<String, Object>());
		assertEquals(fileAsString("coffee.html"), html);
	}

	private String fileAsString(String string) throws IOException {
		return FileUtils.readFileToString(new File(RESOURCE_PATH + string), "UTF-8");
	}
}
