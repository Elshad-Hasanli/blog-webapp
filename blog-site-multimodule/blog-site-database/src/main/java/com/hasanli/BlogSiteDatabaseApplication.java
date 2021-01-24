package com.hasanli;

import com.hasanli.entity.*;
import com.hasanli.service.inter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class BlogSiteDatabaseApplication {
//	@Autowired
//	AdminsServiceInter adminsServiceInter;

//	@Autowired
//	CategoriesServiceInter categoriesServiceInter;
//@Autowired
//	ContactMessagesServiceInter contactMessagesServiceInter;
//	@Autowired
//	ContentsServiceInter contentsServiceInter;
	@Autowired
	SubscribersServiceInter subscribersServiceInter;
	public static void main(String[] args) {
		SpringApplication.run(BlogSiteDatabaseApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(){
		CommandLineRunner clr=new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
//				Admins admins=new Admins();
//				admins.setEmail("samir@gmail.com");
//				admins.setName("Samir");
//				admins.setSurname("Mirzaliyev");
//				admins.setPassword("7891015");
//				admins.setProfilePic("his profile picture");
//				admins.setId(3);
//			Boolean result=adminsServiceInter.addAdmin(admins);
//				System.out.println(result);
//				List<Admins> admins=adminsServiceInter.getAllAdmin();
//						for(Admins admin:admins){
//							System.out.println(admin.getEmail());
//						}

//				adminsServiceInter.deleteAdmin(2);
//				List<Admins> findedAdmins=adminsServiceInter.findAdmin("ma");
//				for(Admins admin:findedAdmins){
//					System.out.println(admin.getEmail());
//				}
//				System.out.println(adminsServiceInter.updateAdmin(admins));


				// Categories...
//				Categories categories=new Categories();
//				categories.setId(0);
//				categories.setName("C++");
//				System.out.println(categoriesServiceInter.addCategory(categories));
//				List<Categories> categories=categoriesServiceInter.getAllCategory();
//				for(Categories category:categories){
//					System.out.println(category.getName());
//				}

//				categoriesServiceInter.deleteCategory(2);

//				Categories categories=new Categories();
//				categories.setId(3);
//				categories.setName("C+-");
//				categoriesServiceInter.updateCategory(categories);

//				System.out.println(categoriesServiceInter.findCategory("Av").get(0).getName());


				//Contact Messages
//				ContactMessages contactMessage=new ContactMessages();
//				contactMessage.setId(0);
//				contactMessage.setMessageReaded((byte)0);
//				contactMessage.setSenderMail("JP@gmail.com");
//				contactMessage.setSenderName("Jesse");
//				contactMessage.setSenderSurname("Pinkman");
//				contactMessagesServiceInter.addMessage(contactMessage);
//				List<ContactMessages>allMessages=contactMessagesServiceInter.getAllMessages();
//				for(ContactMessages message:allMessages){
//					System.out.println(message.getSenderName());
//				}

//				List<ContactMessages>allUnreadedMessages=contactMessagesServiceInter.getAllUnreadedMessages();
//				for(ContactMessages message:allUnreadedMessages){
//					System.out.println(message.getSenderName());
//				}
//				contactMessagesServiceInter.deleteMessage(1);

				//Contents
//				Contents content=new Contents();
////			new Admins(1,"Elshad","Hasanli","elshad5367@gmail.com","my profile picture","12345");
//				Admins creator =new Admins();
//				creator.setId(1);
//				Categories category=new Categories();
//				category.setId(3);
//				content.setAdminsByContentCreator(creator);
//				content.setCategoriesByContentCategory(category);
//				content.setContentHeader("First C+- lesson");
//				content.setContentBody("There are many variations of passages of Lorem Ipsum available, " +
//						"but the majority have suffered alteration in some form, by injected humour, " +
//						"or randomised words which don't look even slightly believable. If you are going to " +
//						"use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing " +
//						"hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to" +
//						" repeat predefined chunks as necessary, making this the first true generator on the " +
//						"Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model" +
//						" sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem " +
//						"Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
//				content.setContentPic("C++ Content pic");
//				content.setId(0);
//				content.setPostedTime(new Timestamp(System.currentTimeMillis()));
//				contentsServiceInter.addContent(content);

//				List<Contents> allContents=contentsServiceInter.getAllContents();
//				for(Contents content:allContents){
//					System.out.println(content.getAdminsByContentCreator().getName());
//					System.out.println(content.getCategoriesByContentCategory().getName());
//				}

//				List<Contents> allContents=contentsServiceInter.getAllContentsByCategory("JAvA");
//				for(Contents content:allContents){
//					System.out.println(content.getAdminsByContentCreator().getName());
//					System.out.println(content.getCategoriesByContentCategory().getName());
//				}
//				content.setId(2);
//				contentsServiceInter.updateContent(content);
//				contentsServiceInter.deleteContent(3);
//				System.out.println(contentsServiceInter.findContent("fI").get(1).getAdminsByContentCreator().getName());


				// Subscribers
//				Subscribers subscriber=new Subscribers();
//				subscriber.setId(0);
//				subscriber.setSubscriberMail("subsricber@gmail.com");
//				subscriber.setSubscriberName("Subscriber2");
//				subscriber.setSubscriberSurname("Subsrciber2");
//				subscribersServiceInter.addSubscriber(subscriber);

//				System.out.println(subscribersServiceInter.countOfSubscribers());
//				List<Subscribers>allSubscriber=subscribersServiceInter.getAllSubscriber();
//				for(Subscribers subscriber:allSubscriber){
//					System.out.println(subscriber.getSubscriberName());
//				}

//				System.out.println(subscribersServiceInter.findSubscriber("ber"));

//				subscribersServiceInter.deleteSubscriber(1);

			}
		};
		return clr;
	}
}
