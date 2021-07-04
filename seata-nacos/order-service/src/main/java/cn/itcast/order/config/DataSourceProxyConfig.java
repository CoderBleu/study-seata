// package cn.itcast.order.config;
//
// import com.alibaba.druid.pool.DruidDataSource;
// import io.seata.rm.datasource.DataSourceProxy;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
//
// import javax.sql.DataSource;
//
// /**
//  * @author Blue
//  * @date 2021/6/25
//  **/
// @Configuration
// @ConditionalOnClass(DruidDataSource.class)
// public class DataSourceProxyConfig {
//
//     @Bean
//     @ConfigurationProperties(prefix = "spring.datasource")
//     public DataSource druidDataSource(){
//         DruidDataSource druidDataSource = new DruidDataSource();
//         return druidDataSource;
//     }
//
//     // @Bean
//     // public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//     //     MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//     //     // 代理数据源
//     //     sqlSessionFactoryBean.setDataSource(new DataSourceProxy(dataSource));
//     //     return sqlSessionFactoryBean.getObject();
//     // }
//
//     @Primary
//     @Bean("dataSource")
//     public DataSourceProxy dataSource(DataSource druidDataSource) {
//         return new DataSourceProxy(druidDataSource);
//     }
// }
