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

    String str = s.sendSms(receiversNumber, message, map);

Messaging with delivery report push to notification URL example
-----------------------

Similar to standard messaging example,
	
	String deliveryReport = s.smsStatusPush(receiverNumber, message, dlrUrl, responseFormat);

Here `drlUrl` is the encoded URL to receive delivery reports and `responseFormat` is format of the response(XML/PHP/JSON/JSONP).(XML/PHP/JSON/JSONP).

### Message Delivery Status

To check status of any sent SMS campaign, you must have message id only (not group ID) of the respective message(s). You can only check status for messages which have been sent on the same day. If using POST method for pulling messages status, then statuses for maximum 500 messages can be pulled at a time. Here is a function for checking the status of an SMS in the following format:

	String deliveryStatus = s.messageDeliveryStatus(<message_id>);

Optional parameter

1. Format :- Output format should be as specified by this variable, XML/JSON/JSONP. Default response will be in JSON.
2. Numberinfo :- Flag to query service provider and location data, i.e 0 or 1.
3. Page :- Page number to fetch status details of a pariticular page, where page is 1 or more.


### Group Delivery Status

To check status of any group, you must have `group ID` of the respective message(s). You can only check status for messages which have been sent on the same day. If using POST method for pulling messages status, then statuses for maximum 500 messages can be pulled at a time. Here is a function for checking the status of an SMS in the following format:

	String groupStauts = s.groupDeliveryStatus(<group_id>);

### Send Unicode SMS

 To send message in unicode format. Also can be used for automatic detection of unicode SMS.
  
	String response = s.sendUnicodeSms(<mobile_numbers>, <message>, <drl_url>);

### Schedule Unicode SMS

To schedule the unicode message following function can be used.

	String response = s.scheduleUnicodeSms(<mobile_numbers>, <message>, <drl_url>, <date_time>);

### Schedule SMS

To schedule SMS following function can be used.

	String response = s.scheduleSms(<mobile_numbers>, <message>, <drl_url>, <date_time>);

License
-------

This library is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)