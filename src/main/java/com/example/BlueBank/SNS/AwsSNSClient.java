package com.example.BlueBank.SNS;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class AwsSNSClient {
	
	private static final String AWS_ACCESS_KEY_ID = "aws.accessKeyId";
	private static final String AWS_SECRET_KEY = "aws.secretKey";
	static {
		System.setProperty(AWS_ACCESS_KEY_ID, "AKIA6BZRT7L43XEARTUK");
		System.setProperty(AWS_SECRET_KEY, "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");
	}
	
	
	public static void sendSMS (String messege, String phoneNumber) {
		AmazonSNS snsClient = AmazonSNSClient.builder().withRegion(Regions.US_EAST_1).build();
		Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue().withStringValue("BlueBank")
													.withDataType("String")); 
		
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue().withStringValue("Transactional")
				.withDataType("String")); 
		
		PublishResult result = snsClient.publish(new PublishRequest()
				.withMessage(messege)
				.withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		
		System.out.println("Messagem enviada com sucesso! " + result.getMessageId());
		
	}
	
	public static void sendToTopic( String subject, String message) {
		AmazonSNS snsClient = AmazonSNSClient.builder().withRegion(Regions.US_EAST_1).build();
		Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue().withStringValue("BlueBank")
													.withDataType("String")); 
		
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue().withStringValue("Transactional")
				.withDataType("String")); 
		
		PublishResult result = snsClient.publish(new PublishRequest()
				.withTopicArn("arn:aws:sns:us-east-1:965934840569:UndefinedCoders")
				.withMessage(message)
				.withSubject(subject)
				.withMessageAttributes(smsAttributes));
		
		System.out.println("Messagem enviada com sucesso! " + result.getMessageId());
		
	}

}
