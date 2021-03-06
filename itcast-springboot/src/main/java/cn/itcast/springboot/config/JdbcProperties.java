package cn.itcast.springboot.config;

        import com.alibaba.druid.pool.DruidDataSource;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.PropertySource;

        import javax.sql.DataSource;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/25 12:06
 * @modifiedBy：
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties
{
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDriverClassName()
    {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName)
    {
        this.driverClassName = driverClassName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
