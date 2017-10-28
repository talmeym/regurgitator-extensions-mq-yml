# regurgitator-extensions-mq-yml

regurgitator is a lightweight, modular, extendable java framework that you configure to 'regurgitate' canned or clever responses to incoming requests; useful for quickly mocking or prototyping services without writing any code. simply configure, deploy and run.

start your reading here: [regurgitator-all](http://github.com/talmeym/regurgitator-all#regurgitator)

read more about regurgitator in yml here: [regurgitator-core-yml](http://github.com/talmeym/regurgitator-core-yml#yml-configuration-of-regurgitator)

## extension mq steps in yml

### create-jms-response

a create-jms-response step returns a response from regurgitator, allowing ``response-metadata`` parameters to be set, eg. ``jms-destination``, ``correlation-id`` and ``jms-type``:

```yml
create-jms-response:
 name: jms-response-creator
 source: response-param
 jms-message-id: messageid
 jms-type: my-jms-type
 jms-destination: queue://my-destination
 jms-correlation-id: 52908d79-b7c6-4e18-ab13-e991d1b67d8b
 jms-delivery-mode: 1
 jms-expiration: 1506253192636
 jms-redelivered: true
 jms-priority: 4
 jms-reply-to: queue://other-destination
 jms-timestamp: 1506253192636
```
