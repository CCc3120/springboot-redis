package com.bingo.redismsg;


//@Configuration
public class RedisListenerConfig {
	/**
	 * redis消息监听器容器 可以添加多个监听不同话题的redis监听器，只需要把消息监听器和相应的消息订阅处理器绑定，该消息监听器
	 * 通过反射技术调用消息订阅处理器的相关方法进行一些业务处理
	 * 
	 * @param connectionFactory
	 * @param listenerAdapter
	 * @return
	 */
	// @Bean
//	public RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//			MessageListenerAdapter listenerAdapter) {
//		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//		container.setConnectionFactory(connectionFactory);
//
//		// 可以添加多个 messageListener,配置不同的交换机
//		container.addMessageListener(listenerAdapter, new PatternTopic("index"));
//
//		return container;
//	}

	/**
	 * 消息监听器适配器，绑定消息处理器，利用反射技术调用消息处理器的业务方法
	 * 
	 * @param redisReceiver
	 * @return
	 */
	// @Bean
//	public MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver) {
//		return new MessageListenerAdapter(redisReceiver, "receiveMessage");
//	}

	/** 使用默认的工厂初始化redis操作模板 */
	// @Bean("stringRedisTemplate")
//	public StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//		// RedisTemplate<String, Object> template = new RedisTemplate<>();
//		StringRedisTemplate template = new StringRedisTemplate();
//		// 配置连接工厂
//		template.setConnectionFactory(connectionFactory);
//		return template;
//	}
}
