package vc.thinker.dubbo.service;

/**
 * 锁相关服务接口
 * @author ZhangGaoXiang
 * @date 2018年11月30日 下午2:17:08
 */
public interface LockService {

	/**
	 * 单个查询
	 */
	String findOne(Long id);
	
	/**
	 * 列表查询
	 */
	String listByType(Integer type);
	
	/**
	 * 删除一个
	 */
	Boolean delete(Long id);
}
