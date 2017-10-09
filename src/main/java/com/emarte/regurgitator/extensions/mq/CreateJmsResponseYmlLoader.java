/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.*;

import java.util.Set;

import static com.emarte.regurgitator.core.YmlConfigUtil.loadOptionalStr;
import static com.emarte.regurgitator.extensions.mq.ExtensionsMqConfigConstants.*;

public class CreateJmsResponseYmlLoader implements YmlLoader<CreateJmsResponse> {
    private CreateResponseYmlLoader responseJsonLoader = new CreateResponseYmlLoader();

    @Override
    public CreateJmsResponse load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
        CreateResponse response = (CreateResponse) responseJsonLoader.load(yaml, allIds);
        String messageId = loadOptionalStr(yaml, JMS_MESSAGE_ID);
        String type = loadOptionalStr(yaml, JMS_TYPE);
        String destination = loadOptionalStr(yaml, JMS_DESTINATION);
        String correlationId = loadOptionalStr(yaml, JMS_CORRELATION_ID);
        String deliveryMode = loadOptionalStr(yaml, JMS_DELIVERY_MODE);
        String expiration = loadOptionalStr(yaml, JMS_EXPIRATION);
        String priority = loadOptionalStr(yaml, JMS_PRIORITY);
        String redelivered = loadOptionalStr(yaml, JMS_REDELIVERED);
        String replyTo = loadOptionalStr(yaml, JMS_REPLY_TO);
        String timestamp = loadOptionalStr(yaml, JMS_TIMESTAMP);
        return new CreateJmsResponse(response, messageId, type, destination, correlationId, deliveryMode, expiration, priority, redelivered, replyTo, timestamp);
    }
}
