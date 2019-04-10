package vc.thinker.dubbo.service;

/**
 * 锁相关服务接口
 * @author ZhangGaoXiang
 * @date 2018年11月30日 下午2:17:08
 */
public interface LockService {

	/**
	 * 逐渐查询
	 * @param id
	 * @return
	 */
	String findOne(Long id);
	 
}
