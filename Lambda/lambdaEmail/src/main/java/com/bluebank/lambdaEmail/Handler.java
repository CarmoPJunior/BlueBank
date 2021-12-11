package com.bluebank.lambdaEmail;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Map;

public class Handler implements RequestHandler<Map<String,String>, String> {

	@Override
	public String handleRequest(Map<String,String> event, Context context) {

		try {

			String email = event.get("email");
			String nome = event.get("nome");

			context.getLogger().log("email: " + email);
			context.getLogger().log("\nnome: " + nome);

			sendEmail(email, nome);

			return "Email enviado com sucesso!";

		} catch (Exception e) {
			e.printStackTrace();
			return "Falha ao enviar email!";
		}
	}

	// "From" address.
	static final String FROM = "bluebank.squad.undefined.coders@gmail.com";
	static final String FROMNAME = "BlueBank - squad.undefined";
	//SMTP user name.
	static final String SMTP_USERNAME = "bluebank.squad.undefined.coders@gmail.com";
	// SMTP password.
	static final String SMTP_PASSWORD = "Blueb@nk12";
	// SMTP host name
	static final String HOST = "smtp.gmail.com";
	// The port SMTP .
	static final int PORT = 587;
	//
	static final String SUBJECT = "Email Promocional BlueBank";

	public static void sendEmail(String email, String nome) throws Exception {

		// Create a Properties object to contain connection configuration information.
		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port", PORT);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.starttls.required", "true");
		props.put("mail.smtp.ssl.enable", "false");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.auth", "true");

		// Create a Session object to represent a mail session with the specified properties.
		Session session = Session.getDefaultInstance(props);

		String BODY = String.join(
				System.getProperty("line.separator"),
				"<h1>Olá, <span style='color: #03a9f4;'>" +nome +"</span> !</h1>",
				"<h1>Bem Vindo ao <span style='color: #03a9f4;'>BlueBank</span>!</h1>",
				"<p>Agradecemos seu contato! </p>",
				"<p>Retornaremos o seu contato o mais breve possível! </p>",
				"Email:  <a href='#'>bluebank.squad.undefined.coders@gmail.com</a>."
		);

		// Create a message with the specified information.
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(FROM,FROMNAME));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
		msg.setSubject(SUBJECT);
		msg.setContent(BODY,"text/html");

		// Create a transport.
		Transport transport = session.getTransport();

		// Send the message.
		try
		{
			System.out.println("Enviando...");

			// Connect to Amazon SES using the SMTP username and password you specified above.
			transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);

			// Send the email.
			transport.sendMessage(msg, msg.getAllRecipients());
			System.out.println("Email Enviado!");
		}
		catch (Exception ex) {
			System.out.println("O email não foi enviado.");
			System.out.println("Error message: " + ex.getMessage());
		}
		finally
		{
			// Close and terminate the connection.
			transport.close();
		}
	}

}