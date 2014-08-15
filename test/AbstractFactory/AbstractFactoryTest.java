package AbstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

import AbstractFactory.computor.Computor;
import AbstractFactory.computor.Operator;
import AbstractFactory.record.Designer;
import AbstractFactory.record.Lipstick;
import AbstractFactory.record.MakeupRecordFactory;
import AbstractFactory.record.Record;
import AbstractFactory.record.RecordFactory;
import AbstractFactory.record.SalesRecordFactory;
import AbstractFactory.record.StyleRecord;
import AbstractFactory.record.StyleRecordFactory;

public class AbstractFactoryTest {

	@Test
	public void recordFactoryTest() {
		// 具体消费记录由具体的工厂按照模版产生
		// 比如销售产品的消费记录和美发的销售记录
		// 销售产品的记录包括一个美发员工和一种销售产品
		// 因为无法具体规定销售记录的员工是设计师或者助理，所以销售记录的成员变量是一个StyleEmployee，这也是没有把StyleEmployee定义为抽象的原因
		// Record的接口定义的createRecord有四个参数，为了满足StyleRecord的特性，所以生成销售记录的时候后两个参数传空值
		RecordFactory sf = new SalesRecordFactory();
		Record sales = sf.createRecord("a1", 1, null, null);
		sales.setCommission();
		RecordFactory sf1 = new StyleRecordFactory();
		Record style = sf1.createRecord("d1", 2, "80", "a2");
		style.setCommission();

		StyleRecord sr = (StyleRecord) style;
		Designer d = (Designer) sr.getEmployee();
		

		System.out.println(d.portion);
		
		RecordFactory mf = new MakeupRecordFactory();
		//对于客户来说不再关心record的类型，用户只看到统一接口的公共方法setCommission
		Record makeup = mf.createRecord("dresser", 3, null, null);
		makeup.setCommission();

	}
	
	@Test
	public void computorTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		new Computor().lanch();
	}

}
