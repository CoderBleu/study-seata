// package cn.itcast.storage.config;
//
// import com.alibaba.druid.pool.DruidDataSource;
// import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
// import io.seata.rm.datasource.DataSourceProxy;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
// import javax.sql.DataSource;
//
// /**
//  * @author Blue
//  * @date 2021/6/25
//  **/
// @Configuration
// public class DataSourceProxyConfig {
//
//
//     @Value("${mybatis-plus.mapper-locations}")
//     private String mapperLocations;
//
//     @Bean
//     @ConfigurationProperties(prefix = "spring.datasource")
//     public DataSource druidDataSource() {
//         return new DruidDataSource();
//     }
//
//     @Bean
//     public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//         MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//         sqlSessionFactoryBean.setDataSource(dataSource);
//         sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
//                 .getResources(mapperLocations));
//         sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
//         return sqlSessionFactoryBean.getObject();
//     }
// }
