/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions.mq;

import uk.emarte.regurgitator.core.Log;
import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

import static uk.emarte.regurgitator.core.YmlConfigUtil.loadId;
import static uk.emarte.regurgitator.core.YmlConfigUtil.loadMandatoryStr;
import static uk.emarte.regurgitator.extensions.mq.ExtensionsMqConfigConstants.DESTINATION;

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