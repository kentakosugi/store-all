package jp.co.techmatrix.faces.producer;

import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

@Dependent
public class LoggerProducer{
	@Inject
	private InjectionPoint point;
	
	/**
	 * Logger提供ポイント
	 */
	@Produces
	public Logger getLogger(){
		// InjectionPointからクラス名を取得可能
		return Logger.getLogger(this.point.getMember().getDeclaringClass().getName());
	}
}
