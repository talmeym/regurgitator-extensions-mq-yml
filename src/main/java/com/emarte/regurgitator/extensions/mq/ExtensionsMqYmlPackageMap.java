/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.AbstractYmlPackageMap;

import java.util.Arrays;
import java.util.List;

public class ExtensionsMqYmlPackageMap extends AbstractYmlPackageMap {
    private static final List<String> kinds = Arrays.asList("create-jms-response", "jms-call");

    public ExtensionsMqYmlPackageMap() {
        addPackageMapping(kinds, "com.emarte.regurgitator.extensions.mq");
    }
}
