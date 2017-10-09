/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.AbstractYmlPackageMap;

import java.util.*;

import static java.util.Collections.singletonList;

public class ExtensionsMqYmlPackageMap extends AbstractYmlPackageMap {
    private static final List<String> kinds = singletonList("create-jms-response");

    public ExtensionsMqYmlPackageMap() {
        addPackageMapping(kinds, "com.emarte.regurgitator.extensions.mq");
    }
}
