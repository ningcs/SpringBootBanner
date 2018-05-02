package com.example.demo;

import com.example.demo.listener.MyApplicationListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Banner实例
 *
 */
@SpringBootApplication
public class SpringBootBannerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootBannerApplication.class);
		application.setBannerMode(Banner.Mode.CONSOLE);
//		application.run(args);
		ConfigurableApplicationContext context = application.run(args);
		//把监听器加入到SpringApplication中
		context.addApplicationListener(new MyApplicationListener());
//		//发布事件
//		context.publishEvent(new MyApplicationEvent(new Object()));
//		context.close();
	}
}
