package com.milu.vote.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;

/**
 * 由于项目层结构变化导致idea无法识别webapp
 * 目前加了@Deprecated 废弃使用，可根据实际需要进行打开
 */
@Deprecated
@Configuration
public class CommonConfiguration {

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        ConfigurableEmbeddedServletContainer factory = new TomcatEmbeddedServletContainerFactory();
        factory.setDocumentRoot(new File("E:\\Items\\IdeaProject\\vote-cby\\vote-cby-v2\\votesystem\\src\\main\\webapp\\"));
        return (EmbeddedServletContainerFactory) factory;
    }

}
