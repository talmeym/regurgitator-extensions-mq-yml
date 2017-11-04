/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.*;

import java.util.Set;

import static com.emarte.regurgitator.core.YmlConfigUtil.loadId;
import static com.emarte.regurgitator.core.YmlConfigUtil.loadMandatoryStr;
import static com.emarte.regurgitator.extensions.mq.ExtensionsMqConfigConstants.DESTINATION;

public class JmsCallYmlLoader implements YmlLoader<JmsCall> {
    private static final Log log = Log.getLog(JmsCallYmlLoader.class);

    @Override
    public JmsCall load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
        MqMessagingSystem mqMessagingSystem = MqMessagingLookup.mqMessagingSystem();
        
        String id = loadId(yaml, allIds);
        log.debug("Loaded jms call '{}'", id);
        return new JmsCall(id, mqMessagingSystem, loadMandatoryStr(yaml, DESTINATION));
    }
}