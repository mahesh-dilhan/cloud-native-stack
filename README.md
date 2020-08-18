# Spring Cloud Native Build Pack

In this repository 
* Discovery service setup
* Config server setup and bind with discovery first approach 
* Gateway service setup using config server and discovery service

```
mvn clean package
``` 

startup-order 
* Discovery 
* Config server
* Gateway service
* consumer 
* producer 


Eureka Registry
```
 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-18 18:50:16.040  INFO 8679 --- [           main] i.m.e.d.DiscoveryServiceApplication      : No active profile set, falling back to default profiles: default
2020-08-18 18:50:16.632  WARN 8679 --- [           main] o.s.boot.actuate.endpoint.EndpointId     : Endpoint ID 'service-registry' contains invalid characters, please migrate to a valid format.
2020-08-18 18:50:16.759  INFO 8679 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=d7ea7975-5d58-336f-a407-ad2bf977048a
2020-08-18 18:50:17.053  INFO 8679 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8761 (http)
2020-08-18 18:50:17.062  INFO 8679 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-08-18 18:50:17.062  INFO 8679 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-08-18 18:50:17.166  INFO 8679 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-08-18 18:50:17.166  INFO 8679 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1107 ms
2020-08-18 18:50:17.246  WARN 8679 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:50:17.246  INFO 8679 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:50:17.257  INFO 8679 --- [           main] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@2173a742
2020-08-18 18:50:17.618  INFO 8679 --- [           main] c.s.j.s.i.a.WebApplicationImpl           : Initiating Jersey application, version 'Jersey: 1.19.1 03/11/2016 02:08 PM'
2020-08-18 18:50:17.668  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2020-08-18 18:50:17.669  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.thoughtworks.xstream.core.util.Fields (file:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar) to field java.util.TreeMap.comparator
WARNING: Please consider reporting this to the maintainers of com.thoughtworks.xstream.core.util.Fields
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2020-08-18 18:50:17.810  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2020-08-18 18:50:17.810  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2020-08-18 18:50:18.167  WARN 8679 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:50:18.167  INFO 8679 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:50:18.372  INFO 8679 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-18 18:50:18.832  WARN 8679 --- [           main] ockingLoadBalancerClientRibbonWarnLogger : You already have RibbonLoadBalancerClient on your classpath. It will be used by default. As Spring Cloud Ribbon is in maintenance mode. We recommend switching to BlockingLoadBalancerClient instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:50:18.875  INFO 8679 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
2020-08-18 18:50:18.900  INFO 8679 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
2020-08-18 18:50:18.900  INFO 8679 --- [           main] com.netflix.discovery.DiscoveryClient    : Client configured to neither register nor query for data.
2020-08-18 18:50:18.906  INFO 8679 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1597747818905 with initial instances count: 0
2020-08-18 18:50:18.937  INFO 8679 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initializing ...
2020-08-18 18:50:18.938  INFO 8679 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Adding new peer nodes [http://localhost:8761/eureka/]
2020-08-18 18:50:19.188  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2020-08-18 18:50:19.188  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
2020-08-18 18:50:19.188  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2020-08-18 18:50:19.188  INFO 8679 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2020-08-18 18:50:19.264  INFO 8679 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Replica node URL:  http://localhost:8761/eureka/
2020-08-18 18:50:19.270  INFO 8679 --- [           main] c.n.e.registry.AbstractInstanceRegistry  : Finished initializing remote region registries. All known remote regions: []
2020-08-18 18:50:19.271  INFO 8679 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initialized
2020-08-18 18:50:19.283  INFO 8679 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-08-18 18:50:19.306  INFO 8679 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application REGISTRY with eureka with status UP
2020-08-18 18:50:19.308  INFO 8679 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Setting the eureka configuration..
2020-08-18 18:50:19.309  INFO 8679 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka data center value eureka.datacenter is not set, defaulting to default
2020-08-18 18:50:19.310  INFO 8679 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka environment value eureka.environment is not set, defaulting to test
2020-08-18 18:50:19.320  INFO 8679 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : isAws returned false
2020-08-18 18:50:19.321  INFO 8679 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Initialized server context
2020-08-18 18:50:19.321  INFO 8679 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Got 1 instances from neighboring DS node
2020-08-18 18:50:19.321  INFO 8679 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Renew threshold is: 1
2020-08-18 18:50:19.321  INFO 8679 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Changing status to UP
2020-08-18 18:50:19.329  INFO 8679 --- [      Thread-10] e.s.EurekaServerInitializerConfiguration : Started Eureka Server
2020-08-18 18:50:19.337  INFO 8679 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8761 (http) with context path ''
2020-08-18 18:50:19.338  INFO 8679 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8761
2020-08-18 18:50:19.354  INFO 8679 --- [           main] i.m.e.d.DiscoveryServiceApplication      : Started DiscoveryServiceApplication in 8.958 seconds (JVM running for 9.42)
2020-08-18 18:50:44.736  INFO 8679 --- [nio-8761-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-08-18 18:50:44.736  INFO 8679 --- [nio-8761-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-08-18 18:50:44.741  INFO 8679 --- [nio-8761-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 5 ms
2020-08-18 18:50:45.003  INFO 8679 --- [nio-8761-exec-2] c.n.e.registry.AbstractInstanceRegistry  : Registered instance CONFIG-SERVER/192.168.1.75:config-server:0 with status UP (replication=false)
2020-08-18 18:50:45.581  INFO 8679 --- [nio-8761-exec-3] c.n.e.registry.AbstractInstanceRegistry  : Registered instance CONFIG-SERVER/192.168.1.75:config-server:0 with status UP (replication=true)
2020-08-18 18:51:19.324  INFO 8679 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
2020-08-18 18:51:26.055  WARN 8679 --- [nio-8761-exec-5] c.n.e.registry.AbstractInstanceRegistry  : No remote registry available for the remote region us-east-1
2020-08-18 18:51:30.914  INFO 8679 --- [nio-8761-exec-8] c.n.e.registry.AbstractInstanceRegistry  : Registered instance PRODUCER-SERVICE/192.168.1.75:producer-service:0 with status UP (replication=false)
2020-08-18 18:51:31.428  INFO 8679 --- [nio-8761-exec-1] c.n.e.registry.AbstractInstanceRegistry  : Registered instance PRODUCER-SERVICE/192.168.1.75:producer-service:0 with status UP (replication=true)
2020-08-18 18:52:00.009  WARN 8679 --- [-CacheFillTimer] c.n.e.registry.AbstractInstanceRegistry  : No remote registry available for the remote region us-east-1

```
Config Server

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-18 18:50:41.503  INFO 8683 --- [           main] i.m.e.c.ConfigServerServiceApplication   : The following profiles are active: native
2020-08-18 18:50:42.224  WARN 8683 --- [           main] o.s.boot.actuate.endpoint.EndpointId     : Endpoint ID 'service-registry' contains invalid characters, please migrate to a valid format.
2020-08-18 18:50:42.344  INFO 8683 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=c413c286-896a-30ee-a823-9cfca5427c64
2020-08-18 18:50:42.610  INFO 8683 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2020-08-18 18:50:42.620  INFO 8683 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-08-18 18:50:42.620  INFO 8683 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-08-18 18:50:42.717  INFO 8683 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-08-18 18:50:42.717  INFO 8683 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1196 ms
2020-08-18 18:50:42.802  WARN 8683 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:50:42.802  INFO 8683 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:50:42.812  INFO 8683 --- [           main] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@5a4dda2
2020-08-18 18:50:42.915  WARN 8683 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:50:42.915  INFO 8683 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:50:43.226  INFO 8683 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-18 18:50:43.643  WARN 8683 --- [           main] ockingLoadBalancerClientRibbonWarnLogger : You already have RibbonLoadBalancerClient on your classpath. It will be used by default. As Spring Cloud Ribbon is in maintenance mode. We recommend switching to BlockingLoadBalancerClient instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:50:43.802  INFO 8683 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-08-18 18:50:43.850  INFO 8683 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 49515 (http) with context path ''
2020-08-18 18:50:43.851  INFO 8683 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 49515
2020-08-18 18:50:43.858  INFO 8683 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
2020-08-18 18:50:43.950  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
2020-08-18 18:50:44.124  INFO 8683 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2020-08-18 18:50:44.125  INFO 8683 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.thoughtworks.xstream.core.util.Fields (file:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar) to field java.util.TreeMap.comparator
WARNING: Please consider reporting this to the maintainers of com.thoughtworks.xstream.core.util.Fields
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2020-08-18 18:50:44.326  INFO 8683 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2020-08-18 18:50:44.326  INFO 8683 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2020-08-18 18:50:44.602  INFO 8683 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2020-08-18 18:50:44.618  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
2020-08-18 18:50:44.619  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
2020-08-18 18:50:44.826  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
2020-08-18 18:50:44.830  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 1
2020-08-18 18:50:44.835  INFO 8683 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
2020-08-18 18:50:44.850  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1597747844848 with initial instances count: 0
2020-08-18 18:50:44.853  INFO 8683 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application CONFIG-SERVER with eureka with status UP
2020-08-18 18:50:44.857  INFO 8683 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1597747844857, current=UP, previous=STARTING]
2020-08-18 18:50:44.869  INFO 8683 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_CONFIG-SERVER/192.168.1.75:config-server:0: registering service...
2020-08-18 18:50:44.921  INFO 8683 --- [           main] i.m.e.c.ConfigServerServiceApplication   : Started ConfigServerServiceApplication in 9.046 seconds (JVM running for 9.49)
2020-08-18 18:50:45.006  INFO 8683 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_CONFIG-SERVER/192.168.1.75:config-server:0 - registration status: 204
2020-08-18 18:51:14.832  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
2020-08-18 18:51:14.832  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
2020-08-18 18:51:14.832  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
2020-08-18 18:51:14.833  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
2020-08-18 18:51:14.833  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
2020-08-18 18:51:14.833  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: false
2020-08-18 18:51:14.833  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
2020-08-18 18:51:14.895  INFO 8683 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
2020-08-18 18:51:26.223  INFO 8683 --- [o-auto-1-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-08-18 18:51:26.223  INFO 8683 --- [o-auto-1-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-08-18 18:51:26.231  INFO 8683 --- [o-auto-1-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 8 ms
2020-08-18 18:51:26.312  INFO 8683 --- [o-auto-1-exec-1] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/service/producer-service.yml
2020-08-18 18:51:29.245  INFO 8683 --- [o-auto-1-exec-2] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/service/producer-service.yml
2020-08-18 18:55:44.629  INFO 8683 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2020-08-18 18:56:26.586  INFO 8683 --- [o-auto-1-exec-4] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/service/consumer-service.yml
2020-08-18 18:56:27.981  INFO 8683 --- [o-auto-1-exec-5] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/service/consumer-service.yml
2020-08-18 18:56:41.530  INFO 8683 --- [o-auto-1-exec-6] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/service/gateway.yml
2020-08-18 19:00:44.604  INFO 8683 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration

```
Consumer 

```
 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.1.RELEASE)

2020-08-18 18:56:26.550  INFO 8716 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://192.168.1.75:49515/
2020-08-18 18:56:26.590  INFO 8716 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=consumer-service, profiles=[default], label=null, version=null, state=null
2020-08-18 18:56:26.591  INFO 8716 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-classpath:/service/consumer-service.yml'}]
2020-08-18 18:56:26.622  INFO 8716 --- [           main] i.m.e.c.ConsumerServiceApplication       : No active profile set, falling back to default profiles: default
2020-08-18 18:56:27.236  INFO 8716 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=53e43357-5a49-3a3a-af45-45480e318380
2020-08-18 18:56:27.282  INFO 8716 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
2020-08-18 18:56:27.285  INFO 8716 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
2020-08-18 18:56:27.287  INFO 8716 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
2020-08-18 18:56:27.331  INFO 8716 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationChannelResolver' of type [org.springframework.integration.support.channel.BeanFactoryChannelResolver] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:27.333  INFO 8716 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationDisposableAutoCreatedBeans' of type [org.springframework.integration.config.annotation.Disposables] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:27.343  INFO 8716 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.integration.config.IntegrationManagementConfiguration' of type [org.springframework.integration.config.IntegrationManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:27.531  WARN 8716 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:56:27.531  INFO 8716 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:56:27.535  WARN 8716 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:56:27.535  INFO 8716 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:56:27.750  WARN 8716 --- [           main] ockingLoadBalancerClientRibbonWarnLogger : You already have RibbonLoadBalancerClient on your classpath. It will be used by default. As Spring Cloud Ribbon is in maintenance mode. We recommend switching to BlockingLoadBalancerClient instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:56:27.819  INFO 8716 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'taskScheduler'
2020-08-18 18:56:27.832  INFO 8716 --- [           main] onConfiguration$FunctionBindingRegistrar : Functional binding is disabled due to the presense of @EnableBinding annotation in your configuration
2020-08-18 18:56:27.920  INFO 8716 --- [           main] o.s.c.s.m.DirectWithAttributesChannel    : Channel 'consumer-service-1.input' has 1 subscriber(s).
2020-08-18 18:56:27.922  INFO 8716 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
2020-08-18 18:56:27.922  INFO 8716 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'consumer-service-1.errorChannel' has 1 subscriber(s).
2020-08-18 18:56:27.922  INFO 8716 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started bean '_org.springframework.integration.errorLogger'
2020-08-18 18:56:27.925  INFO 8716 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Creating binder: kafka
2020-08-18 18:56:27.950  INFO 8716 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://192.168.1.75:49515/
2020-08-18 18:56:27.983  INFO 8716 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=consumer-service, profiles=[default], label=null, version=null, state=null
2020-08-18 18:56:27.984  INFO 8716 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-classpath:/service/consumer-service.yml'}]
2020-08-18 18:56:28.124  INFO 8716 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Caching the binder: kafka
2020-08-18 18:56:28.124  INFO 8716 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Retrieving cached binder: kafka
2020-08-18 18:56:28.190  INFO 8716 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	bootstrap.servers = [http://localhost:9092]
	client.dns.lookup = default
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2020-08-18 18:56:28.312  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:56:28.313  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:56:28.314  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597748188311
2020-08-18 18:56:28.598  INFO 8716 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 100
	auto.offset.reset = earliest
	bootstrap.servers = [http://localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id = 
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = external-message-group-1
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.ByteArrayDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.ByteArrayDeserializer

2020-08-18 18:56:28.625  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:56:28.625  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:56:28.625  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597748188625
2020-08-18 18:56:28.631  INFO 8716 --- [           main] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-external-message-group-1-1, groupId=external-message-group-1] Cluster ID: MehXd5CVQeOtxXQR6yCaWg
2020-08-18 18:56:28.649  INFO 8716 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'external-message.external-message-group-1.errors' has 1 subscriber(s).
2020-08-18 18:56:28.650  INFO 8716 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'external-message.external-message-group-1.errors' has 0 subscriber(s).
2020-08-18 18:56:28.650  INFO 8716 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'external-message.external-message-group-1.errors' has 1 subscriber(s).
2020-08-18 18:56:28.650  INFO 8716 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'external-message.external-message-group-1.errors' has 2 subscriber(s).
2020-08-18 18:56:28.660  INFO 8716 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 100
	auto.offset.reset = earliest
	bootstrap.servers = [http://localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id = 
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = external-message-group-1
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.ByteArrayDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.ByteArrayDeserializer

2020-08-18 18:56:28.664  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:56:28.664  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:56:28.664  INFO 8716 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597748188664
2020-08-18 18:56:28.665  INFO 8716 --- [           main] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Subscribed to topic(s): external-message
2020-08-18 18:56:28.666  INFO 8716 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService
2020-08-18 18:56:28.670  INFO 8716 --- [           main] s.i.k.i.KafkaMessageDrivenChannelAdapter : started org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter@6e00d737
2020-08-18 18:56:28.678  INFO 8716 --- [container-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Cluster ID: MehXd5CVQeOtxXQR6yCaWg
2020-08-18 18:56:28.678  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Discovered group coordinator 192.168.1.75:9092 (id: 2147483647 rack: null)
2020-08-18 18:56:28.680  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] (Re-)joining group
2020-08-18 18:56:28.685  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Join group failed with org.apache.kafka.common.errors.MemberIdRequiredException: The group member needs to have a valid member id before actually entering a consumer group
2020-08-18 18:56:28.686  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] (Re-)joining group
2020-08-18 18:56:28.690  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Finished assignment for group at generation 9: {consumer-external-message-group-1-2-28489f3b-e73d-429b-ae7e-2ad66f820f0e=Assignment(partitions=[external-message-0])}
2020-08-18 18:56:28.692  INFO 8716 --- [           main] i.m.e.c.ConsumerServiceApplication       : Started ConsumerServiceApplication in 7.949 seconds (JVM running for 8.375)
2020-08-18 18:56:28.693  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Successfully joined group with generation 9
2020-08-18 18:56:28.696  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Adding newly assigned partitions: external-message-0
2020-08-18 18:56:28.702  INFO 8716 --- [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-external-message-group-1-2, groupId=external-message-group-1] Setting offset for partition external-message-0 to the committed offset FetchPosition{offset=5, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[192.168.1.75:9092 (id: 0 rack: null)], epoch=0}}
2020-08-18 18:56:28.703  INFO 8716 --- [container-0-C-1] o.s.c.s.b.k.KafkaMessageChannelBinder$1  : external-message-group-1: partitions assigned: [external-message-0]
2020-08-18 18:56:53.922  INFO 8716 --- [container-0-C-1] i.m.e.c.ConsumerServiceApplication       : {}ExternalMessage(msg=tharu)

```
Producer

```
/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=49521:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/mahesh/play/bundle/producer-service/target/classes:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.3.2.RELEASE/spring-boot-starter-actuator-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter/2.3.2.RELEASE/spring-boot-starter-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot/2.3.2.RELEASE/spring-boot-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.3.2.RELEASE/spring-boot-autoconfigure-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.3.2.RELEASE/spring-boot-starter-logging-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/mahesh/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/mahesh/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.13.3/log4j-to-slf4j-2.13.3.jar:/Users/mahesh/.m2/repository/org/apache/logging/log4j/log4j-api/2.13.3/log4j-api-2.13.3.jar:/Users/mahesh/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:/Users/mahesh/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/mahesh/.m2/repository/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.3.2.RELEASE/spring-boot-actuator-autoconfigure-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-actuator/2.3.2.RELEASE/spring-boot-actuator-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.1/jackson-datatype-jsr310-2.11.1.jar:/Users/mahesh/.m2/repository/io/micrometer/micrometer-core/1.5.3/micrometer-core-1.5.3.jar:/Users/mahesh/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.12/HdrHistogram-2.1.12.jar:/Users/mahesh/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-webflux/2.3.2.RELEASE/spring-boot-starter-webflux-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.3.2.RELEASE/spring-boot-starter-json-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.1/jackson-datatype-jdk8-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.1/jackson-module-parameter-names-2.11.1.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-reactor-netty/2.3.2.RELEASE/spring-boot-starter-reactor-netty-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/io/projectreactor/netty/reactor-netty/0.9.10.RELEASE/reactor-netty-0.9.10.RELEASE.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-http/4.1.51.Final/netty-codec-http-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-common/4.1.51.Final/netty-common-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-buffer/4.1.51.Final/netty-buffer-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport/4.1.51.Final/netty-transport-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec/4.1.51.Final/netty-codec-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-http2/4.1.51.Final/netty-codec-http2-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-handler/4.1.51.Final/netty-handler-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-resolver/4.1.51.Final/netty-resolver-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-handler-proxy/4.1.51.Final/netty-handler-proxy-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-socks/4.1.51.Final/netty-codec-socks-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport-native-epoll/4.1.51.Final/netty-transport-native-epoll-4.1.51.Final-linux-x86_64.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport-native-unix-common/4.1.51.Final/netty-transport-native-unix-common-4.1.51.Final.jar:/Users/mahesh/.m2/repository/org/springframework/spring-web/5.2.8.RELEASE/spring-web-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-beans/5.2.8.RELEASE/spring-beans-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-webflux/5.2.8.RELEASE/spring-webflux-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/synchronoss/cloud/nio-multipart-parser/1.1.0/nio-multipart-parser-1.1.0.jar:/Users/mahesh/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/Users/mahesh/.m2/repository/org/synchronoss/cloud/nio-stream-storage/1.1.3/nio-stream-storage-1.1.3.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-config/2.2.4.RELEASE/spring-cloud-starter-config-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter/2.2.4.RELEASE/spring-cloud-starter-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-context/2.2.4.RELEASE/spring-cloud-context-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/security/spring-security-crypto/5.3.3.RELEASE/spring-security-crypto-5.3.3.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-commons/2.2.4.RELEASE/spring-cloud-commons-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/security/spring-security-rsa/1.0.9.RELEASE/spring-security-rsa-1.0.9.RELEASE.jar:/Users/mahesh/.m2/repository/org/bouncycastle/bcpkix-jdk15on/1.64/bcpkix-jdk15on-1.64.jar:/Users/mahesh/.m2/repository/org/bouncycastle/bcprov-jdk15on/1.64/bcprov-jdk15on-1.64.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-config-client/2.2.4.RELEASE/spring-cloud-config-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.11.1/jackson-annotations-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.11.1/jackson-databind-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.11.1/jackson-core-2.11.1.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-eureka-client/2.2.4.RELEASE/spring-cloud-starter-netflix-eureka-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-hystrix/2.2.4.RELEASE/spring-cloud-netflix-hystrix-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.3.2.RELEASE/spring-boot-starter-aop-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-eureka-client/2.2.4.RELEASE/spring-cloud-netflix-eureka-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/com/netflix/eureka/eureka-client/1.9.25/eureka-client-1.9.25.jar:/Users/mahesh/.m2/repository/org/codehaus/jettison/jettison/1.3.7/jettison-1.3.7.jar:/Users/mahesh/.m2/repository/stax/stax-api/1.0.1/stax-api-1.0.1.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-eventbus/0.3.0/netflix-eventbus-0.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-infix/0.3.0/netflix-infix-0.3.0.jar:/Users/mahesh/.m2/repository/commons-jxpath/commons-jxpath/1.3/commons-jxpath-1.3.jar:/Users/mahesh/.m2/repository/joda-time/joda-time/2.3/joda-time-2.3.jar:/Users/mahesh/.m2/repository/org/antlr/antlr-runtime/3.4/antlr-runtime-3.4.jar:/Users/mahesh/.m2/repository/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.jar:/Users/mahesh/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/mahesh/.m2/repository/com/google/code/gson/gson/2.8.6/gson-2.8.6.jar:/Users/mahesh/.m2/repository/org/apache/commons/commons-math/2.2/commons-math-2.2.jar:/Users/mahesh/.m2/repository/com/netflix/archaius/archaius-core/0.7.6/archaius-core-0.7.6.jar:/Users/mahesh/.m2/repository/com/google/guava/guava/29.0-jre/guava-29.0-jre.jar:/Users/mahesh/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:/Users/mahesh/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/mahesh/.m2/repository/org/checkerframework/checker-qual/2.11.1/checker-qual-2.11.1.jar:/Users/mahesh/.m2/repository/com/google/errorprone/error_prone_annotations/2.3.4/error_prone_annotations-2.3.4.jar:/Users/mahesh/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:/Users/mahesh/.m2/repository/javax/ws/rs/jsr311-api/1.1.1/jsr311-api-1.1.1.jar:/Users/mahesh/.m2/repository/com/netflix/servo/servo-core/0.12.21/servo-core-0.12.21.jar:/Users/mahesh/.m2/repository/com/sun/jersey/jersey-core/1.19.1/jersey-core-1.19.1.jar:/Users/mahesh/.m2/repository/com/sun/jersey/jersey-client/1.19.1/jersey-client-1.19.1.jar:/Users/mahesh/.m2/repository/com/sun/jersey/contribs/jersey-apache-client4/1.19.1/jersey-apache-client4-1.19.1.jar:/Users/mahesh/.m2/repository/org/apache/httpcomponents/httpclient/4.5.12/httpclient-4.5.12.jar:/Users/mahesh/.m2/repository/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar:/Users/mahesh/.m2/repository/commons-codec/commons-codec/1.14/commons-codec-1.14.jar:/Users/mahesh/.m2/repository/commons-configuration/commons-configuration/1.10/commons-configuration-1.10.jar:/Users/mahesh/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar:/Users/mahesh/.m2/repository/com/google/inject/guice/4.1.0/guice-4.1.0.jar:/Users/mahesh/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:/Users/mahesh/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/Users/mahesh/.m2/repository/com/netflix/eureka/eureka-core/1.9.25/eureka-core-1.9.25.jar:/Users/mahesh/.m2/repository/com/fasterxml/woodstox/woodstox-core/5.3.0/woodstox-core-5.3.0.jar:/Users/mahesh/.m2/repository/org/codehaus/woodstox/stax2-api/4.2/stax2-api-4.2.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-archaius/2.2.4.RELEASE/spring-cloud-starter-netflix-archaius-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-ribbon/2.2.4.RELEASE/spring-cloud-netflix-ribbon-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-archaius/2.2.4.RELEASE/spring-cloud-netflix-archaius-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-ribbon/2.2.4.RELEASE/spring-cloud-starter-netflix-ribbon-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon/2.3.0/ribbon-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-transport/2.3.0/ribbon-transport-2.3.0.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty-contexts/0.4.9/rxnetty-contexts-0.4.9.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty-servo/0.4.9/rxnetty-servo-0.4.9.jar:/Users/mahesh/.m2/repository/com/netflix/hystrix/hystrix-core/1.5.18/hystrix-core-1.5.18.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty/0.4.9/rxnetty-0.4.9.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-core/2.3.0/ribbon-core-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-httpclient/2.3.0/ribbon-httpclient-2.3.0.jar:/Users/mahesh/.m2/repository/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-commons-util/0.3.0/netflix-commons-util-0.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-loadbalancer/2.3.0/ribbon-loadbalancer-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-statistics/0.1.1/netflix-statistics-0.1.1.jar:/Users/mahesh/.m2/repository/io/reactivex/rxjava/1.3.8/rxjava-1.3.8.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-loadbalancer/2.2.4.RELEASE/spring-cloud-starter-loadbalancer-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-loadbalancer/2.2.4.RELEASE/spring-cloud-loadbalancer-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/io/projectreactor/addons/reactor-extra/3.3.3.RELEASE/reactor-extra-3.3.3.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-cache/2.3.2.RELEASE/spring-boot-starter-cache-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-context-support/5.2.8.RELEASE/spring-context-support-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/com/stoyanr/evictor/1.0.0/evictor-1.0.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-eureka/2.3.0/ribbon-eureka-2.3.0.jar:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar:/Users/mahesh/.m2/repository/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar:/Users/mahesh/.m2/repository/xpp3/xpp3_min/1.1.4c/xpp3_min-1.1.4c.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-stream/3.0.7.RELEASE/spring-cloud-stream-3.0.7.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.3.2.RELEASE/spring-boot-starter-validation-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/glassfish/jakarta.el/3.0.3/jakarta.el-3.0.3.jar:/Users/mahesh/.m2/repository/org/hibernate/validator/hibernate-validator/6.1.5.Final/hibernate-validator-6.1.5.Final.jar:/Users/mahesh/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:/Users/mahesh/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/Users/mahesh/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/Users/mahesh/.m2/repository/org/springframework/spring-messaging/5.2.8.RELEASE/spring-messaging-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/integration/spring-integration-core/5.3.2.RELEASE/spring-integration-core-5.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-aop/5.2.8.RELEASE/spring-aop-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/integration/spring-integration-jmx/5.3.2.RELEASE/spring-integration-jmx-5.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/retry/spring-retry/1.2.5.RELEASE/spring-retry-1.2.5.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-function-context/3.0.9.RELEASE/spring-cloud-function-context-3.0.9.RELEASE.jar:/Users/mahesh/.m2/repository/net/jodah/typetools/0.6.2/typetools-0.6.2.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-function-core/3.0.9.RELEASE/spring-cloud-function-core-3.0.9.RELEASE.jar:/Users/mahesh/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-stream-binder-kafka/3.0.7.RELEASE/spring-cloud-stream-binder-kafka-3.0.7.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-stream-binder-kafka-core/3.0.7.RELEASE/spring-cloud-stream-binder-kafka-core-3.0.7.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/integration/spring-integration-kafka/3.2.1.RELEASE/spring-integration-kafka-3.2.1.RELEASE.jar:/Users/mahesh/.m2/repository/org/apache/kafka/kafka-clients/2.5.0/kafka-clients-2.5.0.jar:/Users/mahesh/.m2/repository/com/github/luben/zstd-jni/1.4.4-7/zstd-jni-1.4.4-7.jar:/Users/mahesh/.m2/repository/org/lz4/lz4-java/1.7.1/lz4-java-1.7.1.jar:/Users/mahesh/.m2/repository/org/xerial/snappy/snappy-java/1.1.7.3/snappy-java-1.1.7.3.jar:/Users/mahesh/.m2/repository/org/springframework/kafka/spring-kafka/2.5.4.RELEASE/spring-kafka-2.5.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-context/5.2.8.RELEASE/spring-context-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-expression/5.2.8.RELEASE/spring-expression-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-tx/5.2.8.RELEASE/spring-tx-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/projectlombok/lombok/1.18.12/lombok-1.18.12.jar:/Users/mahesh/.m2/repository/org/springframework/spring-core/5.2.8.RELEASE/spring-core-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-jcl/5.2.8.RELEASE/spring-jcl-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/io/projectreactor/reactor-core/3.3.8.RELEASE/reactor-core-3.3.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar io.ms.eventdriven.producerservice.ProducerServiceApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-18 18:51:26.165  INFO 8695 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://192.168.1.75:49515/
2020-08-18 18:51:26.336  INFO 8695 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=producer-service, profiles=[default], label=null, version=null, state=null
2020-08-18 18:51:26.337  INFO 8695 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-classpath:/service/producer-service.yml'}]
2020-08-18 18:51:26.394  INFO 8695 --- [           main] i.m.e.p.ProducerServiceApplication       : No active profile set, falling back to default profiles: default
2020-08-18 18:51:27.168  WARN 8695 --- [           main] o.s.boot.actuate.endpoint.EndpointId     : Endpoint ID 'service-registry' contains invalid characters, please migrate to a valid format.
2020-08-18 18:51:27.298  INFO 8695 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=a30611eb-bcfc-3933-b203-0038b8aa8f4c
2020-08-18 18:51:27.304  INFO 8695 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
2020-08-18 18:51:27.307  INFO 8695 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
2020-08-18 18:51:27.309  INFO 8695 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
2020-08-18 18:51:27.382  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationChannelResolver' of type [org.springframework.integration.support.channel.BeanFactoryChannelResolver] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.384  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationDisposableAutoCreatedBeans' of type [org.springframework.integration.config.annotation.Disposables] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.399  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.integration.config.IntegrationManagementConfiguration' of type [org.springframework.integration.config.IntegrationManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.404  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration' of type [org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.406  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration$ReactiveLoadBalancerConfig' of type [org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration$ReactiveLoadBalancerConfig] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.406  INFO 8695 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'deferringLoadBalancerExchangeFilterFunction' of type [org.springframework.cloud.client.loadbalancer.reactive.DeferringLoadBalancerExchangeFilterFunction] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:51:27.776  WARN 8695 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:51:27.776  INFO 8695 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:51:27.783  WARN 8695 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:51:27.783  INFO 8695 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:51:28.474  INFO 8695 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-08-18 18:51:28.844  INFO 8695 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'taskScheduler'
2020-08-18 18:51:28.856  INFO 8695 --- [           main] onConfiguration$FunctionBindingRegistrar : Functional binding is disabled due to the presense of @EnableBinding annotation in your configuration
2020-08-18 18:51:29.076  WARN 8695 --- [           main] ockingLoadBalancerClientRibbonWarnLogger : You already have RibbonLoadBalancerClient on your classpath. It will be used by default. As Spring Cloud Ribbon is in maintenance mode. We recommend switching to BlockingLoadBalancerClient instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:51:29.088  WARN 8695 --- [           main] eactorLoadBalancerClientRibbonWarnLogger : You have RibbonLoadBalancerClient on your classpath. LoadBalancerExchangeFilterFunction that uses it under the hood will be used by default. Spring Cloud Ribbon is now in maintenance mode, so we suggest switching to ReactorLoadBalancerExchangeFilterFunction instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:51:29.193  INFO 8695 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
2020-08-18 18:51:29.193  INFO 8695 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'producer-service-1.errorChannel' has 1 subscriber(s).
2020-08-18 18:51:29.193  INFO 8695 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started bean '_org.springframework.integration.errorLogger'
2020-08-18 18:51:29.194  INFO 8695 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Creating binder: kafka
2020-08-18 18:51:29.221  INFO 8695 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://192.168.1.75:49515/
2020-08-18 18:51:29.248  INFO 8695 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=producer-service, profiles=[default], label=null, version=null, state=null
2020-08-18 18:51:29.248  INFO 8695 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-classpath:/service/producer-service.yml'}]
2020-08-18 18:51:29.491  INFO 8695 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Caching the binder: kafka
2020-08-18 18:51:29.491  INFO 8695 --- [           main] o.s.c.s.binder.DefaultBinderFactory      : Retrieving cached binder: kafka
2020-08-18 18:51:29.589  INFO 8695 --- [           main] o.s.c.s.b.k.p.KafkaTopicProvisioner      : Using kafka topic for outbound: external-message
2020-08-18 18:51:29.592  INFO 8695 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	bootstrap.servers = [http://localhost:9092]
	client.dns.lookup = default
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2020-08-18 18:51:29.758  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:51:29.760  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:51:29.760  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597747889756
2020-08-18 18:51:30.125  INFO 8695 --- [           main] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = 1
	batch.size = 16384
	bootstrap.servers = [http://localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = default
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = false
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.ByteArraySerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 0
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.ByteArraySerializer

2020-08-18 18:51:30.145  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:51:30.145  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:51:30.145  INFO 8695 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597747890145
2020-08-18 18:51:30.150  INFO 8695 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: MehXd5CVQeOtxXQR6yCaWg
2020-08-18 18:51:30.163  INFO 8695 --- [           main] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-1] Closing the Kafka producer with timeoutMillis = 30000 ms.
2020-08-18 18:51:30.175  INFO 8695 --- [           main] o.s.c.s.m.DirectWithAttributesChannel    : Channel 'producer-service-1.output' has 1 subscriber(s).
2020-08-18 18:51:30.289  INFO 8695 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 49533
2020-08-18 18:51:30.290  INFO 8695 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 49533
2020-08-18 18:51:30.294  INFO 8695 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
2020-08-18 18:51:30.329  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
2020-08-18 18:51:30.531  INFO 8695 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2020-08-18 18:51:30.531  INFO 8695 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.thoughtworks.xstream.core.util.Fields (file:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar) to field java.util.TreeMap.comparator
WARNING: Please consider reporting this to the maintainers of com.thoughtworks.xstream.core.util.Fields
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2020-08-18 18:51:30.658  INFO 8695 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2020-08-18 18:51:30.658  INFO 8695 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2020-08-18 18:51:30.757  INFO 8695 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2020-08-18 18:51:30.769  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
2020-08-18 18:51:30.769  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
2020-08-18 18:51:30.769  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
2020-08-18 18:51:30.770  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
2020-08-18 18:51:30.770  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
2020-08-18 18:51:30.770  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
2020-08-18 18:51:30.770  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
2020-08-18 18:51:30.854  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
2020-08-18 18:51:30.856  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
2020-08-18 18:51:30.858  INFO 8695 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
2020-08-18 18:51:30.862  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1597747890861 with initial instances count: 1
2020-08-18 18:51:30.864  INFO 8695 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application PRODUCER-SERVICE with eureka with status UP
2020-08-18 18:51:30.865  INFO 8695 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1597747890865, current=UP, previous=STARTING]
2020-08-18 18:51:30.867  INFO 8695 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_PRODUCER-SERVICE/192.168.1.75:producer-service:0: registering service...
2020-08-18 18:51:30.902  INFO 8695 --- [           main] i.m.e.p.ProducerServiceApplication       : Started ProducerServiceApplication in 10.657 seconds (JVM running for 11.281)
2020-08-18 18:51:30.916  INFO 8695 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_PRODUCER-SERVICE/192.168.1.75:producer-service:0 - registration status: 204
2020-08-18 18:56:30.778  INFO 8695 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2020-08-18 18:56:53.808  INFO 8695 --- [ctor-http-nio-2] i.m.e.p.SendMessageController            : ExternalMessage(msg=tharu)
2020-08-18 18:56:53.823  INFO 8695 --- [ctor-http-nio-2] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = 1
	batch.size = 16384
	bootstrap.servers = [http://localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = default
	client.id = producer-2
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = false
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.ByteArraySerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 0
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.ByteArraySerializer

2020-08-18 18:56:53.827  INFO 8695 --- [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-18 18:56:53.828  INFO 8695 --- [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-18 18:56:53.828  INFO 8695 --- [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597748213827
2020-08-18 18:56:53.831  INFO 8695 --- [ad | producer-2] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-2] Cluster ID: MehXd5CVQeOtxXQR6yCaWg
2020-08-18 19:01:30.755  INFO 8695 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration

```
Gateway
```
/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=49681:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/mahesh/play/bundle/gateway-service/target/classes:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.3.2.RELEASE/spring-boot-starter-actuator-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter/2.3.2.RELEASE/spring-boot-starter-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot/2.3.2.RELEASE/spring-boot-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-context/5.2.8.RELEASE/spring-context-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-expression/5.2.8.RELEASE/spring-expression-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.3.2.RELEASE/spring-boot-autoconfigure-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.3.2.RELEASE/spring-boot-starter-logging-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/mahesh/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/mahesh/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.13.3/log4j-to-slf4j-2.13.3.jar:/Users/mahesh/.m2/repository/org/apache/logging/log4j/log4j-api/2.13.3/log4j-api-2.13.3.jar:/Users/mahesh/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:/Users/mahesh/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/mahesh/.m2/repository/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.3.2.RELEASE/spring-boot-actuator-autoconfigure-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-actuator/2.3.2.RELEASE/spring-boot-actuator-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.1/jackson-datatype-jsr310-2.11.1.jar:/Users/mahesh/.m2/repository/io/micrometer/micrometer-core/1.5.3/micrometer-core-1.5.3.jar:/Users/mahesh/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.12/HdrHistogram-2.1.12.jar:/Users/mahesh/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-config/2.2.4.RELEASE/spring-cloud-starter-config-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter/2.2.4.RELEASE/spring-cloud-starter-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-context/2.2.4.RELEASE/spring-cloud-context-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/security/spring-security-crypto/5.3.3.RELEASE/spring-security-crypto-5.3.3.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-commons/2.2.4.RELEASE/spring-cloud-commons-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/security/spring-security-rsa/1.0.9.RELEASE/spring-security-rsa-1.0.9.RELEASE.jar:/Users/mahesh/.m2/repository/org/bouncycastle/bcpkix-jdk15on/1.64/bcpkix-jdk15on-1.64.jar:/Users/mahesh/.m2/repository/org/bouncycastle/bcprov-jdk15on/1.64/bcprov-jdk15on-1.64.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-config-client/2.2.4.RELEASE/spring-cloud-config-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-web/5.2.8.RELEASE/spring-web-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-beans/5.2.8.RELEASE/spring-beans-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.11.1/jackson-annotations-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.11.1/jackson-databind-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.11.1/jackson-core-2.11.1.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-gateway/2.2.4.RELEASE/spring-cloud-starter-gateway-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-gateway-core/2.2.4.RELEASE/spring-cloud-gateway-core-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.3.2.RELEASE/spring-boot-starter-validation-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/glassfish/jakarta.el/3.0.3/jakarta.el-3.0.3.jar:/Users/mahesh/.m2/repository/org/hibernate/validator/hibernate-validator/6.1.5.Final/hibernate-validator-6.1.5.Final.jar:/Users/mahesh/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:/Users/mahesh/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/Users/mahesh/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/Users/mahesh/.m2/repository/io/projectreactor/addons/reactor-extra/3.3.3.RELEASE/reactor-extra-3.3.3.RELEASE.jar:/Users/mahesh/.m2/repository/io/projectreactor/reactor-core/3.3.8.RELEASE/reactor-core-3.3.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-webflux/2.3.2.RELEASE/spring-boot-starter-webflux-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.3.2.RELEASE/spring-boot-starter-json-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.1/jackson-datatype-jdk8-2.11.1.jar:/Users/mahesh/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.1/jackson-module-parameter-names-2.11.1.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-reactor-netty/2.3.2.RELEASE/spring-boot-starter-reactor-netty-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/io/projectreactor/netty/reactor-netty/0.9.10.RELEASE/reactor-netty-0.9.10.RELEASE.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-http/4.1.51.Final/netty-codec-http-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-common/4.1.51.Final/netty-common-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-buffer/4.1.51.Final/netty-buffer-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport/4.1.51.Final/netty-transport-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec/4.1.51.Final/netty-codec-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-http2/4.1.51.Final/netty-codec-http2-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-handler/4.1.51.Final/netty-handler-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-resolver/4.1.51.Final/netty-resolver-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-handler-proxy/4.1.51.Final/netty-handler-proxy-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-codec-socks/4.1.51.Final/netty-codec-socks-4.1.51.Final.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport-native-epoll/4.1.51.Final/netty-transport-native-epoll-4.1.51.Final-linux-x86_64.jar:/Users/mahesh/.m2/repository/io/netty/netty-transport-native-unix-common/4.1.51.Final/netty-transport-native-unix-common-4.1.51.Final.jar:/Users/mahesh/.m2/repository/org/springframework/spring-webflux/5.2.8.RELEASE/spring-webflux-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/synchronoss/cloud/nio-multipart-parser/1.1.0/nio-multipart-parser-1.1.0.jar:/Users/mahesh/.m2/repository/org/synchronoss/cloud/nio-stream-storage/1.1.3/nio-stream-storage-1.1.3.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-eureka-client/2.2.4.RELEASE/spring-cloud-starter-netflix-eureka-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-hystrix/2.2.4.RELEASE/spring-cloud-netflix-hystrix-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.3.2.RELEASE/spring-boot-starter-aop-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-aop/5.2.8.RELEASE/spring-aop-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-eureka-client/2.2.4.RELEASE/spring-cloud-netflix-eureka-client-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/com/netflix/eureka/eureka-client/1.9.25/eureka-client-1.9.25.jar:/Users/mahesh/.m2/repository/org/codehaus/jettison/jettison/1.3.7/jettison-1.3.7.jar:/Users/mahesh/.m2/repository/stax/stax-api/1.0.1/stax-api-1.0.1.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-eventbus/0.3.0/netflix-eventbus-0.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-infix/0.3.0/netflix-infix-0.3.0.jar:/Users/mahesh/.m2/repository/commons-jxpath/commons-jxpath/1.3/commons-jxpath-1.3.jar:/Users/mahesh/.m2/repository/joda-time/joda-time/2.3/joda-time-2.3.jar:/Users/mahesh/.m2/repository/org/antlr/antlr-runtime/3.4/antlr-runtime-3.4.jar:/Users/mahesh/.m2/repository/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.jar:/Users/mahesh/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/mahesh/.m2/repository/com/google/code/gson/gson/2.8.6/gson-2.8.6.jar:/Users/mahesh/.m2/repository/org/apache/commons/commons-math/2.2/commons-math-2.2.jar:/Users/mahesh/.m2/repository/com/netflix/archaius/archaius-core/0.7.6/archaius-core-0.7.6.jar:/Users/mahesh/.m2/repository/com/google/guava/guava/29.0-jre/guava-29.0-jre.jar:/Users/mahesh/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:/Users/mahesh/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/mahesh/.m2/repository/org/checkerframework/checker-qual/2.11.1/checker-qual-2.11.1.jar:/Users/mahesh/.m2/repository/com/google/errorprone/error_prone_annotations/2.3.4/error_prone_annotations-2.3.4.jar:/Users/mahesh/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:/Users/mahesh/.m2/repository/javax/ws/rs/jsr311-api/1.1.1/jsr311-api-1.1.1.jar:/Users/mahesh/.m2/repository/com/netflix/servo/servo-core/0.12.21/servo-core-0.12.21.jar:/Users/mahesh/.m2/repository/com/sun/jersey/jersey-core/1.19.1/jersey-core-1.19.1.jar:/Users/mahesh/.m2/repository/com/sun/jersey/jersey-client/1.19.1/jersey-client-1.19.1.jar:/Users/mahesh/.m2/repository/com/sun/jersey/contribs/jersey-apache-client4/1.19.1/jersey-apache-client4-1.19.1.jar:/Users/mahesh/.m2/repository/org/apache/httpcomponents/httpclient/4.5.12/httpclient-4.5.12.jar:/Users/mahesh/.m2/repository/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar:/Users/mahesh/.m2/repository/commons-codec/commons-codec/1.14/commons-codec-1.14.jar:/Users/mahesh/.m2/repository/commons-configuration/commons-configuration/1.10/commons-configuration-1.10.jar:/Users/mahesh/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar:/Users/mahesh/.m2/repository/com/google/inject/guice/4.1.0/guice-4.1.0.jar:/Users/mahesh/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:/Users/mahesh/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/Users/mahesh/.m2/repository/com/netflix/eureka/eureka-core/1.9.25/eureka-core-1.9.25.jar:/Users/mahesh/.m2/repository/com/fasterxml/woodstox/woodstox-core/5.3.0/woodstox-core-5.3.0.jar:/Users/mahesh/.m2/repository/org/codehaus/woodstox/stax2-api/4.2/stax2-api-4.2.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-archaius/2.2.4.RELEASE/spring-cloud-starter-netflix-archaius-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-ribbon/2.2.4.RELEASE/spring-cloud-netflix-ribbon-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-netflix-archaius/2.2.4.RELEASE/spring-cloud-netflix-archaius-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-netflix-ribbon/2.2.4.RELEASE/spring-cloud-starter-netflix-ribbon-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon/2.3.0/ribbon-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-transport/2.3.0/ribbon-transport-2.3.0.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty-contexts/0.4.9/rxnetty-contexts-0.4.9.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty-servo/0.4.9/rxnetty-servo-0.4.9.jar:/Users/mahesh/.m2/repository/com/netflix/hystrix/hystrix-core/1.5.18/hystrix-core-1.5.18.jar:/Users/mahesh/.m2/repository/io/reactivex/rxnetty/0.4.9/rxnetty-0.4.9.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-core/2.3.0/ribbon-core-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-httpclient/2.3.0/ribbon-httpclient-2.3.0.jar:/Users/mahesh/.m2/repository/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-commons-util/0.3.0/netflix-commons-util-0.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-loadbalancer/2.3.0/ribbon-loadbalancer-2.3.0.jar:/Users/mahesh/.m2/repository/com/netflix/netflix-commons/netflix-statistics/0.1.1/netflix-statistics-0.1.1.jar:/Users/mahesh/.m2/repository/io/reactivex/rxjava/1.3.8/rxjava-1.3.8.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-starter-loadbalancer/2.2.4.RELEASE/spring-cloud-starter-loadbalancer-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/cloud/spring-cloud-loadbalancer/2.2.4.RELEASE/spring-cloud-loadbalancer-2.2.4.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/boot/spring-boot-starter-cache/2.3.2.RELEASE/spring-boot-starter-cache-2.3.2.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-context-support/5.2.8.RELEASE/spring-context-support-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/com/stoyanr/evictor/1.0.0/evictor-1.0.0.jar:/Users/mahesh/.m2/repository/com/netflix/ribbon/ribbon-eureka/2.3.0/ribbon-eureka-2.3.0.jar:/Users/mahesh/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar:/Users/mahesh/.m2/repository/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar:/Users/mahesh/.m2/repository/xpp3/xpp3_min/1.1.4c/xpp3_min-1.1.4c.jar:/Users/mahesh/.m2/repository/org/projectlombok/lombok/1.18.12/lombok-1.18.12.jar:/Users/mahesh/.m2/repository/org/springframework/spring-core/5.2.8.RELEASE/spring-core-5.2.8.RELEASE.jar:/Users/mahesh/.m2/repository/org/springframework/spring-jcl/5.2.8.RELEASE/spring-jcl-5.2.8.RELEASE.jar io.ms.eventdriven.gatewayservice.GatewayServiceApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-18 18:56:41.494  INFO 8723 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://192.168.1.75:49515/
2020-08-18 18:56:41.533  INFO 8723 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=gateway, profiles=[default], label=null, version=null, state=null
2020-08-18 18:56:41.533  INFO 8723 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-classpath:/service/gateway.yml'}]
2020-08-18 18:56:41.538  INFO 8723 --- [           main] i.m.e.g.GatewayServiceApplication        : No active profile set, falling back to default profiles: default
2020-08-18 18:56:42.090  WARN 8723 --- [           main] o.s.boot.actuate.endpoint.EndpointId     : Endpoint ID 'service-registry' contains invalid characters, please migrate to a valid format.
2020-08-18 18:56:42.170  INFO 8723 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=cb7cff03-8fb4-3295-8b97-e3c6c6645e88
2020-08-18 18:56:42.237  INFO 8723 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration' of type [org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:42.239  INFO 8723 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration$ReactiveLoadBalancerConfig' of type [org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerBeanPostProcessorAutoConfiguration$ReactiveLoadBalancerConfig] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:42.239  INFO 8723 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'deferringLoadBalancerExchangeFilterFunction' of type [org.springframework.cloud.client.loadbalancer.reactive.DeferringLoadBalancerExchangeFilterFunction] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-08-18 18:56:42.340  WARN 8723 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:56:42.341  INFO 8723 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:56:42.345  WARN 8723 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2020-08-18 18:56:42.345  INFO 8723 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [After]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Before]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Between]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Cookie]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Header]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Host]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Method]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Path]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Query]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [ReadBodyPredicateFactory]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [RemoteAddr]
2020-08-18 18:56:42.829  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Weight]
2020-08-18 18:56:42.830  INFO 8723 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2020-08-18 18:56:43.123  INFO 8723 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-08-18 18:56:43.273  WARN 8723 --- [           main] ockingLoadBalancerClientRibbonWarnLogger : You already have RibbonLoadBalancerClient on your classpath. It will be used by default. As Spring Cloud Ribbon is in maintenance mode. We recommend switching to BlockingLoadBalancerClient instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:56:43.282  WARN 8723 --- [           main] eactorLoadBalancerClientRibbonWarnLogger : You have RibbonLoadBalancerClient on your classpath. LoadBalancerExchangeFilterFunction that uses it under the hood will be used by default. Spring Cloud Ribbon is now in maintenance mode, so we suggest switching to ReactorLoadBalancerExchangeFilterFunction instead. In order to use it, set the value of `spring.cloud.loadbalancer.ribbon.enabled` to `false` or remove spring-cloud-starter-netflix-ribbon from your project.
2020-08-18 18:56:43.325  INFO 8723 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
2020-08-18 18:56:43.398  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
2020-08-18 18:56:43.555  INFO 8723 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2020-08-18 18:56:43.555  INFO 8723 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.thoughtworks.xstream.core.util.Fields (file:/Users/mahesh/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar) to field java.util.TreeMap.comparator
WARNING: Please consider reporting this to the maintainers of com.thoughtworks.xstream.core.util.Fields
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2020-08-18 18:56:43.674  INFO 8723 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2020-08-18 18:56:43.675  INFO 8723 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2020-08-18 18:56:43.789  INFO 8723 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
2020-08-18 18:56:43.807  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
2020-08-18 18:56:43.926  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
2020-08-18 18:56:43.929  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
2020-08-18 18:56:43.931  INFO 8723 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
2020-08-18 18:56:43.935  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1597748203934 with initial instances count: 2
2020-08-18 18:56:43.936  INFO 8723 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application GATEWAY with eureka with status UP
2020-08-18 18:56:43.937  INFO 8723 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1597748203937, current=UP, previous=STARTING]
2020-08-18 18:56:43.939  INFO 8723 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_GATEWAY/192.168.1.75:gateway:4000: registering service...
2020-08-18 18:56:43.961  INFO 8723 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_GATEWAY/192.168.1.75:gateway:4000 - registration status: 204
2020-08-18 18:56:44.172  INFO 8723 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 4000
2020-08-18 18:56:44.173  INFO 8723 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 4000
2020-08-18 18:56:44.194  INFO 8723 --- [           main] i.m.e.g.GatewayServiceApplication        : Started GatewayServiceApplication in 8.614 seconds (JVM running for 9.037)
2020-08-18 18:56:53.580  INFO 8723 --- [ctor-http-nio-2] c.netflix.config.ChainedDynamicProperty  : Flipping property: PRODUCER-SERVICE.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2020-08-18 18:56:53.599  INFO 8723 --- [ctor-http-nio-2] c.n.u.concurrent.ShutdownEnabledTimer    : Shutdown hook installed for: NFLoadBalancer-PingTimer-PRODUCER-SERVICE
2020-08-18 18:56:53.600  INFO 8723 --- [ctor-http-nio-2] c.netflix.loadbalancer.BaseLoadBalancer  : Client: PRODUCER-SERVICE instantiated a LoadBalancer: DynamicServerListLoadBalancer:{NFLoadBalancer:name=PRODUCER-SERVICE,current list of Servers=[],Load balancer stats=Zone stats: {},Server stats: []}ServerList:null
2020-08-18 18:56:53.604  INFO 8723 --- [ctor-http-nio-2] c.n.l.DynamicServerListLoadBalancer      : Using serverListUpdater PollingServerListUpdater
2020-08-18 18:56:53.620  INFO 8723 --- [ctor-http-nio-2] c.netflix.config.ChainedDynamicProperty  : Flipping property: PRODUCER-SERVICE.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2020-08-18 18:56:53.621  INFO 8723 --- [ctor-http-nio-2] c.n.l.DynamicServerListLoadBalancer      : DynamicServerListLoadBalancer for client PRODUCER-SERVICE initialized: DynamicServerListLoadBalancer:{NFLoadBalancer:name=PRODUCER-SERVICE,current list of Servers=[192.168.1.75:49533],Load balancer stats=Zone stats: {defaultzone=[Zone:defaultzone;	Instance count:1;	Active connections count: 0;	Circuit breaker tripped count: 0;	Active connections per server: 0.0;]
},Server stats: [[Server:192.168.1.75:49533;	Zone:defaultZone;	Total Requests:0;	Successive connection failure:0;	Total blackout seconds:0;	Last connection made:Thu Jan 01 07:30:00 SGT 1970;	First connection made: Thu Jan 01 07:30:00 SGT 1970;	Active Connections:0;	total failure count in last (1000) msecs:0;	average resp time:0.0;	90 percentile resp time:0.0;	95 percentile resp time:0.0;	min resp time:0.0;	max resp time:0.0;	stddev resp time:0.0]
]}ServerList:org.springframework.cloud.netflix.ribbon.eureka.DomainExtractingServerList@796cbfab
2020-08-18 18:56:54.611  INFO 8723 --- [erListUpdater-0] c.netflix.config.ChainedDynamicProperty  : Flipping property: PRODUCER-SERVICE.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2020-08-18 19:01:43.804  INFO 8723 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration

```