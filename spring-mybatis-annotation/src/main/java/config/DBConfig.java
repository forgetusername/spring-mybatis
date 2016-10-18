package config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@MapperScan("dao.mapper")
@PropertySource(value = "classpath:db.properties")
public class DBConfig {

	@Value("${mysql.connection.driver}")
	private String driverClass;
	@Value("${mysql.connection.url}")
	private String url;
	@Value("${mysql.connection.username}") 
	private String user; 
	@Value("${mysql.connection.password}")
	private String password;
	
	@Bean(destroyMethod = "")
	public DataSource dataSource() {
		try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			dataSource.setDriverClass(driverClass);
			dataSource.setJdbcUrl(url);
			dataSource.setUser(user);
			dataSource.setPassword(password);
			return dataSource;
		} catch (Exception e) {
			throw new RuntimeException("DataSource initial fail!");
		}
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean;
	}
	
	@Bean
	public SqlSession sqlSession(@Autowired SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	    return new PropertySourcesPlaceholderConfigurer();
	}
}
