/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.*;

import java.util.Set;

import static com.emarte.regurgitator.core.YmlConfigUtil.*;
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
        Long deliveryMode = loadOptionalLong(yaml, JMS_DELIVERY_MODE);
        Long expiration = loadOptionalLong(yaml, JMS_EXPIRATION);
        Long priority = loadOptionalLong(yaml, JMS_PRIORITY);
        Boolean redelivered = loadOptionalBool(yaml, JMS_REDELIVERED);
        String replyTo = loadOptionalStr(yaml, JMS_REPLY_TO);
        Long timestamp = loadOptionalLong(yaml, JMS_TIMESTAMP);
        return new CreateJmsResponse(response, messageId, type, destination, correlationId, deliveryMode, expiration, priority, redelivered, replyTo, timestamp);
    }
}
