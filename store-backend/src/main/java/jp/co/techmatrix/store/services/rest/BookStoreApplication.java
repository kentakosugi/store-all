package jp.co.techmatrix.store.services.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

/**
 * RESTアプリケーションの設定を実施する。<br/>
 * RESTアプリケーションのBase URLや、Swaggerの設定項目を指定
 * 
 * @author kosugi
 *
 */
@ApplicationPath(BookStoreApplication.APPLICATION_PATH)
public class BookStoreApplication extends Application{
	public final static String VERSION = "v1";
	public final static String APPLICATION_PATH = "/" + VERSION + "/rest";
	
	/**
	 * コンストラクタ
	 * 主にSwaggerの設定を実施する。
	 */
	public BookStoreApplication(){
		// swaggerの設定
	    BeanConfig beanConfig = new BeanConfig(); 
	    
	    beanConfig.setVersion("0.0.1");
	    beanConfig.setSchemes(new String[] {"http"});
	    String hostname = "localhost";
	    
	    beanConfig.setHost(hostname + ":8080");
	    beanConfig.setBasePath("/store-backend" + APPLICATION_PATH);
	    beanConfig.setResourcePackage("jp.co.techmatrix.store.services.rest");
	    beanConfig.setScan(true);
	}

	/**
	 * @see javax.ws.rs.ApplicationPath#getClasses
	 */
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> resources = new HashSet<>();

		// ResourceClassの追加
		resources.add(jp.co.techmatrix.store.services.rest.CartResource.class);

		// Swagger の有効化
		resources.add(ApiListingResource.class);
		resources.add(SwaggerSerializers.class);

		return resources;
	}
}
