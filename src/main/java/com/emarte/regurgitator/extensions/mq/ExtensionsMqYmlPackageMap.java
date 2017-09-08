package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.AbstractYmlPackageMap;

import java.util.*;

public class ExtensionsMqYmlPackageMap extends AbstractYmlPackageMap {
	private static final List<String> kinds = Arrays.asList("create-jms-response");

	public ExtensionsMqYmlPackageMap() {
		addPackageMapping(kinds, "com.emarte.regurgitator.extensions.mq");
	}
}
