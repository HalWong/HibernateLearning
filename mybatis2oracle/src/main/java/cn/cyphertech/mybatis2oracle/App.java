package cn.cyphertech.mybatis2oracle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		
		String resource = "mybatis-config.xml";
		
	    File file = new File("/" + resource);
	    System.out.println(file.exists());
	    
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
		
		System.out.println("Hello World!");
	}
}
