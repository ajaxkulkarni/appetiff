package com.rns.tiffeat.web.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.rns.tiffeat.web.bo.domain.CustomerOrder;

public class MailUtil {
	
	
	private static final String MAIL_PORT = "25";
	private static final String MAIL_HOST = "115.124.124.220";
	private static final String MAIL_AUTH = "true";
	private static final String MAIL_PASSWORD = "support_tiffeat";
	private static final String MAIL_ID = "support@tiffeat.com";
	public static final String SENDER_ID = "v=spf1 a ptr ip4:115.124.124.220 ~all";

	public static void sendMail(CustomerOrder order) {
		
		if(order == null|| order.getMeal() == null || order.getCustomer() == null) {
			return;
		}

		Properties props = new Properties();

		props.put("mail.smtp.auth", MAIL_AUTH);
		//props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", MAIL_HOST);
		props.put("mail.smtp.port", MAIL_PORT);
		
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(MAIL_ID, MAIL_PASSWORD);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress(MAIL_ID));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(order.getCustomer().getEmail()));
			message.setSubject("Thank you for ordering tiffin...");
			message.setText(prepareMailContent(order));

			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private static String prepareMailContent(CustomerOrder order) {
		String mailContent = "Hello " + order.getCustomer().getName() + "!<br/>" +
							"You have ordered " + order.getMeal().getTitle() + " for " + order.getMealType() + " for the date " +
							CommonUtil.convertDate(order.getDate()) + ".<br/>" +
							"Your Order Id is :" + order.getId() + ".<br/>" +
							"You can track your order status from www.tiffeat.com<br/>" +
							"Thank you for ordering tiffin from us!";
				
		return mailContent;
	}

}
