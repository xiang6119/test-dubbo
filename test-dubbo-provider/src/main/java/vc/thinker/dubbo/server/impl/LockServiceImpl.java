package vc.thinker.dubbo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import vc.thinker.dubbo.service.LockService;

/**
 * 测试锁相关业务
 * @author ZhangGaoXiang
 * @date   2018年12月13日 下午4:30:13
 */
@Service(timeout=5000,version="1.0")
public class LockServiceImpl implements LockService{
	@Override
	public String findOne(Long id) {
		return "查询一个:" + id;
	}
}
