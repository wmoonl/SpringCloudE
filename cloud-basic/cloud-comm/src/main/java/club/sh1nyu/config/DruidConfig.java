//package club.sh1nyu.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
///***
// * @date 2019/07/17
// * @author ShenYu
// *
// */
//@Configuration
//public class DruidConfig
//{
//	@Value("${spring.datasource.url}")
//	private String url;
//
//	@Value("${spring.datasource.username}")
//	private String username;
//
//	@Value("${spring.datasource.password}")
//	private String password;
//
//	@Value("${spring.datasource.driver-class-name}")
//	private String driverClassName;
//
//	@Value("${spring.datasource.initialSize}")
//	private int initialSize;
//
//	@Value("${spring.datasource.minIdle}")
//	private int minIdle;
//
//	@Value("${spring.datasource.maxActive}")
//	private int maxActive;
//
//	@Value("${spring.datasource.maxWait}")
//	private int maxWait;
//
//	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//	private int timeBetweenEvictionRunsMillis;
//
//	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
//	private int minEvictableIdleTimeMillis;
//
//	@Value("${spring.datasource.validationQuery}")
//	private String validationQuery;
//
//	@Value("${spring.datasource.testWhileIdle}")
//	private boolean testWhileIdle;
//
//	@Value("${spring.datasource.testOnBorrow}")
//	private boolean testOnBorrow;
//
//	@Value("${spring.datasource.testOnReturn}")
//	private boolean testOnReturn;
//
//	@Value("${spring.datasource.poolPreparedStatements}")
//	private boolean poolPreparedStatements;
//
//	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
//	private int maxPoolPreparedStatementPerConnectionSize;
//
//	@Value("${spring.datasource.filters}")
//	private String filters;
//
//	@Value("${spring.datasource.connectionProperties}")
//	private String connectionProperties;
//
//	@Bean/*(initMethod = "init",destroyMethod = "close")*/
//	@Primary
//	public DataSource dataSource()
//	{
//		DruidDataSource datasource = new DruidDataSource();
//		datasource.setUrl(url);
//		datasource.setUsername(username);
//		datasource.setPassword(password);
//		datasource.setDriverClassName(driverClassName);
//		datasource.setInitialSize(initialSize);
//		datasource.setMinIdle(minIdle);
//		datasource.setMaxActive(maxActive);
//		datasource.setMaxWait(maxWait);
//		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//		datasource.setValidationQuery(validationQuery);
//		datasource.setTestWhileIdle(testWhileIdle);
//		datasource.setTestOnBorrow(testOnBorrow);
//		datasource.setTestOnReturn(testOnReturn);
//		datasource.setPoolPreparedStatements(poolPreparedStatements);
//		datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//		try {
//			datasource.setFilters(filters);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		datasource.setConnectionProperties(connectionProperties);
//		return datasource;
//	}
//
//	@Bean
//	public ServletRegistrationBean<StatViewServlet> DruidStatViewServlet()
//	{
//		ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");
////		白名单：
////		servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
////		IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
////		servletRegistrationBean.addInitParameter("deny", "192.168.1.73");
////		登录查看信息的账号密码.
//		servletRegistrationBean.addInitParameter("loginUsername", "shenyu");
//		servletRegistrationBean.addInitParameter("loginPassword", "shenyu");
////		是否能够重置数据
//		servletRegistrationBean.addInitParameter("resetEnable", "false");
//		return servletRegistrationBean;
//    }
//
//	@Bean
//    public FilterRegistrationBean<WebStatFilter> druidStatFilter() {
//
//		FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>(new WebStatFilter());
//		filterRegistrationBean.addUrlPatterns("/*");
//		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//		return filterRegistrationBean;
//    }
//}