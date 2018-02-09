SI- SMS API Java client
============================

Prerequisites
-------------

You have installed [Java](https://java.com/en/download/) (minimal required version is Java 7).

Installation
-----------

It is recommended that you use a dependency management system to get started with using SI SMS Java API client in your 
project.

Running examples
----------------

First, setup your username and password. Then, you can run provided examples in `com.sms.Sms` package

Basic messaging example
-----------------------

First, initialize the messaging client using your username and password:

    Sms s = new Sms();
	Map<String,String> map = new HashMap<String,String>();

	s.setApiKey("A40e38XXXXXXXXXXXXXXXXXXXXXXXXXXX");
	s.setSender("XXXXXX");
	s.setBaseURL("https://alerts.solutionsinfini.co/api/v4/?");

Send the message:

    String str = s.sendSms(senderNumber, message, map);

Messaging with delivery report push to notification URL example
-----------------------

Similar to standard messaging example,
	
	String deliveryReport = s.smsStatusPush(receiverNumber, message, dlrUrl, responseFormat);

Here `drlUrl` is the encoded URL to receive delivery reports and `responseFormat` is format of the response(XML/PHP/JSON/JSONP).(XML/PHP/JSON/JSONP).

License
-------

This library is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)